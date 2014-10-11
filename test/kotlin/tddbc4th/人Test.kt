/**
 * Created by kazuki on 10/11/14.
 */

package tddbc4th

import org.junit.Test as test
import kotlin.test.assertEquals
import tddbc4th.人

class 人Test {
  test fun 名字Test() {
    val 佐藤 = 人("佐藤")
    assertEquals("佐藤", 佐藤.名字)
  }
}