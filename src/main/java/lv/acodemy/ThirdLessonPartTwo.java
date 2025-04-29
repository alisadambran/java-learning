package lv.acodemy;

import javax.naming.Name;
import javax.xml.namespace.QName;
import java.util.Arrays;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

        int summa = add(10, 30);
        System.out.println(summa);
        
        System.out.println(add(20, 10));
        
        greet("Nikita");



        var add = add(10, 20, 30);
        System.out.println(add(10, 20, 30));

        var i = maxOfTwo (10, 30);
        System.out.println(i);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1, 2, 3, 300, 400};
        var rezultik = maxFromArray(numbers);
        System.out.println(rezultik);

        var asInt = Arrays.stream(numbers).max().getAsInt();
        System.out.println(asInt);

    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }
    // Method overloading
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // maxOfTwo, accepts: int a, int b; return the biggest number;
    public static int maxOfTwo(int a, int b) {
        if(a > b) {
            return a;
        }else {
            return b;
        }

        }
     // maxOfThree int a, int b, int c, returns the biggest number
            public static int maxOfThree(int a, int b, int c){
                return Math.max(Math.max(a,b), c);
        }
      public static int maxFromArray(int ... numbers){
        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }

        }
        return max;
      }




            }



