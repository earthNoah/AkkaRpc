package cn.itcast.func

/**
  * Created by Jack Wtf on 20180522.
  */
object HighFunc {

  val func: Int => Int = {x => x * x}

  def multiply(x: Int) : Int = x * x

  def m1(x: Int)(y: Int) = x * y

  def m2(x: Int) = (y: Int) => x * y

  def multi() = (x: Int) => {
    x * x
  }

  def main(args: Array[String]) {
    val arr = Array(1,2,3,4,5)

    val a1 = arr.map(multi())

    println(a1.toBuffer)

  }
}
