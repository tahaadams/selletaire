package phaser.gameplay

import client.Selletaire
import input.{ GamepadHandler, InputMessage, KeyboardHandler }

class InputHelper(gg: Selletaire) {
  new KeyboardHandler(gg.phaser, onInput)
  new GamepadHandler(gg.phaser, onInput)

  def onInput(i: InputMessage): Unit = i match {
    case InputMessage.Sandbox => Selletaire.getActive.onSandbox()
    case InputMessage.ToggleDebug => toggleDebug()
    case InputMessage.ToggleMenu => gg.menu.toggleMenu()
    case InputMessage.Undo => gg.phaser.gameplay.undo()
    case InputMessage.Redo => gg.phaser.gameplay.redo()
    case _ => gg.phaser.gameplay.onInput(i)
  }

  private[this] def toggleDebug() = {
    import util.JQueryCompat.{ jQuery => $ }
    val jq = $(".pdebug")
    if (jq.length == 1) {
      jq.fadeToggle()
    }
  }
}
