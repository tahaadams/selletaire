package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Keyboard")
object Keyboard extends js.Object {
  val H: Int = js.native
  val Z: Int = js.native
  val Y: Int = js.native
  val ESC: Int = js.native
  val QUESTION_MARK: Int = js.native
  val X: Int = js.native
  val UP: Int = js.native
  val DOWN: Int = js.native
  val LEFT: Int = js.native
  val RIGHT: Int = js.native
  val SPACEBAR: Int = js.native
}

@js.native
@JSGlobal("Phaser.Keyboard")
class KeyboardManager extends js.Object {
  def addKey(keycode: Int): Key = js.native
  def addKeyCapture(keycode: js.Any): Unit = js.native
  def createCursorKeys(): CursorKeys = js.native
  def isDown(keycode: Int): Boolean = js.native
}
