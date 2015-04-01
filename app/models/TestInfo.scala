package models

import play.api._
import play.api.mvc._

case class TestInfo(id: Int, name: String, days: List[String])

object TestInfo {
	def getData : List[TestInfo] = {
		List(
			TestInfo(1, "First", List("Monday","Tuesday")),
			TestInfo(2, "First", List("Wednesday","Thursday")),
			TestInfo(3, "First", List("Monday","Friday")),
			TestInfo(4, "First", List("Saturday","Sunday")),
			TestInfo(5, "First", List()),
			TestInfo(6, "First", List("Tuesday"))
		)
	}
}
