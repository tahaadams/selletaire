package util.web

import javax.inject.Inject

import play.api.http._
import play.api.mvc.RequestHeader
import play.api.routing.Router
import util.Logging

class RequestHandler @Inject() (
  webCommands: play.core.WebCommands,
  errorHandler: HttpErrorHandler,
  configuration: HttpConfiguration,
  filters: HttpFilters,
  router: Router) extends DefaultHttpRequestHandler(
  webCommands,
  None,
  () => router,
  errorHandler,
  configuration,
  filters.filters) with Logging {

  override def routeRequest(request: RequestHeader) = {
    if (!Option(request.path).exists(_.startsWith("/assets"))) {
      log.info(s"Request from [${request.remoteAddress}]: ${request.toString()}")
    }
    super.routeRequest(request)
  }
}
