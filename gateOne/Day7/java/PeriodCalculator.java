import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class PeriodCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	


	

	System.out.println("PERIOD TRACKER APP");

	System.out.println("");

	System.out.println("Menstrual circle is a natuaral process. it is a complex circle controlled by female hormones that cause regular bleading(periods).");

	System.out.println("");
	System.out.println("");

        
        System.out.println("Enter the start date of your menstrual cycle: ");
        String startDate = scanner.nextLine();


	System.out.println("Enter the Last date of your menstrual cycle:");
        String lastDate = scanner.nextLine();

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YYYY, locale.ENGLISH");
	Date  date1 = sdf.parse("startDate");
	Date  date2 = sdf.parse("lastDate");

	}
}