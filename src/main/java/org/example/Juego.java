package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.Random;

public class Juego {
    private Jugadores jugadores = new Jugadores();
    private Logger logger = Logger.getLogger(Main.class.getName());
    private Scanner entradaEscaner = new Scanner (System.in);
    private Random random = new Random();
    private String estr1 = "Cinco números pares";
    private String estr2 = "Cinco números impares";
    private String estr3 = "Un número primo";
    private String estr4 = "Tres números múltiplos de 10";
    private String estr5 = "Dos números múltiplos de 25";

    public void inicio(){
        String jugador = "";
        String estrategia = "";

        logger.log(Level.INFO, "Ingrese el jugador y la estrategia como número \n 1. Cinco números pares \n 2. Cinco números impares \n 3. Un número primo \n 4. Tres números múltiplos de 10 \n 5. Dos números múltiplos de 25");

        for(int i = 0; i < 5; i++){
            jugador = entradaEscaner.nextLine(); 
            estrategia = entradaEscaner.nextLine();
            if(estrategia.equals("1")){
                jugadores.suscribe(estr1, jugador);
            }
            else if (estrategia.equals("2")){
                jugadores.suscribe(estr2, jugador);
            }
            else if (estrategia.equals("3")){
                jugadores.suscribe(estr3, jugador);
            }
            else if (estrategia.equals("4")){
                jugadores.suscribe(estr4, jugador);
            }
            else if (estrategia.equals("5")){
                jugadores.suscribe(estr5, jugador);
            }
        }
    }

    public void jugar(){
        int min = 1;
        int max = 99;
        int est1 = 0;
        int est2 = 0;
        int est3 = 0;
        int est4 = 0;
        int est5 = 0;
        String ronda = "";
        
        //Generación de números aleatorios
        for(int i = 1; i <=5; i++) {
            int value = random.nextInt((max - min) + min) + min;
            ronda.concat(String.valueOf(value)+ " ");
            if(value%2 == 0){
                est1++;
            }
            else if(value%2 != 0){
                est2++;
            }
            else if(esPrimo(value)){
                est3++;
            }
            else if(value%10 == 0){
                est4++;
            }
            else if(value%25 == 0){
                est5++;
            }
        }

        //Ganador
        logger.log(Level.INFO, "El ganador con lo números " + ronda + "es");
        if(est1 == 5){
            jugadores.notify(estr1);
        }
        else if(est2 == 5){
            jugadores.notify(estr2);
        }
        else if(est3 == 1){
            jugadores.notify(estr3);
        }
        else if(est4 == 3){
            jugadores.notify(estr4);
        }
        else if(est5 == 2){
            jugadores.notify(estr5);
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
          return false;
        }
        for (int x = 2; x < numero / 2; x++) {
          if (numero % x == 0)
            return false;
        }
        return true;
    }
    
}
