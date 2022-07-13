package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Suscriber {
    private String name;
    private String mensajeActual = "";
    private Logger logger = Logger.getLogger(Main.class.getName());
    Suscriber(String _name){
        name = _name;
    }
    public void setMensaje(String mensaje){
        mensajeActual = mensaje;
    }

    public String getName(){
        return name;
    }

    public void getMensaje(){
        logger.log(Level.INFO, "El mensaje para " + name + " es " + mensajeActual);
    }
}
