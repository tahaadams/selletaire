package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.StateManager")
class StateManager extends js.Object {
  def add(key: String, state: js.Any, autoStart: Boolean = js.native): Unit = js.native
  def start(key: String, clearWorld: Boolean = js.native, clearCache: Boolean = js.native, args: js.Any*): Unit = js.native
}
