package cn.itcast.implic

import java.io.File

import scala.io.Source

import MyPredef._

/**
  * Created by Jack Wtf on 20180522.
  */




class RichFile(val f: File) {
  def read() = Source.fromFile(f).mkString
}

object RichFile {
  def main(args: Array[String]) {
    val f = new File("c://words.txt")
    //装饰 ，显示的增强
    //val contents = new RichFile(f).read()
    val contents = f.read()
    println(contents)
  }
}


