import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PeriodCalculator{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);


		System.out.print("PERIOD TRACKER APP");
		System.out.print("Menstrual circle is a natuaral process. it is a complex circle controlled by female hormones that cause regular bleading(periods)");

		System.out.print("Enter the date your period started: dd/MM/yyyy: ");
		String dateOfPeriod = input.nextLine();
	}


	int lengthOfCircle = 28;
	int anotherperiodDate = 0;

	public static int periodTracker(String DateOfPeriod){
		

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate anotherDateOfPeriod = LocalDate.parse(dateOfPeriod,format);
		LocalDate now = LocalDate.now();
		 

	
	 	int anotherPeriodDate = dateofPeriod + lengthOfCircle;
			
		return anotherPeriodDate;	
	
	}
		
		


}





