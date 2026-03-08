package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Loader")
class Loader extends js.Object {
  def audio(key: String, urls: js.Any, autoDecode: Boolean = js.native): Loader = js.native
  def image(key: String, url: String, overwrite: Boolean = js.native): Loader = js.native
  def spritesheet(key: String, url: String, frameWidth: Double, frameHeight: Double, frameMax: Int = js.native, margin: Int = js.native, spacing: Int = js.native): Loader = js.native
  def setPreloadSprite(sprite: js.Any, direction: Int = js.native): Unit = js.native
  val onFileComplete: Signal = js.native
}
