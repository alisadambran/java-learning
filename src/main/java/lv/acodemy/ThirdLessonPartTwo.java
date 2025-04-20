package lv.acodemy;

import javax.naming.Name;
import javax.xml.namespace.QName;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

        int summa = add(10, 30);
        System.out.println(summa);
        System.out.println(add(20, 10));



        var add = add(10, 20, 30);
        System.out.println(add(10, 20, 30));

        var i = maxOfTwo (10, 30);
        System.out.println(i);
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
     // maxOfThree int a, int b, int c, returns the biggest number




            }
        }


