package tddbc4th

class 人(_名字 : String, _名前 : String, _性別 : 性別型) {
  val 名字 = if(myTrim(_名字).equals("")) { throw RuntimeException() } else { myTrim(_名字) }
  val 名前 = if(myTrim(_名前).equals("")) { throw RuntimeException() } else { myTrim(_名前) }
  val 性別 = _性別

  fun 氏名() : String {
    return 名字 + 名前
  }
}

fun myTrim(str : String) : String {
  return str.replaceAll("^[ ¥t¥r¥n　]*", "").replaceAll("[ ¥t¥r¥n　]*$", "")
}

enum class 性別型 {
  男性
  女性
}