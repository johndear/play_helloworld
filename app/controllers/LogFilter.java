//package controllers;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
// 
//import play.api.Logger;
//import play.api.mvc.*;
// 
//import scala.concurrent.Future;
//import scala.concurrent.ExecutionContext.Implicits.global;
// 
//class LogFilter extends Filter{
//  override def apply(action: (RequestHeader) => Future[Result])(request: RequestHeader): Future[Result] = {
//    val t0 = System.currentTimeMillis()
//    val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//    val now = new Date()
//    Logger.info(sdf.format(now) + " [ "+request.path+" request ] -> " +request.remoteAddress+ " " +request.uri)
// 
//    action(request).map { result =>
//      val t1 = System.currentTimeMillis()
//      val cost = t1 - t0
//      Logger.info(sdf.format(now) + " [ "+request.path+" done ] " + cost + " ms " + result.toString())
//      result
//    }
//  }
//}
