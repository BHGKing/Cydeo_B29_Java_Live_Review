package week5;

import java.util.Scanner;

public class T2BeginningAtEnd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();
        boolean result = false;

        String firstTwoLetters = str.substring(0, 2);
        String lastTwoLetter = str.substring(str.length() - 2);

        if (firstTwoLetters.equals(lastTwoLetter)){
            result = true;
        }
        System.out.println(result);
    }
}
/*
T2BeginningAtEnd [String, indexes]

    Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

    ex:
        educated -> true
        java -> false
        eraser for the computer -> true
        panda giftwrap -> false
 */