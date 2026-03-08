package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

object Particles {
  object Arcade {
    @js.native
    @JSGlobal("Phaser.Particles.Arcade.Emitter")
    class Emitter(_game: js.Any = js.native, _x: Double = js.native, _y: Double = js.native, maxParticles: Int = js.native) extends js.Object {
      def makeParticles(keys: js.Any, frames: js.Any = js.native, quantity: Int = js.native, collide: Boolean = js.native, collideWorldBounds: Boolean = js.native): Emitter = js.native
      var gravity: Double = js.native
      val minParticleSpeed: Point = js.native
      val maxParticleSpeed: Point = js.native
      def setAlpha(min: Double, max: Double, rate: Double = js.native, ease: js.Any = js.native, yoyo: Boolean = js.native): Unit = js.native
      def setScale(minX: Double, maxX: Double, minY: Double, maxY: Double, rate: Double = js.native, ease: js.Any = js.native, yoyo: Boolean = js.native): Unit = js.native
      var emitX: Double = js.native
      var emitY: Double = js.native
      def start(explode: Boolean, lifespan: Double = js.native, frequency: Double = js.native, quantity: Int = js.native, forceQuantity: Boolean = js.native): Unit = js.native
    }
  }
}
