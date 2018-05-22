package cn.itcast.implic

import java.io.File

/**
  * Created by Jack Wtf on 20180522.
  */
object MyPredef {
  implicit def fileToRichFile(f: File) = new RichFile(f)
}
