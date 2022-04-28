package practicaHarry;

public class imprimeMagos {
    public static void main(String[] args) {
        testMago();
    }

    private static void testMago(){
        Magos harry = new Magos(
                "Gryffindor",
                "Masculino",
                "Harry James Potter",
                "Dementor",
                "Ciervo"
        );

        Magos newton = new Magos(
                "Hufflepuff",
                "Masculino",
                "Newton Scamander",
                "Trabajar en una oficina",
                "No info"
        );

        Magos hermione = new Magos(
                "Gryffindor",
                "Femenino",
                "Hermione Granger",
                "Profesora McGonagall",
                "Nutria"
        );

        Magos ronald = new Magos(
                "Gryffindor",
                "Masculino",
                "Ronald Weasley",
                "Acromántula",
                "Jack Russell Terrier"
        );

        Magos minerva = new Magos(
                "Gryffindor",
                "Femenino",
                "Minerva McGonagall",
                "No info",
                "Gato"
        );

        harry.muestraMago();
        newton.muestraMago();
        hermione.muestraMago();
        ronald.muestraMago();
        minerva.muestraMago();
    }
}
