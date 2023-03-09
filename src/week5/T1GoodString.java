package week5;

import java.util.Scanner;

public class T1GoodString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = input.nextLine();

        boolean result = false;

        if (str.length() >= 4){

            String firstFourChars = str.substring(0, 4);

            if (firstFourChars.equalsIgnoreCase("good") && (str.charAt(0) == 'g') || str.charAt(1) == 'o'){

                result = true;
            }

        }
        System.out.println(result);
    }

}
/*
T1GoodString [String, indexes]

    Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false

    ex:
        goodday --> false
        agoodmovie --> true
        nogoodtoday -> true
        notgoodfornow -> false
 */