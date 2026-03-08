package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.State")
class State extends js.Object {
  val game: Game = js.native
  def preload(): Unit = js.native
  def create(): Unit = js.native
  def update(): Unit = js.native
}
