public class MonaTheOctocat {
    private String profesion;

    public MonaTheOctocat(String profesion){
        this.profesion = profesion;
    }

    public void makeAction(String accion){
        System.out.println("---" + this.profesion.toUpperCase() + "---");
        System.out.println("Miren, la mona " + this.profesion + " esta " + accion);
    }

    public void loQueDiceLaMona(){
        System.out.println("-Hola, soy una mona bonis");
    }
}

class monaMecanica extends MonaTheOctocat{
    public monaMecanica(String nombre) { super(nombre); }

    public void makeAction(String accion) {
        super.makeAction(accion);
    }

    @Override
    public void loQueDiceLaMona() {
        System.out.println("-Estoy a punto de descrubir un motor que se mueve con agua!");
    }
}

class monaAviadora extends MonaTheOctocat{
    public monaAviadora(String nombre) { super(nombre); }

    public void makeAction(String accion) {
        super.makeAction(accion);
    }

    @Override
    public void loQueDiceLaMona() {
        System.out.println("-Shiuuuum ✈︎");
    }
}

class monaLuchadora extends MonaTheOctocat{
    public monaLuchadora(String nombre) { super(nombre); }

    public void makeAction(String accion) {
        super.makeAction(accion);
    }

    @Override
    public void loQueDiceLaMona() {
        System.out.println("-No subestimes mi fuerza, fuaaa!");
    }
}

class monaCientifica extends MonaTheOctocat{
    public monaCientifica(String nombre) { super(nombre); }

    public void makeAction(String accion) {
        super.makeAction(accion);
    }

    @Override
    public void loQueDiceLaMona() {
        System.out.println("-He descubierto algo que dejará sin palabras al mundo entero!");
    }
}

class monaActriz extends MonaTheOctocat{
    public monaActriz(String nombre) { super(nombre); }

    public void makeAction(String accion) {
        super.makeAction(accion);
    }

    @Override
    public void loQueDiceLaMona() {
        System.out.println("-Tengo tantos óscares, ya ni sé que hacer con ellos...");
    }
}

class monaProgramadora extends MonaTheOctocat{
    public monaProgramadora(String nombre) { super(nombre); }

    public void makeAction(String accion) {
        super.makeAction(accion);
    }

    @Override
    public void loQueDiceLaMona() {
        System.out.println("-Sé hacer cualquier cosa pero... centrar un div, eso es maligno");
    }
}
