package PracticaSpidey;
import imonsh.Screen;

import java.awt.*;

public class SpiderGirl extends Spiderman implements SpiderGirlMethods, SpiderSense{
    public SpiderGirl(String nombre, String raza, String genero, String universo){
        super(nombre, raza, genero, universo);
    }

    @Override
    public void spiderSense(String nombre, Screen screen) {
        screen.out("\n-El sexto sentido de " + nombre + " tiene algunas funciones ocultas, " +
                "que van más allá de la premonición del peligro. También puede detectar los" +
                "puntos débiles de su enemigo con él\n", "Consolas", 15, Color.black);

        screen.showImage("spiderGirl.jpg");
    }

    @Override
    public void bioMagneticManipulation(Screen screen) {
        screen.out("Le permite repeler objetos y personas que toque directamente" +
                " o a través de un medio compartido pudiendo así pegar al suelo o a otros objetos",
                "Consolas", 15, Color.black);
    }

    @Override
    public void metallicNeedle(Screen screen) {
        screen.out("\n-Lanza agujas letales metálicas",
                "Consolas", 15, Color.black);
    }
}
