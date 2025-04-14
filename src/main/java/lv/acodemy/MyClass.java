package lv.acodemy;

public class MyClass {
    public static void main(String[] args) {
        // sout -> shortcut
        System.out.println("Ja u Mami programmist");

        // Your text is here (one-line comment)

        /*
        First line
        Second line
        Third line
         */

        // byte 8-bit
        byte age = 30;
        System.out.println(age);

        // Naming convention:
        //Camel Case: MyClass for classes (Capital Camel Case)
        // Camel Case: currentYear for variables (Lower Camel Case)
        // short 16-bit
        short currentYear = 2025;
        short temperature = 273;
        short distance = 1600;

        // int 32-bit
        int score = 9000;
        int population = 14440000;
        int result = (10 * 10) - 42;
        System.out.println(result);

        // long 64-bit
        long starsInGalaxy = 100_000_000_000L; // 100000000000 (boxing type)
        long bigNumber = 929287261726127162L;
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);

        // flaot 32-bit
        float pi = 3.14F;
        float piNumber = (float) Math.PI; // casting
        float discount = 25.5f;


        // double 64-bit
        double accountBalance = 99999.99999944444;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        double piDouble = Math.PI;

        System.out.println(pi);
        System.out.println(piDouble);

        // char (symbol)
        char initial = 'N';
        char digit = '7';
        char symbol = '#';

        //  See Unicode table https://symbl.cc/en/unicode-table/
        char smiley = '\u263A';
        System.out.println(smiley);

        // boolean (true/false)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40 > 60); //false
        System.out.println(passed);

        // String
        String myFullName = "Alisa Dambrane"; // immutable
        String mfn = new String (original: "Alisa Dambrane");




    }
}



