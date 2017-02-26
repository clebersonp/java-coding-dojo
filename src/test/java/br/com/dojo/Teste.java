package br.com.dojo;


import org.junit.Assert;
import org.junit.Test;


public class Teste {

    @Test
    public void testaMeuNome() {
        String myName = "Cleberson";
        Assert.assertEquals("cleberson", myName);
    }

}
