package lv.acodemy;

import java.util.Arrays;

public class Thirdlesson {
    public static void main(String[] args) {

        // Conditional operators in Java

        // if (is, has -> isRaining, isRandomNumber, hasEvenValue)
        boolean isRaining = true;

        if(isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if(temperature > 29) {
            System.out.println("It's too hot!");
        }

        // And (&&)
        if(4 > 2 && 10 < 11) {
            System.out.println("Both are equals!");
        }

        // OR (||)
        if(4 < 2 || 10 > 11) {
            System.out.println("Execute this code!");
        }

        // if-else....
        boolean isWeekDay = false;

        if(isWeekDay){
            System.out.println("Working today...");
        } else {
            System.out.println("Will stay at home!");
        }

        int number = 11;
        // % -
        // + -/ * (

        if(number % 2 == 0) {
            System.out.println("Even number!");
        } else {
            System.out.println("Odd number!");
        }

        // If age => 18 -> Access granted
        // In all other cases -> Access denied

        int age = 18;
        if(age >= 18) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }

        // if-else-if-else

        int hour = 7;
        if(hour == 5) {
            System.out.println("Will go for run!");
        } else if (hour == 7) {
            System.out.println("Will have breakfast!");
        } else if (hour == 9) {
            System.out.println("Will start work!");
        } else {
            System.out.println("Free time!");
        }

        // score > = 90 - Perfect
        // >= 70 = Good
        // >= 50 = OK
        // else -> NOT OK

        int score = 90;
        if(score >= 90) {
            System.out.println("Perfect!");
        }else if(score >= 70) {
            System.out.println("Good!");
        }else if(score >= 50) {
            System.out.println("OK");
        }else {
            System.out.println("Not OK");
        }

        // age -> 0 - 6 = Baby
        // 7 - 17 -> Shkilla
        // 18 -65 -> Adult
        // 66+ pens;

        int ages = 4;
        if(ages >= 0 && ages <= 6) {
            System.out.println("Baby!");
        }else if(ages >= 7 && ages <= 17) {
            System.out.println("Shkilla!");
        }else if(ages >= 18 && ages <= 65) {
            System.out.println("Adult!");
        }else {
            System.out.println("Pens!");
        }

        // We know conditions & loops
        // Print even numbers from 1 to 10;

        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("Number:" + i + "is even number!");
            }
        }

        int[] numbers = {-2, -10, 5, 6, -100, 3, 0, 20};
        int sum = 0;

        // count sum only for numberd that are positive
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Sum of positive numbers: " + sum);

        // 1 till 20,
        // print numbers that can be divided by 3 and 5;
        // print divided by 3
        // print divided by 5
        // else -> just print number;

            int[] arr = new int[20];
            for(int i = 0; i < arr.length; i++) {
                arr[0] = i;
            }
        System.out.println(Arrays.toString(arr));


        for(int i = 1; i < arr.length; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number:" + i + "can be divided by 3 and 5! ");
            }else if (i % 3 == 0) {
                System.out.println("Number:" + i + "can be divided by 3! ");
            }else if (i % 5 == 0) {
                System.out.println("Number:" + i + "can be divided by 5! ");
            }else {
                System.out.println("This number is useless " + i);
            }
        }
        



    }
}
