package org.example;


public class Main {
    public static void main(String[] args) {
        

        EventManager manager = new EventManager();
        Suscriber suscriptor1 = new Suscriber("Suscriptor 1");
        Suscriber suscriptor2 = new Suscriber("Suscriptor 2");
        Suscriber suscriptor3 = new Suscriber("Suscriptor 3");
        Suscriber suscriptor4 = new Suscriber("Suscriptor 4");

        manager.suscribe("Tópico 1", suscriptor1);
        manager.suscribe("Tópico 1", suscriptor2);
        manager.suscribe("Tópico 2", suscriptor3);
        manager.suscribe("Tópico 3", suscriptor4);

        manager.notify("Mensaje 1 para tópico 1", "Tópico 1");

        suscriptor1.getMensaje();
        suscriptor2.getMensaje();
        
        



    }
}