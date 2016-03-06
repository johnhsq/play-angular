package controllers;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by huang on 3/5/16.
 * allow particular back-end calls only to authenticated users
 * We will use this class later to protect new actions
 */
public class Secured extends Security.Authenticator {

  @Override
  public String getUsername(Http.Context ctx) {
    return ctx.session().get("username");
  }

  @Override
  public Result onUnauthorized(Http.Context ctx) {
    return unauthorized();
  }
}
