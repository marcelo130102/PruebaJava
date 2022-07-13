package org.example;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;



public class EventManager {
    Multimap<String, Suscriber> listeners;
    private Logger logger = Logger.getLogger(EventManager.class.getName());

    public EventManager(){
        listeners = ArrayListMultimap.create();
    }
    public void suscribe(String topico, Suscriber suscriptor){
        listeners.put(topico, suscriptor);
    }
    public void unsubscribe(String topico, Suscriber suscriptor){
        listeners.remove(topico, suscriptor);   
    }

    public void notify(String mensajeSub, String topico){
        Collection<Suscriber> suscriptores = listeners.get(topico);
        String mensaje = "Se envió el mensaje: " + mensajeSub;
        logger.log(Level.INFO, mensaje);
        for (Suscriber suscriptor : suscriptores) {
                suscriptor.setMensaje(mensajeSub);
                logger.log(Level.INFO, "Notificado");
        }
    }
}
