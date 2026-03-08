package org.scalajs.jquery

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom

@js.native
trait JQueryEventObject extends js.Object {
  val currentTarget: dom.Element = js.native
  val which: Int = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

@js.native
trait JQuery extends js.Object {
  def click(handler: js.Function1[JQueryEventObject, Any]): JQuery = js.native
  def change(handler: js.Function1[JQueryEventObject, Any]): JQuery = js.native
  def keyup(handler: js.Function1[JQueryEventObject, Any]): JQuery = js.native
  def each(handler: js.Function1[dom.Element, Any]): JQuery = js.native
  def map(handler: js.Function1[dom.Element, Any]): JQuery = js.native
  def text(text: String): JQuery = js.native
  def text(): String = js.native
  def attr(name: String): String = js.native
  def attr(name: String, value: String): JQuery = js.native
  def show(): JQuery = js.native
  def hide(): JQuery = js.native
  def html(): String = js.native
  def html(value: String): JQuery = js.native
  def length: Int = js.native
  def addClass(className: String): JQuery = js.native
  def removeClass(className: String): JQuery = js.native
  def fadeIn(duration: js.Any = js.native): JQuery = js.native
  def fadeOut(duration: js.Any = js.native): JQuery = js.native
}

object jQuery {
  @js.native
  @JSGlobal("jQuery")
  private object jq extends js.Object {
    def apply(selector: js.Any): JQuery = js.native
  }
  def apply(selector: js.Any): JQuery = jq(selector)
}
