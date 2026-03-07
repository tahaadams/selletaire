package com.definitelyscala.phaser

import scala.scalajs.js
import scala.scalajs.js.annotation._

// ---- Type-only traits (no @JSGlobal — returned by Phaser, never directly constructed) ----

@js.native
trait IGameConfig extends js.Object

@js.native
trait PluginObj extends js.Object

@js.native
trait Signal extends js.Object {
  def add(callback: js.Function, context: js.Any = js.native, priority: Double = js.native): Unit = js.native
}

@js.native
trait AnchorPoint extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
trait Events extends js.Object {
  val onInputDown: Signal = js.native
  val onInputUp: Signal = js.native
}

@js.native
trait Key extends js.Object {
  val onDown: Signal = js.native
}

@js.native
trait DeviceButton extends js.Object {
  val onDown: Signal = js.native
}

@js.native
trait KeyboardManager extends js.Object {
  def addKey(keyCode: Int): Key = js.native
}

@js.native
trait SinglePad extends js.Object {
  def getButton(buttonCode: Int): DeviceButton = js.native
  def addCallbacks(context: js.Any, callbacks: js.Dynamic): Unit = js.native
}

@js.native
trait GamepadManager extends js.Object {
  def start(): Unit = js.native
  val pad1: SinglePad = js.native
  val pad2: SinglePad = js.native
}

@js.native
trait InputManager extends js.Object {
  val keyboard: KeyboardManager = js.native
  val gamepad: GamepadManager = js.native
  val x: Double = js.native
  val y: Double = js.native
}

@js.native
trait Tween extends js.Object {
  def to(properties: js.Any, duration: Double, ease: js.Any = js.native, autoStart: Boolean = js.native, delay: Double = js.native, repeat: Double = js.native, yoyo: Boolean = js.native): Tween = js.native
  def start(): Tween = js.native
  val onComplete: Signal = js.native
}

@js.native
trait Sound extends js.Object {
  def addMarker(name: String, start: Double, duration: Double): Unit = js.native
  def play(marker: String = js.native): Unit = js.native
}

@js.native
trait GameObjectFactory extends js.Object {
  def tween(target: js.Any): Tween = js.native
  def audio(key: String): Sound = js.native
  def bitmapData(width: Double, height: Double): BitmapData = js.native
  def existing(group: js.Any): Unit = js.native
  def group(): Group = js.native
  def plugin(plugin: PluginObj): Unit = js.native
}

@js.native
trait Loader extends js.Object {
  def audio(key: String, urls: js.Any): Unit = js.native
  def image(key: String, url: String): Unit = js.native
  def spritesheet(key: String, url: String, frameWidth: Double, frameHeight: Double): Unit = js.native
}

@js.native
trait StateManager extends js.Object {
  def add(key: String, state: js.Any): Unit = js.native
  def start(key: String, clearWorld: Boolean = js.native, clearCache: Boolean = js.native): Unit = js.native
}

@js.native
trait World extends js.Object {
  val width: Double = js.native
  val height: Double = js.native
}

@js.native
trait PhysicsSystem extends js.Object {
  def startSystem(system: Int): Unit = js.native
}

@js.native
trait Stage extends js.Object {
  var disableVisibilityChange: Boolean = js.native
}

@js.native
trait Time extends js.Object {
  var advancedTiming: Boolean = js.native
  val now: Double = js.native
}

@js.native
trait Pointer extends js.Object {
  val button: js.Any = js.native
  val positionDown: Point = js.native
  val positionUp: Point = js.native
  val x: Double = js.native
  val y: Double = js.native
}

// ---- Constructable @js.native classes ----

@js.native
@JSGlobal("Phaser.Game")
class Game(config: IGameConfig) extends js.Object {
  var antialias: Boolean = js.native
  val input: InputManager = js.native
  val add: GameObjectFactory = js.native
  val state: StateManager = js.native
  val scale: ScaleManager = js.native
  val physics: PhysicsSystem = js.native
  val world: World = js.native
  val time: Time = js.native
  val stage: Stage = js.native
  val load: Loader = js.native
  val width: Double = js.native
  val height: Double = js.native
}

@js.native
@JSGlobal("Phaser.State")
class State extends js.Object {
  var game: Game = js.native
  def preload(): Unit = js.native
  def create(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSGlobal("Phaser.Sprite")
class Sprite(_game: js.Any, _x: Double = js.native, _y: Double = js.native, _key: js.Any = js.native, _frame: Int = js.native) extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var angle: Double = js.native
  var scale: Point = js.native
  var anchor: AnchorPoint = js.native
  var name: String = js.native
  var inputEnabled: Boolean = js.native
  val events: Events = js.native
  var tint: Double = js.native
  var alpha: Double = js.native
  var position: Point = js.native
  val game: Game = js.native
  def bringToTop(): Unit = js.native
  def loadTexture(tex: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSGlobal("Phaser.Group")
class Group(_game: js.Any, _parent: js.Any = js.native, _name: String = js.native) extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var scale: Point = js.native
  var position: Point = js.native
  val game: Game = js.native
  var name: String = js.native
  def add(child: js.Any): Unit = js.native
  def remove(child: js.Any): Unit = js.native
  def bringToTop(child: js.Any): Unit = js.native
  def destroy(destroyChildren: Boolean = js.native): Unit = js.native
}

@js.native
@JSGlobal("Phaser.Image")
class Image(_game: js.Any, _x: Double, _y: Double, _key: String, _frame: Int) extends js.Object {
  var anchor: AnchorPoint = js.native
  var angle: Double = js.native
}

@js.native
@JSGlobal("Phaser.BitmapData")
class BitmapData extends js.Object {
  def draw(source: js.Any, x: Double, y: Double, width: Double = js.native, height: Double = js.native): Unit = js.native
  def fill(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def alphaMask(source: BitmapData, mask: js.Any): Unit = js.native
}

@js.native
@JSGlobal("Phaser.Point")
class Point(var x: Double = js.native, var y: Double = js.native) extends js.Object {
  def setTo(x: Double, y: Double): Unit = js.native
}

@js.native
@JSGlobal("Phaser.ScaleManager")
class ScaleManager extends js.Object {
  var scaleMode: Int = js.native
  def setGameSize(width: Double, height: Double): Unit = js.native
  var isFullScreen: Boolean = js.native
  def startFullScreen(antialias: Boolean = js.native): Unit = js.native
  def stopFullScreen(): Unit = js.native
}

@js.native
@JSGlobal("Phaser.ScaleManager")
object ScaleManager extends js.Object {
  val NO_SCALE: Int = js.native
}

@js.native
@JSGlobal("Phaser.Physics")
object PhysicsObj extends js.Object {
  val ARCADE: Int = js.native
}

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
@JSGlobal("Phaser.Gamepad")
object Gamepad extends js.Object {
  val XBOX360_START: Int = js.native
  val XBOX360_A: Int = js.native
  val XBOX360_B: Int = js.native
  val XBOX360_DPAD_LEFT: Int = js.native
  val XBOX360_DPAD_RIGHT: Int = js.native
  val XBOX360_DPAD_UP: Int = js.native
  val XBOX360_DPAD_DOWN: Int = js.native
}

// Scala-side constant object — AUTO = 0 in Phaser 2 CE
object Phaser {
  val AUTO: Int = 0
}
