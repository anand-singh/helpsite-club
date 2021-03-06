package controllers

import javax.inject._

import domains.Page
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index(page: String = "home") = Action {
    Page.withName(page) match {
      case Page.HOME => Ok(views.html.pages.home.index("Home"))
      case Page.KNOWLEDGE => Ok(views.html.pages.knowledge.index("Knowledge"))
      case Page.BUSINESS => Ok(views.html.pages.business.index("Business"))
      case Page.FORUM => Ok(views.html.pages.forum.index("Forum"))
      case Page.HIRING => Ok(views.html.pages.hiring.index("Hiring"))
    }
  }

}
