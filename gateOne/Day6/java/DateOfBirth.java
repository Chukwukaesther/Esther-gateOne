import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateOfBirth {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
	

		System.out.print("Enter date of birth format: dd/MM/yyy: ");
		String dateOfBirth = input.nextLine();

		int age = yearCalculator(dateOfBirth);
		System.out.println(age + " years old");
	}


		public static int yearCalculator(String dateOfBirth){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDay = LocalDate.parse(dateOfBirth,format);
		
		LocalDate now = LocalDate.now();
		Period age = Period.between(birthDay,now);

		return age.getYears();


		}
}



 