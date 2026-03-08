package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.GameObjectFactory")
class GameObjectFactory extends js.Object {
  def tween(obj: js.Any): Tween = js.native
  def audio(key: String, volume: Double = js.native, loop: Boolean = js.native): Sound = js.native
  def bitmapData(width: Double = js.native, height: Double = js.native, key: String = js.native, addToCache: Boolean = js.native): BitmapData = js.native
  def existing(obj: js.Any): js.Dynamic = js.native
  def group(parent: js.Any = js.native, name: String = js.native, addToStage: Boolean = js.native, enableBody: Boolean = js.native, physicsBodyType: Int = js.native): Group = js.native
  def plugin(plugin: js.Any, args: js.Any*): js.Dynamic = js.native
  def sprite(x: Double, y: Double, key: js.Any = js.native, frame: js.Any = js.native): Sprite = js.native
}
