package net.mbmedia.ejb;

import javax.ejb.Stateless;

@Stateless
public class ExampleProvider {

    private int zaehler = 0;

    public String getHello(){
        return "Hello from a EJB: " + zaehler;
    }

    public void increment(){
        this.zaehler++;
    }
}
