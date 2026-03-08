package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.AnimationManager")
class AnimationManager extends js.Object {
  def add(name: String, frames: js.Any = js.native, frameRate: Double = js.native, loop: Boolean = js.native, useNumericIndex: Boolean = js.native): js.Dynamic = js.native
  def play(name: String, frameRate: Double = js.native, loop: Boolean = js.native, killOnComplete: Boolean = js.native): js.Dynamic = js.native
}
