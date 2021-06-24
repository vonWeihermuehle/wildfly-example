package net.mbmedia.web;


import net.mbmedia.ejb.ExampleProvider;
import org.junit.Before;
import org.junit.Test;

import javax.ejb.EJB;

public class ExampleWebServiceTest {

    @EJB
    private ExampleProvider exampleProvider;

    @Before
    public void setUp() {
        exampleProvider = new ExampleProvider();
    }

    @Test
    public void test() {
        String hello = exampleProvider.getHello();
        System.out.println(hello);
    }

}