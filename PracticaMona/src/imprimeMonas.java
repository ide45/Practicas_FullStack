public class imprimeMonas {
    public static void main(String[] args) {
        muestraMonas();
    }

    private static void muestraMonas(){
        monaMecanica mona = new monaMecanica("mecánica");
        monaAviadora mona1 = new monaAviadora("aviadora");
        monaLuchadora mona2 = new monaLuchadora("luchadora");
        monaCientifica mona3 = new monaCientifica("cientifica");
        monaActriz mona4 = new monaActriz("actriz");
        monaProgramadora mona5 = new monaProgramadora("programadora");

        mona.makeAction("probando los nuevos ajustes que hizo a su deportivo!");
        mona.loQueDiceLaMona();

        mona1.makeAction("dentro de un boing o mejor dicho... un boeing!");
        mona1.loQueDiceLaMona();

        mona2.makeAction("golpeando a su contrincante...auch!");
        mona2.loQueDiceLaMona();

        mona3.makeAction("resolviendo problemas muy complejos!");
        mona3.loQueDiceLaMona();

        mona4.makeAction("rodando una nueva pelicula!");
        mona4.loQueDiceLaMona();

        mona5.makeAction("implementando un objeto!");
        mona5.loQueDiceLaMona();
    }
}
