package PracticaSpidey;
import imonsh.Screen;

import java.awt.*;


public class PeterParker extends Spiderman implements SpiderSense{
    public PeterParker(String nombre, String raza, String genero, String universo){
        super(nombre, raza, genero, universo);
    }

    @Override
    public void spiderSense(String nombre, Screen screen) {
        screen.out("\n-El sentido arácnido de " + nombre +
                " tiene algunos funciones ocultas que van más allá de la premonición del peligro\n",
                "Consolas", 15, Color.BLACK);

        screen.showImage("peterParker.jpg");
    }
}
