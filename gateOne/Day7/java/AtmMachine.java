import java.util.Random;
import java.util.Scanner;
public class AtmMachine{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();




		System.out.println("Welcome to Atm");

		int accountNumber;;
		int pin ;
		Double balance = 0;
		Double newBalance = 0;

		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();


		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
		
		accountNumber = random.nextInt(1, 11111);
		System.out.println("This is your account number: " + accountNumber);

		
		System.out.print("Enter your pin: ");
		pin = input.nextInt();
		

		System.out.println("Account created successfully");
		System.out.println("FirstName: " + firstName);
		System.out.println("LastName: " + lastName);
		System.out.println("Pin: " + pin);

		String  option = """
		1. Deposit money
		2. widthdraw money
		3. Check Account balance
		4. Transfer
		7. Change pin
		 """';
		



		



		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();

		System.out.print("Enter your pin to deposit: ");
		pin = input.nextInt();
		if(pin != 4){
			
			System.out.print("invalid pin");
		}
 
		System.out.print("Enter the amount you want to deposit: $");
		double depositAmount = input.nextDouble();

		if(depositAmount > 0){
			System.out.println("Deposit Successful");

			newBalance = deposit + Balance;
		}
		
		System.out.print("How much do you wish to withdraw");
		int withdrawAmount = input.nextInt();

		
		//if(balace < amount){

		//} 






		



		





	}
}
		


		



		



		



		



		

		


		


