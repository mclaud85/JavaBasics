import java.util.Scanner;

public class _01_RectangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		long area=a*b;
		System.out.println(area);		
	}
}
