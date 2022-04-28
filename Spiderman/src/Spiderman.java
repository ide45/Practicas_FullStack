public class Spiderman {

    private String nombre;
    private String raza;
    private String genero;
    private String universo;

    public Spiderman(String nombre, String raza, String genero, String universo){
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.universo = universo;
    }

    public void lanzarTelarana(Screen screen){
        screen.out("\n-Lanza telarañas", "Consolas", 15, Color.black);
    }

    public void printAttributes(Screen screen){
        screen.setVisible(true);
        screen.cls();
        screen.repaint();

        screen.setBackground(Color.gray);
        screen.out("---" + nombre.toUpperCase()
                + "---" + "\nRaza: " + raza
                + "\nGenero: " + genero
                + "\nUniverso: " + universo + "\n",
                "Consolas", 28, Colors.ORANGE);

        screen.setBounds(200, 200, 1000, 500);
    }

    public void displayAbilities(Screen screen){
        screen.out("---HABILIDADES---", "Consolas", 28, Colors.AgalFuel);
    }
}
