public class imprimeAranas {
    public static void main(String[] args) throws InterruptedException{
        defSpider();
    }

    private static void defSpider() throws InterruptedException{
        Screen screen = new Screen();

        PeterParker peterParker = new PeterParker(
                "Peter Parker",
                "Humano",
                "Masculino",
                "616"
        );
        peterParker.printAttributes(screen);
        peterParker.displayAbilities(screen);
        peterParker.lanzarTelarana(screen);
        peterParker.spiderSense("Peter Parker", screen);
        Thread.sleep(10000);


        SpiderHam peterPorker = new SpiderHam(
                "Peter Porker",
                "Cerdo",
                "Masculino",
                "8311"
        );
        peterPorker.printAttributes(screen);
        peterPorker.displayAbilities(screen);
        peterPorker.lanzarTelarana(screen);
        peterPorker.spiderNonSense(screen);
        peterPorker.cartoonPhysics(screen);
        peterPorker.tornado(screen);
        peterPorker.spiderSense("Peter Porker", screen);
        Thread.sleep(10000);


        SpiderMan2099 spiderMan2099 = new SpiderMan2099(
                "Miguel O'hara",
                "Humano",
                "Masculino",
                "928"
        );
        spiderMan2099.printAttributes(screen);
        peterPorker.displayAbilities(screen);
        spiderMan2099.enhancedVision(screen);
        spiderMan2099.fangs(screen);
        spiderMan2099.lanzarTelarana(screen);
        spiderMan2099.showState(screen);
        Thread.sleep(10000);


        SpiderGirl spiderGirl = new SpiderGirl(
                "May Parker",
                "Humano",
                "Femenino",
                "616"
        );
        spiderGirl.printAttributes(screen);
        peterPorker.displayAbilities(screen);
        spiderGirl.metallicNeedle(screen);
        spiderGirl.bioMagneticManipulation(screen);
        spiderGirl.lanzarTelarana(screen);
        spiderGirl.spiderSense("SpiderGirl", screen);
        Thread.sleep(10000);

        screen.dispose();
    }
}
