package chapter1;
import java.util.Scanner;

public class BaekJoon1919 {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - 'a']++;
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		My code
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//		char[] arr1 = s1.toCharArray();
//		char[] arr2 = s2.toCharArray();
//		int ans = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				if (arr1[i] == arr2[j]) arr1[i] = arr2[j] = '0';
//			}
//		}
//		
//		for (char c : arr1) {
//			if (c != '0') ans++;
//		}
//		for (char c : arr2) {
//			if (c != '0') ans++;
//		}
//		System.out.println(ans);
		
		String a = sc.next();
		String b = sc.next();
		
		int[] a_count = getAlphabetCount(a);
		int[] b_count = getAlphabetCount(b);
		
		int ans = 0;
		for (int i = 0; i < 26; i++) 
			ans += Math.abs(a_count[i] - b_count[i]);
			
//			if (a_count[i] > b_count[i])
//				ans += a_count[i] - b_count[i];
//			else if (b_count[i] > a_count[i])
//				ans += b_count[i] - a_count[i];
		System.out.println(ans);
		sc.close();
	}
}
