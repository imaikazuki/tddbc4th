package tddbc4th

import java.util.regex.Pattern

class 人(_名字 : String, _名前 : String, _性別 : 性別型) {
  val 名字 = if(myTrim(_名字).equals("")) { throw RuntimeException() } else { myTrim(_名字) }
  val 名前 = if(myTrim(_名前).equals("")) { throw RuntimeException() } else { myTrim(_名前) }
  val 性別 = _性別

  fun 氏名() : String {
    return 名字 + 名前
  }

  fun 結婚できるかな(相手 : 人) : Boolean {
    return 性別 != 相手.性別
  }
}

val headBlankPattern = Pattern.compile("^[ ¥t¥r¥n　]*")
val tailBlankPattern = Pattern.compile("[ ¥t¥r¥n　]*$")

fun myTrim(str : String) : String {
  return tailBlankPattern.matcher(headBlankPattern.matcher(str).replaceAll("")).replaceAll("")
}

enum class 性別型 {
  男性
  女性
}
