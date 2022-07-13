package org.testexample;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.example.EventManager;
import org.example.Suscriber;

public class TestApp {
    @Test
    public void test1(){
        String topico1 = "Tópico 1";
        String topico2 = "Tópico 2";
        String topico3 = "Tópico 3";
        String mensaje = "Mensaje 1 para tópico 1";

        EventManager manager = new EventManager();
        Suscriber suscriptor1 = new Suscriber("Suscriptor 1");
        Suscriber suscriptor2 = new Suscriber("Suscriptor 2");
        Suscriber suscriptor3 = new Suscriber("Suscriptor 3");
        Suscriber suscriptor4 = new Suscriber("Suscriptor 4");

        manager.suscribe(topico1, suscriptor1);
        manager.suscribe(topico1, suscriptor2);
        manager.suscribe(topico2, suscriptor3);
        manager.suscribe(topico3, suscriptor4);

        manager.notify(mensaje, topico1);

        Assert.assertEquals(suscriptor1.getMensaje(), mensaje);
        Assert.assertEquals(suscriptor2.getMensaje(), mensaje);;
    }
}
