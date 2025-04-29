package lv.acodemy;

public class PezDiscription {
    public static void main(String[] args) {
        PezDispenser sonic = new PezDispenser("Pez Dispenser", "Blue", "Sonic Three", 12);

        System.out.println(sonic.getName());
        System.out.println(sonic.getColour());
        System.out.println(sonic.getSeries());
        System.out.println(sonic.getCandiesCapacity());

        sonic.getOneCandy();
        sonic.getSomeCandies(10);
        sonic.getSomeCandies(100);

        // loading
        sonic.loadOneCandy();
        sonic.loadFullCandies();
        sonic.loadSomeCandies(999);

    }
}
