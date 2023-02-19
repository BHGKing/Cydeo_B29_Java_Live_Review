package week2;

public class Balance {
    public static void main(String[] args) {

        int amountBalance = 100;
        int withdrawAmount = 200;
        int overDraftFee = -100;

        int balance = amountBalance - withdrawAmount;

        if (balance < 0){
            balance = balance + overDraftFee;
            System.out.println("You were charged an overdraft fee of $100");
            System.out.println("Your balance is $" + balance);
        }else {
            balance = amountBalance - withdrawAmount;
            System.out.println("Your balance is $" + balance);
        }
    }
}
/*
Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee to the balance by subtracting 100

    In both cases print the remaining balance after withdrawing

 */