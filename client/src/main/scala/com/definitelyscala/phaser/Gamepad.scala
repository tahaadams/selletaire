package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Gamepad")
object Gamepad extends js.Object {
  val XBOX360_START: Int = js.native
  val XBOX360_A: Int = js.native
  val XBOX360_B: Int = js.native
  val XBOX360_X: Int = js.native
  val XBOX360_Y: Int = js.native
  val XBOX360_DPAD_LEFT: Int = js.native
  val XBOX360_DPAD_RIGHT: Int = js.native
  val XBOX360_DPAD_UP: Int = js.native
  val XBOX360_DPAD_DOWN: Int = js.native
}

@js.native
@JSGlobal("Phaser.Gamepad")
class GamepadManager extends js.Object {
  def start(): Unit = js.native
  val pad1: SinglePad = js.native
  val pad2: SinglePad = js.native
}
