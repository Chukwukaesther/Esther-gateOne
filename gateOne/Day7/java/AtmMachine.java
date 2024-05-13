import java.util.Scanner;
public class AtmMachine{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);




		System.out.println("Welcome to Atm");


		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();


		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();

		
		System.out.print("Enter your pin: ");
		int pin = input.nextInt();

		System.out.println("Account created successfully");
		System.out.println("FirstName: " + firstName);
		System.out.println("LastName: " + lastName);
		System.out.println("Pin: " + pin);


		System.out.print("Enter your account number");
		String accountNumber = input.nextLine();

		System.out.print("Enter your pin");
		int pin = input.nextInt();

		System.out.print("Enter the amount you want to deposit: $");
		double depositAmount = input.nextDouble();

		if(depositAmount > 0){
			//deposit(depositAmount);
			System.out.print("Deposit Successful");


		} 


		



		





	}
}
		


		



		



		



		



		

		


		


