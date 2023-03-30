package chapter1;
import java.util.Scanner;

public class BaekJoon2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		My code
//		String input = sc.nextLine();
//		String output = "";
//		for (int i = 0; i < input.length(); i++) {
//			char c = input.charAt(i);
////			A(65), a(97)
//			c += c < 'a' ? 32 : -32;
//			output += c;
//		}
//		System.out.println(output);
		
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z')
				System.out.print((char)('a' + ch - 'A'));
			else
				System.out.print((char)('A' + ch - 'a'));
		}
		sc.close();
	}
}
