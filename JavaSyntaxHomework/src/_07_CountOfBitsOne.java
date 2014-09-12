import java.util.Scanner;
public class _07_CountOfBitsOne {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int count=0;
		
		for (int i = 0; i < 32; i++) {
			
			if ( (n & 1) == 1) {
				count++;
			}
			n= n>>1;
		}
		
		System.out.println(count);
	}
}
