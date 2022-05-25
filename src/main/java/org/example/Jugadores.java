package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugadores {
    private Map<String, String> jugadores;
    private Logger logger = Logger.getLogger(Main.class.getName());

    public Jugadores(){
        jugadores = new HashMap<String, String>();
    }

    public void suscribe(String estrategia, String jugador){
        jugadores.put(estrategia, jugador);
    }

    public void unsubscribe(String estrategia, String jugador){
        jugadores.remove(estrategia, jugador);
    }

    public void notify(String estrategia){
        logger.log(Level.INFO, "Los ganadores con la estrategia " + estrategia);
        String mensaje = "El jugador ";
        for (Map.Entry<String, String> jugador : jugadores.entrySet()) {
            mensaje.concat(jugador.getValue());
            logger.log(Level.INFO, mensaje);
            break;
        }

    }
}
