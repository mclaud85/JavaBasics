import java.util.Scanner;
public class _06_FormattingNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		
		int a= input.nextInt();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		String hexadecimal= Integer.toHexString(a).toUpperCase();
		int binary = Integer.parseInt(Integer.toBinaryString(a));
		
		// |FE        |0011111110|     11.60|0.500     |
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|\n",hexadecimal,binary,b,c);
	}
}
