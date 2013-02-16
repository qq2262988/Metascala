package svm.model


object TypeDesc{

  type B = Byte
  type C = Char
  type I = Int
  type J = Long
  type F = Float
  type D = Double
  type S = Short
  type Z = Boolean
  type L = Object

  def read(s: String): TypeDesc = {
    val Array(argString, ret) = s.drop(1).split("\\)")
    var args = Seq[String]()
    var index = 0
    while(index < argString.length){
      val firstChar = argString.indexWhere(x => "BCDFIJSZL".contains(x), index)
      val split = argString(firstChar) match{
        case 'L' => argString.indexWhere(x => ";".contains(x), index)
        case _ => argString.indexWhere(x => "BCDFIJSZ".contains(x), index)
      }

      args = args :+ argString.substring(index, split+1)
      index = split +1
    }
    TypeDesc(args, ret)
  }
}

case class TypeDesc(args: Seq[String], ret: String)