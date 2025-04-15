package lv.acodemy;

public class Variables {
    public static void main (String[] args) {

        // byte 8-bit
        byte age = 32;
        System.out.println(age);

        // short 16-bit
        short yearOfBirth = 1993;
        System.out.println(yearOfBirth);

        // int 32-bit
        int amountOfHours = 280320;
        System.out.println(amountOfHours);
        int result = (7 * 4) + 5;
        System.out.println(result);

        // long 64-bit
        long humanPopulation = 8_000_000_000L; //
        System.out.println(humanPopulation);

        // flaot 32-bit
        float bodyTempurture = 36.5F;
        System.out.println(bodyTempurture);


        // char (symbol)
        char symbol = '$';
        System.out.println(symbol);


        //  See Unicode table https://symbl.cc/en/unicode-table/
        char copyright = '\u00A9';
        System.out.println(copyright);

        // boolean (true/false)
        boolean isWeatherGood = false;
        System.out.println(isWeatherGood);
        boolean isSunYellow = true;
        System.out.println(isSunYellow);


        // String
        String myFullName = "Alisa Dambrane"; // immutable
        System.out.println( myFullName);

        String text = "Good \nweather";
        System.out.println(text);

        String poem = """
                  To be, or not to be, that is the question:
                  Whether 'tis nobler in the mind to suffer
                  The slings and arrows of outrageous fortune,
                  Or to take arms against a sea of troubles
                  """;
        System.out.println(poem);

    }
}
