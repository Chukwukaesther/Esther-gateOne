import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PeriodCalculator {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
	

	System.out.println("PERIOD TRACKER APP");
	System.out.println("Menstrual circle is a natuaral process. it is a complex circle controlled by female hormones that cause regular bleading(periods).");

	System.out.println("");
	System.out.println("");

	int periodLength;
        String startDate;

	System.out.println("How long do your period last?");
        periodLength = input.nextInt();

        System.out.println("Enter the start date of your menstrual cycle (in dd/MM/yyyy format):");
        startDate = input.next();
		
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
			LocalDate startDates = LocalDate.parse(startDate, formatter);
		
			LocalDate nextPeriod = startDates.plusDays(cycleLength);
			System.out.println("Next Period: " + nextPeriod);

		
			LocalDate flowDates = nextPeriod.plusDays(periodLength);
			System.out.println("Next period duration:" + nextPeriod + "-" +  flowDates);

		
			LocalDate ovulationDate = startDates.minusDays(14);
			LocalDate fertilePeriod = ovulationDate.minusDays(5);
			LocalDate fertilePeriodTwo = ovulationDate.plusDays(1);

			LocalDate safePeriod = startDates.plusDays(14);
			System.out.println("Safe Period Days: " + startDates  + "-" +  safePeriod);	
			System.out.println("Ovulation Day next Month: " +ovulationDate);
			
			System.out.println("fertile period is from:" + fertilePeriod + "-" + fertilePeriodTwo); 
			
		
	}
}

	
	
	
