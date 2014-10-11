package tddbc4th

class 人(_名字 : String, _名前 : String) {
  val 名字 = if(_名字.replaceAll("^[ ¥t¥r¥n　]*", "").replaceAll("[ ¥t¥r¥n　]*$", "").equals("")) {
    throw RuntimeException()
  } else {
    _名字.replaceAll("^[ ¥t¥r¥n　]*", "").replaceAll("[ ¥t¥r¥n　]*$", "")
  }

  val 名前 = if(_名前.replaceAll("^[ ¥t¥r¥n　]*", "").replaceAll("[ ¥t¥r¥n　]*$", "").equals("")) {
    throw RuntimeException()
  } else {
    _名前.replaceAll("^[ ¥t¥r¥n　]*", "").replaceAll("[ ¥t¥r¥n　]*$", "")
  }

  fun 氏名() : String {
    return 名字 + 名前
  }
}
