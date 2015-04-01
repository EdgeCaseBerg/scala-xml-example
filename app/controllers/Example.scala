package controllers 

import play.api._
import play.api.mvc._

object Example extends Controller {

	def index = Action {
		Ok(views.xml.index(models.TestInfo.getData))
	}

}
