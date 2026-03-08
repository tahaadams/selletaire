package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Game")
class Game(config: IGameConfig) extends js.Object {
  var antialias: Boolean = js.native
  val input: InputHandler = js.native
  val add: GameObjectFactory = js.native
  val state: StateManager = js.native
  val scale: ScaleManager = js.native
  val physics: Physics = js.native
  val world: World = js.native
  val time: Time = js.native
  val stage: Stage = js.native
  def width: Double = js.native
  def height: Double = js.native
  val load: Loader = js.native
}
