package week3;

public class Finra {
    public static void main(String[] args) {

        int num = 1;

        if (num % 3 == 0 || num % 5 == 0 || num % 3 == 0 && num % 5 == 0){


                if (num % 3 == 0 && num % 5 == 0){

                    System.out.println("FINRA");

                }else if (num % 5 == 0){

                    System.out.println("RA");

                }else {

                    System.out.println("FIN");

                }

        }else {
            System.out.println(num);
        }
    }
}
