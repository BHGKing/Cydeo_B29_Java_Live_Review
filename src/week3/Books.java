package week3;

public class Books {
    public static void main(String[] args) {

        String genre = "Detect"; // Fantasy, Detective, Science Fiction, Short Story
        int pageLength = 0; // 150, 350, 500, 720
        int profit = 0; // 300k, 900.5k, 700k, 1mil
        int sequel = 0; // 1, 3, 4, 5
        int countries = 0; // 30, 40, 45, 50


        if (genre == "Fantasy" || genre == "Detective" || genre == "Science Fiction" || genre == "Short Story"){

            switch (genre) {
                case "Fantasy":
                    pageLength = 500;
                    profit = 1_000_000;
                    sequel = 5;
                    countries = 50;
                    break;

                case "Detective":
                    pageLength = 350;
                    profit = 700_000;
                    sequel = 3;
                    countries = 45;
                    break;

                case "Science Fiction":
                    pageLength = 720;
                    profit = 900_500;
                    sequel = 4;
                    countries = 30;

                    break;

                case "Short Story":
                    pageLength = 150;
                    profit = 300_000;
                    sequel = 1;
                    countries = 40;

                    break;

            }
        String result = "The " + genre + " genre usually has profits of $" + profit + " being sold in " + countries +
                " different countries.\n The " + genre + " books often have " + sequel +
                " squeals with each book roughly being around " + pageLength + "pages";

        System.out.println(result);

        }   else {
                System.out.println("Sorry we don't have info for the " + genre + " genre");
            }
    }
}
