package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.ScaleManager")
class ScaleManager extends js.Object {
  var scaleMode: Int = js.native
  def setGameSize(width: Double, height: Double): Unit = js.native
  var isFullScreen: Boolean = js.native
  def startFullScreen(): Unit = js.native
  def stopFullScreen(): Unit = js.native
}

object ScaleManager {
  @js.native
  @JSGlobal("Phaser.ScaleManager.NO_SCALE")
  val NO_SCALE: Int = js.native
}
