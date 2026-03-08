package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Sound")
class Sound extends js.Object {
  def play(marker: String = js.native, position: Double = js.native, volume: Double = js.native, loop: Boolean = js.native, forceRestart: Boolean = js.native): Sound = js.native
  def addMarker(name: String, start: Double, duration: Double, volume: Double = js.native, loop: Boolean = js.native): Unit = js.native
}
