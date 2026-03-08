package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.BitmapData")
class BitmapData extends js.Object {
  def draw(source: js.Any, x: Double = js.native, y: Double = js.native, width: Double = js.native, height: Double = js.native): BitmapData = js.native
  def fill(r: Double, g: Double, b: Double, a: Double = js.native): BitmapData = js.native
  def alphaMask(source: js.Any, mask: js.Any = js.native): BitmapData = js.native
}
