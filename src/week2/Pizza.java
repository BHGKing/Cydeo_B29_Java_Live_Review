package week2;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "cheese";
        int slicesOfPizza = 8;
        int amountOfPeople = 3;
        int slicesLeft = slicesOfPizza % amountOfPeople;

        System.out.println("We ordered a " +typeOfPizza+ " pizza with " +slicesOfPizza+ " slices.");
        System.out.println(amountOfPeople+ " people ate 2 slices each, so there was " +slicesLeft+ " slices left");
    }
}
/*
Pizza [variables, operators, concatenation]

	Declare and assign the following variables
		type (type of pizza), slices (how many slices the pizza has), and people (the number of people eating this pizza)

	Calculate how many slices each person will get and how many are left over. Print the output in this format:

		We ordered a $type pizza with $slices slices. $number_of_people people ate $each_share slices each, so there was $remainder slices left

		Ex: We ordered a cheese pizza with 8 slices. 3 people ate 2 slices each, so there was 2 slices left

 */