package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("Phaser.Physics")
class Physics extends js.Object {
  def startSystem(system: Int): Unit = js.native
  val arcade: js.Dynamic = js.native
}

@js.native
@JSGlobal("Phaser.Physics")
object PhysicsObj extends js.Object {
  val ARCADE: Int = js.native
}
