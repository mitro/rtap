package kz.dtech.rt.ap.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Dmitriy Melnik (d.b.melnik@yandex.ru)
 * @since 03.09.2015
 */
@Path("/")
public class HelloResource {
    @GET
    @Path("/hello")
    public String hello() {
        return "Hello, world!";
    }
}
