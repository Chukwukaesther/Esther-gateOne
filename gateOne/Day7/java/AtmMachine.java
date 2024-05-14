import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Bank{
	//ArrayList <Double> account = new Arraylist<Double>(); 
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		
		//account.add(balance)

		//System.out.print(>.repeat(50));	
		System.out.print("WELCOME TO ESTHER'S ATM MACHINE");
		//System.out.print(>.repeat(50));

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


		System.out.print("Enter option: ");
		int number = input.nextInt();

		switch(number) {
			case 1: createAccount();
			break;
			case 2: closeAccount();
			break;
			case 3: depositAmount();

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
		int pin = input.nextInt();
	
			
		System.out.println("Account created successfully");
		System.out.println("FirstName: " + firstName);
		System.out.println("LastName: " + lastName);
		System.out.println("Pin: " + pin);
		
	
	

	}
	public static void closeAccount(){
		Scanner input = new Scanner(System.in);
		System.out.print("Account clossed");
	}
	public static void depositAmount(){
		double balance = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your account number: ");
		int accountNumber = input.nextInt();

		System.out.print("Enter your pin: ");
		int pin = input.nextInt();

		System.out.print("Enter the amount you want to deposit: $");
		double depositAmount = input.nextDouble();
		if(depositAmount > 0){
			System.out.println("Deposit Successful");

			int balance = depositAmount + balance;
			System.out.println("your balance is " + balance);
	

			}
	}


	public static void withdrawalAmount(){
		Scanner input = new Scanner(System.in);
		double balance = 0;

		System.out.print("put your pin");
		int pin = input.nextInt();
	
		System.out.print("Enter the amount you want to withdraw: $");
		double withdaw = input.nextDouble();
			if(withdraw > 0){
				System.out.println("withdrawal Successful");
				 depositAmount() = balance - withdraw;
				System.out.println("your balance is " + depositAmount);
			}



	}
	


	
	
	
}


	
