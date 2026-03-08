package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Signal")
class Signal extends js.Object {
  def add(listener: js.Any, listenerContext: js.Any = js.native, priority: Double = js.native, args: js.Any*): SignalBinding = js.native
}

@js.native
@JSGlobal("Phaser.SignalBinding")
class SignalBinding extends js.Object
