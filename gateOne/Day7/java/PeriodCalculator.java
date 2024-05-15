import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PeriodCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	




	System.out.println("PERIOD TRACKER APP");
	System.out.println("Menstrual circle is a natuaral process. it is a complex circle controlled by female hormones that cause regular bleading(periods).");

	System.out.println("");
	System.out.println("");

        
        System.out.println("Enter the start date of your menstrual cycle (in dd/MM/yyyy format):");
        String startDate = scanner.nextLine();
		
	System.out.println("Enter the cycle length: ");
	int cycleLength = input.nextInt();
	LocalDate localDate = LocalDate.now();
	if(cycleLength < 21 || cycleLength > 35){
		System.out.print("irregular cycle." );
		}
		if (cycleLength > 21||cycleLength < 35) {
			System.out.println("Regular period");
		}

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String myFormat = localDate.format(formatter);
			LocalDate startDate = LocalDate.parse(firstDate, formatter);
		
			LocalDate nextPeriod = firstDates.plusDays(cycleLength);
			System.out.println("Next Period: " + nextPeriod);

		
			LocalDate flowDates = nextPeriod.plusDays(periodLength);
			System.out.println("Expected period duration:" + nextPeriod + "-" +  flowDates);

		
			LocalDate ovulationDate = firstDates.minusDays(14);
			LocalDate fertilePeriod = ovulationDate.minusDays(5);
			LocalDate fertilePeriod2 = ovulationDate.plusDays(1);

			LocalDate safePeriod = firstDates.plusDays(14);
		
			System.out.println("Ovulation Day next Month: " +ovulationDate);
			System.out.println("Your fertile period is from:" + fertilePeriod + "-" + fertilePeriod2); 
			System.out.println("Safe Period Days: " + startDate  + "-" +  safePeriod);
		
	}
}

	
	
	
