package client

import org.scalajs.dom
import org.scalajs.dom.BeforeUnloadEvent
import settings.ThemeService
import util.{ Logging, NullUtils }

import scala.scalajs.js

trait InitHelper { this: SolitaireGG =>
  protected[this] def init() = {
    Logging.init(debug = debug)
    Logging.info("Solitaire.gg, v2.0.0")
    org.scalajs.dom.window.asInstanceOf[js.Dynamic].PhaserGlobal = js.Dynamic.literal("hideBanner" -> true)

    dom.window.onbeforeunload = (_: BeforeUnloadEvent) => {
      game match {
        case Some(_) => NullUtils.inst // TODO "You're playing a game. Are you sure you'd like to resign?"
        case _ => NullUtils.inst
      }
    }

    ThemeService.applyColorAndPattern(settings.getSettings.backgroundColor, settings.getSettings.backgroundPattern)

    phaser.start()
  }
}
