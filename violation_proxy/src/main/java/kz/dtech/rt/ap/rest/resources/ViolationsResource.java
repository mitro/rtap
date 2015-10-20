package kz.dtech.rt.ap.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * @author Dmitriy Melnik (d.b.melnik@yandex.ru) on 20.10.15.
 */
@Path("/violations")
@Produces(APPLICATION_JSON)
public class ViolationsResource {

  @GET
  @Path("/")
  public String getViolations() {
    return "Hello!";
  }
}
