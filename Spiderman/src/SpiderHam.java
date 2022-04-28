public class SpiderHam extends Spiderman implements SpiderHamMethods, SpiderSense{
    public SpiderHam(String nombre, String raza, String genero, String universo){
        super(nombre, raza, genero, universo);
    }

    @Override
    public void spiderNonSense(Screen screen) {
        screen.out("\n-His Spider-Nonsense allows him to be \"cartoon-ier\" " +
                "with the more danger he is in at the time.",
                "Consolas", 15, Color.black);
    }

    @Override
    public void cartoonPhysics(Screen screen) {
        screen.out("\n-Cartoons often operate outside the standard laws of physics, such as how Looney " +
                "Tunes characters bounce back after being blown up, flattened \nand sometimes shot out of a cannon." +
                "This is the case with Spider-Ham",
                "Consolas", 15, Color.black);
    }

    @Override
    public void tornado(Screen screen) {
        screen.out("\n-Creates a tornado by windmilling his arm.",
                "Consolas", 15, Color.black);
    }

    @Override
    public void spiderSense(String nombre, Screen screen) {
        screen.out("\n-El sentido arácnido de " + nombre +  " tiene algunas funciones ocultas, " +
                "que van más allá de la premonición del peligro\n",
                "Consolas", 15, Colors.black);

        screen.showImage("peterPorker.jpg");
    }
}
