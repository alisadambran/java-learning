package lv.acodemy;

public class Playground {
    public static void main(String[] args) {

        Dog rex = new Dog();

        // Encapsulation
        rex.setName("Rex");
        rex.setAge(1);
        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());


        Dog barsik = new Dog("Alabai");
        barsik.setName("Barsik");
        barsik.setAge(1);

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());
        System.out.println(barsik.getBreedName());

// All argument constructor
        Dog myPjos = new Dog("Chika", 9, "Corgi");
        System.out.println(myPjos);

        Car porche = new Car("Porche230");
        System.out.println(porche);
        porche.drive();
        porche.drive();
        porche.drive();
        porche.drive();
        porche.drive();
        porche.drive();
        porche.drive();
        System.out.println(porche);
        porche.refuel();
        System.out.println(porche);
        porche.service();
        System.out.println(porche);
        porche.showStatus();
        System.out.println(porche);


    }
}
