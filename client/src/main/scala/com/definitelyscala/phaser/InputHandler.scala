package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Input")
class InputHandler extends js.Object {
  val keyboard: KeyboardManager = js.native
  val gamepad: GamepadManager = js.native
  var x: Double = js.native
  var y: Double = js.native
}
