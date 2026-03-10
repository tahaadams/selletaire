package org.scalajs.jquery

import scala.scalajs.js
import scala.scalajs.js.annotation._

object JQueryGlobal {
  @js.native
  @JSGlobal("jQuery")
  private object jQueryNative extends js.Object {
    def apply(selector: js.Any): JQuery = js.native
    def apply(selector: js.Any, context: js.Any): JQuery = js.native
  }
  def apply(selector: js.Any): JQuery = jQueryNative(selector)
  def apply(selector: js.Any, context: js.Any): JQuery = jQueryNative(selector, context)
}