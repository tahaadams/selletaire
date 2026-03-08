package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Sprite")
class Sprite(_game: js.Any, _x: Double, _y: Double, key: js.Any = js.native, frame: js.Any = js.native) extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var angle: Double = js.native
  var scale: Point = js.native
  val anchor: Point = js.native
  var name: String = js.native
  var inputEnabled: Boolean = js.native
  val events: Events = js.native
  var tint: Double = js.native
  var alpha: Double = js.native
  var position: Point = js.native
  val game: Game = js.native
  var body: js.Dynamic = js.native
  val animations: AnimationManager = js.native
  var visible: Boolean = js.native
  def bringToTop(): Unit = js.native
  def loadTexture(key: js.Any, frame: js.Any = js.native): Unit = js.native
  def destroy(destroyChildren: Boolean = js.native): Unit = js.native
  def update(): Unit = js.native
  def kill(): Sprite = js.native
}
