package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Tween")
class Tween extends js.Object {
  def to(properties: js.Any, duration: Double = js.native, ease: js.Any = js.native, autoStart: Boolean = js.native, delay: Double = js.native, repeat: Double = js.native, yoyo: Boolean = js.native): Tween = js.native
  def start(): Tween = js.native
  val onComplete: Signal = js.native
}
