package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Point")
class Point(var x: Double = js.native, var y: Double = js.native) extends js.Object {
  def setTo(x: Double, y: Double): Point = js.native
  def set(x: Double, y: Double): Point = js.native
}
