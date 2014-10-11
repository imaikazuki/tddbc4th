package tddbc4th

import org.junit.Test as test
import kotlin.test.assertEquals
import tddbc4th.人
import kotlin.test.fail

class 人Test {
  test fun 名字Test() {
    val 佐藤 = 人("佐藤", "ほげほげ", 性別型.男性)
    assertEquals("佐藤", 佐藤.名字)
  }

  test fun 名前Test() {
    val 太郎 = 人("ぴよぴよ", "太郎", 性別型.男性)
    assertEquals("太郎", 太郎.名前)
  }

  test fun 氏名Test() {
    val 佐藤太郎 = 人("佐藤", "太郎", 性別型.男性)
    assertEquals("佐藤太郎", 佐藤太郎.氏名())
  }

  test fun 違う人の氏名Test() {
    val 鈴木一郎 = 人("鈴木", "一郎", 性別型.男性)
    assertEquals("鈴木一郎", 鈴木一郎.氏名())
  }

  test fun 名字が空であれば例外Test() {
    // 言語レベルで引数にNULLが入りません
    try {
      val person = 人("", "ほげほげ", 性別型.男性)
      fail("名字が空でもインスタンスが返された")
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名前が空であれば例外Test() {
    // 言語レベルで引数にNULLが入りません
    try {
      val person = 人("ほげほげ", "", 性別型.男性)
      fail("名前が空でもインスタンスが返された")
    } catch ( e: RuntimeException ) {
    }
  }

  test fun 名字が空白文字のみであれば例外Test() {
    try {
      val person = 人(" ¥t¥n¥r　", "ほげほげ", 性別型.男性)
      fail("名字が空白文字でもインスタンスが返された")
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名字の字の間に空白文字入ってる人はゆるすTest() {
    try {
      val person = 人("今 ¥t¥n¥r　井", "ほげほげ", 性別型.男性)
      assertEquals("今 ¥t¥n¥r　井", person.名字)
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名前が空白文字のみであれば例外Test() {
    try {
      val person = 人("あれこれ", " ¥t¥n¥r　", 性別型.男性)
      fail("名前が空白文字でもインスタンスが返された")
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 名前の字の間に空白文字入ってる人はゆるすTest() {
    try {
      val person = 人("あれこれ", "太 ¥t¥n¥r　郎", 性別型.男性)
      assertEquals("太 ¥t¥n¥r　郎", person.名前)
    } catch ( e : RuntimeException ) {
    }
  }

  test fun 文字列の前後にある空白などを除外するTest() {
    assertEquals("空白を含まない文字列", myTrim("空白を含まない文字列"))
    assertEquals("先頭にスペースを含む文字列", myTrim(" 先頭にスペースを含む文字列"))
    assertEquals("先頭に空白を含む文字列", myTrim("　先頭に空白を含む文字列"))
    assertEquals("先頭にtabを含む文字列", myTrim("¥t先頭にtabを含む文字列"))
    assertEquals("先頭に改行を含む文字列", myTrim("¥n先頭に改行を含む文字列"))
    assertEquals("先頭にキャリッジを含む文字列", myTrim("¥r先頭にキャリッジを含む文字列"))
  }

  test fun 男性を作れるTest() {
    val person = 人("名字", "名前", 性別型.男性)
    assertEquals(性別型.男性, person.性別)
  }

  test fun 女性を作れるTest() {
    val person = 人("名字", "名前", 性別型.女性)
    assertEquals(性別型.女性, person.性別)
  }
}
