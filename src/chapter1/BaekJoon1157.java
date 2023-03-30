package chapter1;
import java.util.Scanner;

public class BaekJoon1157 {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - 'A']++;
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		My code
//		# of A to Z is 32
//		int[] arr = new int[32];
//		String s = sc.nextLine().toUpperCase();
//		char c = 0;
//		for (int i = 0; i < s.length(); i++) {
//			arr[s.charAt(i) - 'A']++;
//		}
//		int max = 0;
//		int idx = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] >= max) {
//				max = arr[i];
//				idx = i;
//			}
//		}
//		c = (char)(idx + 'A');
//		for (int i = 0; i < idx; i++) {
//			if (arr[i] == arr[idx]) {
//				c = '?';
//				break;
//			}
//		}
//		System.out.println(c);
		
		String str = sc.next().toUpperCase();
		int[] count = getAlphabetCount(str);
		
		int max_count = -1;
		char max_alphabet = '?';
		for (int i = 0; i < 26; i++) {
			if (count[i] > max_count) {
				max_count = count[i];
				max_alphabet = (char)('A' + i);
			}
			else if (count[i] == max_count)
				max_alphabet = '?';
		}
		System.out.println(max_alphabet);
		sc.close();
	}
}