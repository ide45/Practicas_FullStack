package PracticaSpidey;

import imonsh.Screen;

import java.awt.*;

public class SpiderMan2099 extends Spiderman implements SpiderMan2099Methods{
    public SpiderMan2099(String nombre, String raza, String genero, String universo){
        super(nombre, raza, genero, universo);
    }

    @Override
    public void showState(Screen screen) {
        screen.out("\n-Miguel O´hara carece de sentido arácnido\n", "Consolas", 15, Color.black);
        screen.showImage("spiderman2099.jpg");
    }

    @Override
    public void enhancedVision(Screen screen) {
        screen.out("\nGoza de una visión mejorada, pudiendo ver con claridad a grandes distancias y " +
                "la acción que se desarrolla a su alrededor ralentizada.",
                "Consolas", 15, Color.black);
    }

    @Override
    public void fangs(Screen screen) {
        screen.out("\n-Posee unos colmillos algo más desarrollados que los de un humano normal, con " +
                "los cuales puede inocular un veneno paralizante.",
                "Consolas", 15, Color.black);
    }
}
