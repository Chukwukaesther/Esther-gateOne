import java.util.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateOfBirth {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
	

		System.out.print("Enter date of birth: ");
		String dateOfBirth = input.nextLine();

		int age = date(dateOfBirth);
		System.out.print(age + " years old");
	}


	public static int date(String dateOfBirth){
		DateTimeFornattter format = DateTimeformatter.ofPattern("dd.mm.yyyy);
		LocalDate birthDayay = LocalDate.parse(dateOfBirth,format);

		
		int newdateOfBirth = Integer.valueOf(dateOfBirth);
		LocalDate now = LocalDate.now();
		period age = period.between(birthday,now

		return age.getYears();


	}
}



 