package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.SinglePad")
class SinglePad extends js.Object {
  def getButton(buttonCode: Int): DeviceButton = js.native
  def addCallbacks(context: js.Any, callbacks: js.Any): Unit = js.native
}
