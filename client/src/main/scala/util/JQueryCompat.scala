package util

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation._

object JQueryCompat {

  @js.native
  trait JQuery extends js.Object {
    def length: Int = js.native
    def html(): String = js.native
    def html(s: String): JQuery = js.native
    def text(): String = js.native
    def text(s: String): JQuery = js.native
    def click(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
    def change(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
    def keyup(handler: js.Function1[JQueryEventObject, js.Any]): JQuery = js.native
    def each(func: js.ThisFunction0[dom.Element, js.Any]): JQuery = js.native
    def map(func: js.ThisFunction0[dom.Element, js.Any]): JQuery = js.native
    def data(key: String): js.Any = js.native
    def attr(key: String): String = js.native
    def attr(key: String, value: String): JQuery = js.native
    def prop(name: String, value: js.Any): JQuery = js.native
    @JSName("val") def value(): String = js.native
    @JSName("val") def value(v: String): JQuery = js.native
    def fadeIn(duration: Int): JQuery = js.native
    def fadeOut(duration: Int): JQuery = js.native
    def fadeToggle(): JQuery = js.native
    def show(): JQuery = js.native
    def hide(): JQuery = js.native
    def addClass(cls: String): JQuery = js.native
    def removeClass(cls: String): JQuery = js.native
    def hasClass(cls: String): Boolean = js.native
    def remove(): JQuery = js.native
    def appendTo(element: dom.Element): JQuery = js.native
  }

  @js.native
  trait JQueryEventObject extends js.Object {
    val currentTarget: dom.Element = js.native
    val which: Int = js.native
  }

  @js.native
  @JSGlobal("jQuery")
  object jQuery extends js.Object {
    def apply(selector: String): JQuery = js.native
    def apply(element: dom.Element): JQuery = js.native
    def apply(selector: String, context: JQuery): JQuery = js.native
  }
}
