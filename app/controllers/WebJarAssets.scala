package controllers

import play.api.mvc.Action
import play.api.mvc.AnyContent

object WebJarAssets {
  
  val WEBJARS_PATH_PREFIX = "META-INF/resources/webjars"

  def at(file: String): Action[AnyContent] = {
    Assets.at("/" + WEBJARS_PATH_PREFIX, file)
  }

}