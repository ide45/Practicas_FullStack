package Comic;
import imonsh.Dialog;
import imonsh.Screen;

public class Comic implements Runnable{
    Screen screen = new Screen();
    Dialog dialog = new Dialog();

    private String str;
    private int i = 1;
    private String srcPage;

    @Override
    public void run() {
        screen.setVisible(true);
        screen.setBounds(100, 0, 550, 825);

        while(i != 28) {
            srcPage = String.format("./img/%d.jpg", i);
            screen.cls();
            screen.repaint();
            screen.showImage("" + srcPage);

            str = dialog.readString("Página siguiente? s/n (e para cerrar)");
            str = str.toLowerCase();

            switch (str.charAt(0)) {
                case 's' -> i++;
                case 'n' -> i--;
                case 'e' -> {
                    screen.dispose();
                    System.exit(0);
                }
                default -> screen.cls();
            }
            if(i == 28){
                screen.dispose();
                System.exit(0);
            }
            if(i < 1){
                screen.cls();
                i = 1;
            }
        }
    }
}
