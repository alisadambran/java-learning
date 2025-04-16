package lv.acodemy;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class SecondLesson {
    public static void main(String[] args) {

        // Array
        int[] numbers = new int[5];
        String[] names = {"Alice", "Bob"}; // [Alice, Bob]

        int[] ages = {25, 30, 35, 41, 50};

        String[] fruitBasket = new String[10];
        fruitBasket[0] = "Apple";
        fruitBasket[1] = "Banana";
        fruitBasket[2] = "Grape";
        fruitBasket[3] = "Orange";
        fruitBasket[4] = "Watermelon";
        fruitBasket[5] = "Pineapple";
        fruitBasket[6] = "Mango";
        fruitBasket[7] = "Pearl";
        fruitBasket[8] = "Apple";
        fruitBasket[9] = "Banana";
        System.out.println(Arrays.toString(fruitBasket));

        // Elemet access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers));

        var currentDay = 14;
        System.out.println(currentDay);

        // Loops
        // Print hello world 5 times;
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        System.out.println("=======");

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");

        }
        for(int i = 0; i < fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }

        // for each;
        for(String fruit : fruitBasket) {
            System.out.println(fruit);
        }

        // Create int number array from 0 -> to 10;
        // Print in reverse order;
        int[] games = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = games.length - 1; i >= 0; i--) {
            System.out.print(games[i] + " ");
        }

        // Concatenation
        String myName = "Alisa";
        String mySurname = "Dambrane";
        int myAge = 32;
        System.out.println("n");
        System.out.println("My name is " + myName + " "+ mySurname + ". I am " + myAge + " years old");

        // String.format();
        System.out.println(
        String.format("My name is %s %s. I am %d years old", myName, mySurname, myAge));

        String template = """
                My name is %s %s. I am %d years old""";
        System.out.println(String.format(template, myName, mySurname, myAge));

        // while loops
        /*
        while(condition) {
        // loop body
        }
         */

        int i = 0;
        while (i < 5){
            System.out.println("Number: " +i);
            i++;
        }

        Scanner scanner = new Scanner (System.in);
        String password ="";

        /*
        String password = "123"
        password.equals("123") = true!
        !password.equals("123") = false
        */


        while (!password.equals("secret")) {
            System.out.println("Enter your password: ");
            password = scanner.nextLine();
        }
        System.out.println("Access granted!");

        boolean isGuessed = false;
        while (!isGuessed)
            if(!password.equals("secret")) {
                System.out.println("Enter your password: ");
                password = scanner.nextLine();
            } else {
                System.out.println("Access granted!");
                isGuessed = true;
            }


        int summa = 0;
        for (int o = 1; o <= 100; o++) {
            summa = summa + 0;
        }
        System.out.println("Summa: " + summa);



            }
}