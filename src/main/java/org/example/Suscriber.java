package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Suscriber {
    private String name;
    private String mensajeActual = "";
    private Logger logger = Logger.getLogger(Suscriber.class.getName());
    Suscriber(String nameS){
        name = nameS;
    }
    public void setMensaje(String mensaje){
        mensajeActual = mensaje;
    }

    public String getName(){
        return name;
    }

    public void getMensaje(){
        String mensaje = "El mensaje para " + name + " es " + mensajeActual;
        logger.log(Level.INFO, mensaje);
    }
}
