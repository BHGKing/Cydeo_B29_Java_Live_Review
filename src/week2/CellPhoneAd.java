package week2;

public class CellPhoneAd {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model = "Galaxy S21";
        String color = "Phantom Black";
        double price = 999.99;
        int storage = 256;
        boolean hasCamera = true;
        char simType = 'B';

        String ad = createAd(brand, model, color, price, storage, hasCamera, simType);
        System.out.println(ad);
    }

    public static String createAd(String brand, String model, String color, double price,
                                  int storage, boolean hasCamera, char simType) {
        String ad = "We have a brand new " + model + " from " + brand + "\n";
        ad += "It comes in the color " + color + " and has " + storage + "GB memory\n";
        ad += "It " + (hasCamera ? "has a camera" : "does not have a camera") + " and operates with the \"" + simType + "\" type sim\n";
        ad += "Get your very own " + model + " for only $" + price;
        return ad;
    }
}