package net.mbmedia.web;

import net.mbmedia.ejb.ExampleProvider;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
@RequestScoped
public class ExampleWebService {

    @EJB
    private ExampleProvider exampleProvider;

    @GET
    public String helloWorld(){
        exampleProvider.increment();
        return exampleProvider.getHello();
    }
}
