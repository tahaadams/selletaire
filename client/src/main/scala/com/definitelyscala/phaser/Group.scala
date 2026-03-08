package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Group")
class Group(_game: js.Any = js.native, _parent: js.Any = js.native, _name: String = js.native, _addToStage: Boolean = js.native, _enableBody: Boolean = js.native, _physicsBodyType: Int = js.native) extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var scale: Point = js.native
  var position: Point = js.native
  var length: Int = js.native
  val game: Game = js.native
  var name: String = js.native
  var enableBody: Boolean = js.native
  def add(child: js.Any): js.Dynamic = js.native
  def remove(child: js.Any, destroy: Boolean = js.native, silent: Boolean = js.native): Boolean = js.native
  def bringToTop(child: js.Any): js.Dynamic = js.native
  def destroy(destroyChildren: Boolean = js.native, soft: Boolean = js.native): Unit = js.native
  def create(_x: Double, _y: Double, key: js.Any, frame: js.Any = js.native, exists: Boolean = js.native): js.Dynamic = js.native
}
