import java.util.Scanner;
import java.util.Arrays;
	public class StudentsGrade {
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int[][] studentGrade;
	

	System.out.println("How many students do you have?: ");
		int studentNumbers = input.nextInt();


	System.out.println("How many Subject do they offer?: ");
		int subjectNumbers = input.nextInt();

	studentGrade = new int[studentNumbers][subjectNumbers];
	double[] theAverage = new double[studentNumbers];

	
	
	for(int row = 0; row < studentGrade.length; row++){

		int total = 0;
		System.out.println("This is for student" + (row+1));

		for(int col = 0; col < subjectNumbers; col++){
			
			int count = 0;
			while(count == 0){
				
				System.out.println("Entering student score from 0 to 100 for subject" + (col+1));
				studentGrade[row][col] = input.nextInt();

				if(studentGrade[row][col] > 0 && studentGrade[row][col] < 100){
				count++;
				total += studentGrade[row][col];
				theAverage[row] = (double) total / subjectNumbers;

				}

			}
		}

	}
	System.out.println("saving" + "<".repeat(52));
	System.out.println("##############################################################################");
	
	System.out.print("STUDENT     ");
	for(int esther = 0; esther < subjectNumbers; esther++){
		System.out.print("SUB" + (esther+1) + "   ");
	}
	System.out.print("TOT   AVE   POS");

	System.out.println("\n##############################################################################");
	Arrays.sort(theAverage);

	
	for(int index = 0; index < studentNumbers; index++){
		int total = 0;
		System.out.print("student "+(index+1) +"   ");
		
		for(int digit = 0; digit < subjectNumbers; digit++){
			System.out.print(studentGrade[index][digit] + "     ");
			total += studentGrade[index][digit];
		}
		System.out.print(total + "   ");
		System.out.print(total / subjectNumbers + "   ");

		for(int num = 0; num < studentNumbers; num++){
			if((double) total / studentNumbers == theAverage[num]){
				System.out.println(num+1);
				
			}
			
		}
		System.out.println();

	}

			
			
	
}


}
	