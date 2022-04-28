package Comic;

public class RunComic {
    public static void main(String[] args) {
        Thread introduction = new Thread(new Introduction());
        Thread comic = new Thread(new Comic());

        introduction.start();
        while(introduction.isAlive()){
            if(!introduction.isAlive()) {
                comic.start();
            }
        }
    }
}
