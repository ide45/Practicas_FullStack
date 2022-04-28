public class Introduction extends Thread{
    Screen screen = new Screen();

    private final String[] sentences = {
          "This code is for educational purposes only!!",
           "**FAIR USE**",
           "Copyright Disclaimer under section 107 of the Copyright Act 1976, allowance is made for " +
                   "“fair use” for purposes such as criticism, comment, news reporting, teaching, scholarship, " +
                   "education and research.",
            "Fair use is a use permitted by copyright statute that might otherwise be infringing.",
            "This exercise is non-profit, educational or personal use tips the balance in favor of fair use."
    };

    private final int size = sentences.length;
    @Override
    public void run() {
        screen.setVisible(true);
        screen.setBounds(200, 200, 1000, 400);
        try{
            for(int i = 0; i < size; i++){
                screen.cls();
                screen.repaint();
                screen.out("" + sentences[i], "Consolas", 40, Color.RED);
                Thread.sleep(3000);
            }
            screen.dispose();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
