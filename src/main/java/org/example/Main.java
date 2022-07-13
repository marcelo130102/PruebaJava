package org.example;


public class Main {
    public static void main(String[] args) {
        String topico1 = "Tópico 1";
        String topico2 = "Tópico 2";
        String topico3 = "Tópico 3";

        EventManager manager = new EventManager();
        Suscriber suscriptor1 = new Suscriber("Suscriptor 1");
        Suscriber suscriptor2 = new Suscriber("Suscriptor 2");
        Suscriber suscriptor3 = new Suscriber("Suscriptor 3");
        Suscriber suscriptor4 = new Suscriber("Suscriptor 4");

        manager.suscribe(topico1, suscriptor1);
        manager.suscribe(topico1, suscriptor2);
        manager.suscribe(topico2, suscriptor3);
        manager.suscribe(topico3, suscriptor4);

        manager.notify("Mensaje 1 para tópico 1", topico1);

        suscriptor1.getMensaje();
        suscriptor2.getMensaje();
        
        



    }
}