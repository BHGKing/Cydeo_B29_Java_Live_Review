package week2;

public class Balance {
    public static void main(String[] args) {

        double balance = 1000;
        double withdrawAmount = 500;
        int overDraftFee = -100;

        balance -= withdrawAmount;

        //int balance = amountBalance - withdrawAmount;

        if (balance < 0){
            System.out.println("Withdrew more than you had in the account. Overdraft applied!");
            balance += (balance * 0.2);
            System.out.println("Your balance is $" + balance);
        }else {
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