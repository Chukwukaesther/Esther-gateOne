import java.util.Random;
import java.util.Scanner;
public class Bank{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		
		

		String  options = """
		press
		1. create Account
		2. close account
		3. Deposit money
		4. widthdraw money
		5. Check Account balance
		6. Transfer
		7. Change pin
		 """;
		System.out.print(options);


		System.out.print("Enter option: ");s
		int number = input.nextInt();

		switch(number) {
			case 1: createAccount();
			break;
			case 2: depositeAmount();
			break;

			default: System.out.print("invalid");

		}

		
	}
	int pin;
	int balance = 0;
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
		
	
	

	}
	public static void CloseAccount(){
		Scanner input = new Scanner(System.in);
		System.out.print("Account clossed");
	}
	public static void depositMoney(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();

		System.out.print("Enter your pin: ");
		pin = input.nextInt();

		System.out.print("Enter the amount you want to deposit: $");
		double depositAmount = input.nextDouble();

		if(depositAmount > 0){
			System.out.print("Deposit Successful");

			balance = depositAmount + balance;;
		}
	}



}

