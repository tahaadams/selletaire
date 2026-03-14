package controllers

import java.net.URL

import play.api.i18n.Messages
import util.Application

import scala.concurrent.Future

@javax.inject.Singleton
class MessagesController @javax.inject.Inject() (override val app: Application) extends BaseController {
  private[this] def parseMsgs(url: URL) = Messages.parse(Messages.UrlMessageSource(url), url.toString).fold(e => throw e, identity).toSeq.sortBy(_._1)

  private[this] lazy val enMsgs = {
    val filename = "client/messages"
    val resource = Option(getClass.getClassLoader.getResource(filename)) match {
      case Some(r) => r
      case None => throw new IllegalStateException("Missing [client/messages].")
    }
    parseMsgs(resource)
  }

  private[this] val enResponse = {
    val vals = enMsgs.map { m =>
      s""""${m._1}": "${m._2.replaceAllLiterally("\"", "\\\"")}""""
    }.mkString(",\n  ")
    s"""window.messages = {\n  $vals\n}"""
  }

  def strings(l: Option[String]) = req("strings") { implicit request =>
    Future.successful(Ok(enResponse).as("application/javascript"))
  }
}
