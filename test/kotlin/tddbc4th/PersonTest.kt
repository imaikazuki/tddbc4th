package tddbc4th

import org.junit.Test as test
import kotlin.test.assertEquals
import tddbc4th.人
import kotlin.test.fail

class 人Test {
  test fun 名字Test() {
    val 佐藤 = 人("佐藤", "ほげほげ")
    assertEquals("佐藤", 佐藤.名字)
  }

  test fun 名前Test() {
    val 太郎 = 人("ぴよぴよ", "太郎")
    assertEquals("太郎", 太郎.名前)
  }

  test fun 氏名Test() {
    val 佐藤太郎 = 人("佐藤", "太郎")
    assertEquals("佐藤太郎", 佐藤太郎.氏名())
  }

  test fun 違う人の氏名Test() {
    val 鈴木一郎 = 人("鈴木", "一郎")
    assertEquals("鈴木一郎", 鈴木一郎.氏名())
  }

  test fun 名字が空であれば例外Test() {
    // 言語レベルで引数にNULLが入りません
    try {
      val person = 人("", "ほげほげ")
      fail("名字が空でもインスタンスが返された")
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名前が空であれば例外Test() {
    // 言語レベルで引数にNULLが入りません
    try {
      val person = 人("ほげほげ", "")
      fail("名前が空でもインスタンスが返された")
    } catch ( e: RuntimeException ) {
    }
  }

  test fun 名字が空白文字のみであれば例外Test() {
    try {
      val person = 人(" ¥t¥n¥r　", "ほげほげ")
      fail("名字が空白文字でもインスタンスが返された")
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名字の字の間に空白文字入ってる人はゆるすTest() {
    try {
      val person = 人("今 ¥t¥n¥r　井", "ほげほげ")
      assertEquals("今 ¥t¥n¥r　井", person.名字)
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名前が空白文字のみであれば例外Test() {
    try {
      val person = 人("あれこれ", " ¥t¥n¥r　")
      fail("名前が空白文字でもインスタンスが返された")
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名前の字の間に空白文字入ってる人はゆるすTest() {
    try {
      val person = 人("あれこれ", "太 ¥t¥n¥r　郎")
      assertEquals("太 ¥t¥n¥r　郎", person.名前)
    } catch ( e : RuntimeException ) {
    }
  }
}
