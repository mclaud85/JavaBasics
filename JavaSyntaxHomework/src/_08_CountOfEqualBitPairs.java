import java.util.Scanner;
public class _08_CountOfEqualBitPairs {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		
		int n=input.nextInt();		
		int count=0;
		
		String bin = Integer.toBinaryString(n);
		char[] chars = bin.toCharArray();
		
		for (int i = 0; i < chars.length-1; i++) {
			if (chars[i] == chars[i+1]) {
				count++;
				}			
		}
		System.out.println(count);		
	}
}
