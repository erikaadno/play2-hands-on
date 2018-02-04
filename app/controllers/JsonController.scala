/**
  * Created by erika.ando on 2018/02/04.
  */

package controllers

import play.api.mvc._

import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.db.slick._
import slick.driver.JdbcProfile
import models.Tables._
import javax.inject.Inject
import scala.concurrent.Future
import slick.driver.H2Driver.api._

import play.api.libs.json._
import play.api.libs.functional.syntax._

class JsonController @Inject()(val dbConfigProvider: DatabaseConfigProvider) extends Controller
  with HasDatabaseConfigProvider[JdbcProfile] {

  /**
    * 一覧表示
    */
  def list = TODO

  /**
    * ユーザ登録
    */
  def create = TODO

  /**
    * ユーザ更新
    */
  def update = TODO

  /**
    * ユーザ削除
    */
  def remove(id: Long) = TODO
}