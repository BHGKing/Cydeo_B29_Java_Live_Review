package week3;

public class PandemicChecker {
    public static void main(String[] args) {

        int year = 2015;
        String result = " ";

        if (year >= 0 && year <= 2023){

            if (year >= 1346 && year <= 1353){
                result = "The Black Death";
            }else if (year == 1665 || year == 1666){
                result = "Great Plague of London";
            }else if (year >= 1770 && year <= 1772){
                result = "Russian Plague";
            }else if (year == 1889 || year == 1890){
                result = "Flu Pandemic";
            }else if (year == 1916) {
                result = "American Polio Epidemic";
            }else if (year >= 1918 && year <= 1920){
                result = "Spanish Flu";
            }else if (year == 2009 || year == 2010) {
                result = "H1N1 Swine Flu Pandemic";
            }else if (year >= 2014 && year <= 2016){
                result = "West African Ebola epidemic";
            }else if (year == 2020 || year == 2021){
                result = "COVID-19";
            }

            System.out.println(result);

        }else {
            System.out.println("Sorry "+year+ " is not a valid year");
        }





    }
}
