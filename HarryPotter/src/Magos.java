package practicaHarry;

public class Magos {
    String casa;
    String genero;
    String nombre;
    String boggart;
    String patronus;

    public Magos(String casa, String genero, String nombre, String boggart, String patronus){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public void muestraMago(){
        System.out.print("\n---MAGO---\nCasa: " + casa
                + "\nGenero: " + genero
                + "\nNombre: " + nombre
                + "\nBoggart: " + boggart
                + "\nPatronus: " + patronus);
    }
}

