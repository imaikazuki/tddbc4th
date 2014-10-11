/**
 * Created by kazuki on 10/11/14.
 */

package tddbc4th

import org.junit.Test as test
import kotlin.test.assertEquals
import tddbc4th.人

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

}