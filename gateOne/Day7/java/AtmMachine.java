import java.util.Random;
import java.util.Scanner;
public class AtmMachine{
	private static double balance = 0;
	private static int pin;
	private static double secondBalance = 0; 
	public static void main(String... args){
		options();
		
	}
	public static void options(){
	Scanner input = new Scanner(System.in);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");	
		System.out.println("WELCOME TO ESTHER'S ATM MACHINE");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		
		String  option = """
		press
		1. create Account
		2. close account
		3. Deposit money
		4. widthdraw money
		5. Check Account balance
		6. Transfer
		7. Change pin
		 """;
		System.out.print(option);


		System.out.print("Enter option: ");
		int number = input.nextInt();

		switch(number) {
			case 1: createAccount();
			break;

			case 2: closeAccount();
			break;

			case 3: depositAmount();
			break;

			case 4: withdrawalAmount();
			break;

			case 5: checkAccountBalance();
			break;
			
			case 6: transfer();
			break;	

			default: System.out.println("invalid");

	}
}

	public static void createAccount(){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
	
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();


		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
		
		int accountNumber = random.nextInt(1, 11111);
		System.out.println("This is your account number: " + accountNumber);

		System.out.print("create a pin: ");
		pin = input.nextInt();
	
			
		System.out.println("Account created successfully");
		System.out.println("FirstName: " + firstName);
		System.out.println("LastName: " + lastName);
		System.out.println("Pin: " + pin);
		nextTransaction();
			

	}
	public static void nextTransaction(){
	Scanner input = new Scanner(System.in);
	System.out.print("Do you want to perform another transaction? ");
		String userInput = input.nextLine();
		if(userInput.equalsIgnoreCase("yes")){
			options();
		}else if(userInput.equalsIgnoreCase("no")){
		
		}

	}

	public static void closeAccount(){
		System.out.print("Account clossed");
		nextTransaction();
			
	}


	public static void depositAmount(){
		double balance = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your account number: ");
		int accountNumber = input.nextInt();

		System.out.print("Enter your pin: ");
		pin = input.nextInt();

		System.out.print("Enter the amount you want to deposit: $");
		double depositAmount = input.nextDouble();
		if(depositAmount > 0){
			System.out.println("Deposit Successful");

			balance = depositAmount + balance;
			System.out.println("your balance is " + balance);
			nextTransaction();
			
	

			}
	}


	public static void withdrawalAmount(){
		Scanner input = new Scanner(System.in);
		double withdrawAmount = 0;
		System.out.print("put your pin: ");
		pin = input.nextInt();
	
		System.out.print("Enter the amount you want to withdraw: $");
		withdrawAmount = input.nextDouble();
			if(withdrawAmount > 0){
				System.out.println("withdrawal Successful");
				secondBalance = balance - withdrawAmount;
				System.out.println("your Balance is " + secondBalance);
				nextTransaction();
			
			}
	}





	public static void checkAccountBalance(){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter your pin");
		pin = input.nextInt();
		System.out.println("your account balance is: " + secondBalance);
		nextTransaction();
			

	}



	public static void transfer(){
		Scanner input = new Scanner(System.in);

		System.out.print("How much do you want to transfer");
		double transferAmount = input.nextDouble();
		if(transferAmount < 0){
			double totalBalance = secondBalance - transferAmount;
			System.out.print(totalBalance);
			nextTransaction();
			
			
		}

	}
		
		

	
	
	
}


	
