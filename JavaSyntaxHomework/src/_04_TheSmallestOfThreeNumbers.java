import java.util.Scanner;
import java.text.DecimalFormat;
public class _04_TheSmallestOfThreeNumbers {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		double min=Double.MAX_VALUE;
		
		for (int i = 1; i <=3; i++) {
			double number=input.nextDouble();
			if (number <min) {
				min=number;
				
			}			
		}
		
		System.out.println(df.format(min));
	}
}
