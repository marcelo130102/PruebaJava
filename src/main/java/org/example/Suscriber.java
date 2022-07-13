package org.example;

public class Suscriber {
    private String name;
    private String mensajeActual = "";
    public Suscriber(String nameS){
        name = nameS;
    }
    public void setMensaje(String mensaje){
        mensajeActual = mensaje;
    }

    public String getName(){
        return name;
    }

    public String getMensaje(){

        return mensajeActual;
    }
}
