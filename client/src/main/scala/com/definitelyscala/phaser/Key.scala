package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Key")
class Key extends js.Object {
  val onDown: Signal = js.native
  val onUp: Signal = js.native
  var isDown: Boolean = js.native
}
