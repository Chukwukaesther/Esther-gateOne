import java.util.Random;
import java.util.Scanner;
public class AtmMachine{

	private static double balance = 0.00;
	private static int pin;
	private static double remainingBalance = 0.00;
public static Scanner input = new Scanner(System.in);

 
	public static void main(String... args){
		options();	
	}

	public static void options(){
				
		String  option = """
		>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		WELCOME TO ESTHER'S ATM MACHINE
		>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Choose what you want to do from the options: 
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
		int menu = input.nextInt();

		switch(menu) {
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

			case 7: changePin();
			break;
	

			default: System.out.println("invalid");

	}
}

	public static void createAccount(){
		Random random = new Random();
	
		System.out.println("Enter your first name: ");
		String firstName = input.next();

		System.out.print("Enter your last name: ");
		String lastName = input.next();
		
		int accountNumber = 1000000000 + random.nextInt(999999999);
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
		System.out.print("Do you want to perform another transaction?(yes/no) ");
		String userInput = input.next();
		if(userInput.equalsIgnoreCase("yes")){
			options();
		}
		else{
			System.exit(0);
		}

	}

	public static void closeAccount(){
		System.out.print("Account name");
		System.out.print("Account clossed");
		nextTransaction();
			
	}

	public static void depositAmount(){

		System.out.print("Enter your account number: ");
		int accountNumber = input.nextInt();

		System.out.print("Enter your pin: ");
		int userInput1 = input.nextInt();
		if(pin != userInput1){
			System.out.println("invalid pin ");
			nextTransaction();
		}
		System.out.print("Enter the amount you want to deposit: $");
		double depositAmount = input.nextDouble();
		if(depositAmount > 0){
			balance = depositAmount + balance;
			System.out.println("Deposit Successful");
			System.out.println("your balance is $ " + balance);
			nextTransaction();

			}
	}

	public static void withdrawalAmount(){
		double withdrawAmount = 0.00;

		System.out.print("put your pin: ");
		int userInput2 = input.nextInt();
		if(pin != userInput2){
			System.out.println("invalid pin ");
		}else{

		System.out.print("Enter the amount you want to withdraw: $");
		withdrawAmount = input.nextDouble();
		}
			if(withdrawAmount > 0){
				System.out.println("withdrawal Successful");
				balance = balance - withdrawAmount;
				System.out.println("your Balance is " + balance);
				nextTransaction();
			
			}
	}


	public static void checkAccountBalance(){
	
		System.out.println("Enter your pin");
		int userInput3 = input.nextInt();
		if(pin != userInput3){
			System.out.println("invalid pin ");
			nextTransaction();
			
		}else {
			System.out.println("your account balance is: " + balance);
		nextTransaction();
		}	

	}

	public static void transfer(){

		System.out.print("How much do you want to transfer: ");
		double transferAmount = input.nextDouble();

		System.out.print("Enter your pin: ");
		int userInput4 = input.nextInt();
		if(pin != userInput4){
			System.out.println("invalid pin ");
			nextTransaction();
		}
		if(transferAmount > balance){
			System.out.println("insuficient balance");
			nextTransaction();
		}else if(transferAmount < balance){
			 balance = balance - transferAmount;
			System.out.println("your balance is: " + balance);
			nextTransaction();
			
		}

	}

	public static void changePin(){
		int newPin;
		System.out.print("Enter previous pin: ");
		int userInput5 = input.nextInt();
		if(userInput5 != pin){
			System.out.println("invalid pin");
			nextTransaction();
		}else if(userInput5 == pin){
			System.out.print("create your new pin: ");
			newPin = input.nextInt();
			pin = newPin;
			System.out.println("your new pin is: " + newPin);
			nextTransaction();

		}
	}
	
}


	