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
}