
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PeriodCalculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
	System.out.print("PERIOD TRACKER APP");
	System.out.print("Menstrual circle is a natuaral process. it is a complex circle controlled by female hormones that cause regular bleading(periods)");

        
        System.out.println("Enter the start date of your menstrual cycle (in dd/mm/yyyy format):");
        String startDate = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(startDate, formatter);
        
        System.out.println("Enter the number of days in your cycle:");
        int cycleLength = scanner.nextInt();
        
        System.out.println("Enter the number of days since the start of your cycle:");
        int daysSinceStart = scanner.nextInt();
        
        
       
    }	
}
