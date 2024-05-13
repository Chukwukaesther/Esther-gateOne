import java.util.Random;
import java.util.Scanner;
public class AtmMachine{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();




		System.out.println("Welcome to Atm");

		int pin ;
		int accountNumber;
		Double balance;

		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();


		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
		
		accountNumber = random.nextInt(1, 2500);
		System.out.println("This is your account number: " + accountNumber);

		
		System.out.print("Enter your pin: ");
		pin = input.nextInt();

		System.out.println("Account created successfully");
		System.out.println("FirstName: " + firstName);
		System.out.println("LastName: " + lastName);
		System.out.println("Pin: " + pin);


		System.out.print("Enter your account number: ");
		accountNumber = input.nextInt();

		System.out.print("Enter your pin: ");
		pin = input.nextInt();

		System.out.print("Enter the amount you want to deposit: $");
		double depositAmount = input.nextDouble();

		if(depositAmount > 0){
			System.out.print("Deposit Successful");

			balance = depositAmount;
		}
		
		System.out.print("How much do you wish to withdraw");
		int withdrawAmount = nextInt();

		
		if(balace < amount){

		} 



		} 


		



		





	}
}
		


		



		



		



		



		

		


		


