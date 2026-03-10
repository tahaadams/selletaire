package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

object Particles {
  object Arcade {
    @js.native
    @JSGlobal("Phaser.Particles.Arcade.Emitter")
    class Emitter(_game: js.Any, _emitX: Double, _emitY: Double, _maxParticles: Int) extends js.Object {
      var gravity: Double = js.native
      val minParticleSpeed: Point = js.native
      val maxParticleSpeed: Point = js.native
      var emitX: Double = js.native
      var emitY: Double = js.native
      def makeParticles(key: String, frame: Int): Unit = js.native
      def setAlpha(min: Double, max: Double, rate: Double): Unit = js.native
      def setScale(minX: Double, maxX: Double, minY: Double, maxY: Double, rate: Double): Unit = js.native
      def start(explode: Boolean, lifespan: Int, frequency: Int, quantity: Int): Unit = js.native
    }
  }
}
