package tddbc4th

class 人(_名字 : String, _名前 : String) {
  val 名字 = if("" === _名字) { throw RuntimeException() } else { _名字 }
  val 名前 = if("" === _名前) { throw RuntimeException() } else { _名前 }

  fun 氏名() : String {
    return 名字 + 名前
  }
}