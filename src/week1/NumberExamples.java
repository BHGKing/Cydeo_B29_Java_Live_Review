package week1;

public class NumberExamples {

    public static void main(String[] args) {

        // whole numbers
        byte b = 4;
        short s = 1000;
        int i = 31242424;

        long l = 50;
        long l2 = 3_000_000; // underscore for readability
        System.out.println(l2);

        // the datatype of 50 and 3,000,000 is INT by default

        long l3 = 3_000_000_000L; // the L allows the compiler to read the number as a long instead of int

        float a = 3.14F; // the F allows the compiler to read the number as a float instead of a double


    }

}
