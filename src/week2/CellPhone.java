package week2;

public class CellPhone {
    public static void main(String[] args) {

        String brandName = "Apple";
        String modelName = "Iphone X";
        String color = "Black";
        double price = 1200.99;
        int storage = 128;
        boolean hasCamera = true;
        String simA = "A";
        String simB = "B";
        String simC = "C";


        System.out.println("We have a brand new " +modelName+ " from " +brandName);
        System.out.println("It comes in the color " +color+ " and has " +storage+ "GB memory");
        System.out.println("It has a camera and operates with the " +"\""+simA+"\""+ " type sim");
        System.out.println("Get your very own " +modelName+ " for only $" +price);
    }
}
/*
CellPhone [variables, concatenation]

	Declare and assign the following variables:
		brand, model, color, price, storage, has camera, sim type (A, B, or C)

	Print out an advertisement post about the phone in this format:
		-> For extra practice also create this advertisement in a reusable way

		ex: if the given data was this: Apple, IPhone X, Black, 1200.99, 128, true, A
		the output would be:

		We have a brand new IPhone X from Apple
		It comes in the color Black and has 128GB memory
		It has a camera and operates with the "A" type sim
		Get your very own IPhone X for only $1200.99

 */