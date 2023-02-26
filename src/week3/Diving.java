package week3;

public class Diving {
    public static void main(String[] args) {

        int level = 59;
        String result = " ";


        if (level >= 50 && level <= 100) {


            if (level <= 59 && level >= 50) {

                result = "Be careful now you are at 50%";

            }else if (level <= 69 && level >= 60){

                result = "Start to head back ";

            }else if (level <= 79 && level >= 70) {

                result = "Don't go too far";

            }else if (level <= 89 && level >= 80){

                result = "A lot left to use";

            } else {

                result = "Your tank is full";

            }
            System.out.println(result);
        }else {

            System.out.println("Invalid Amount");

        }
    }
}
