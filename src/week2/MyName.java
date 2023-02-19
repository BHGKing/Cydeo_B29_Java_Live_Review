package week2;

public class MyName {
    public static void main(String[] args) {

        System.out.println(5+3); // int =
        System.out.println(5 + 3 + "hello"); // String =
        System.out.println("Java" + 1 + 2);
        System.out.println("Java" + (1 + 2));

        int age = 30;
        String month = "March";
        String str = "In " + month + " you will turn " + age;
        System.out.println(str);



        // Task: create a char variable for every character in your name, think about all the ways you can
        // print your name
        System.out.println("--------------------------------------------------");

        char j = 'J', o = 'o', s = 's', e = 'e';

        System.out.print(j);
        System.out.print(o);
        System.out.print(s);
        System.out.print(e);
        System.out.println();

        System.out.println(j+o+s+e); // adds the numbers of the characters
        System.out.println();


        System.out.println("My name is " +j+o+s+e); // prints as a string instead of a number
        System.out.println("" +j+o+s+e); // is the same as above
        System.out.println();


        String name = "" + j + o + s + e;

        System.out.println(name);


    }
}
