package chapter1;
import java.util.Scanner;

public class BaekJoon1543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.nextLine();
		String word = sc.nextLine();
		
//		My code
//		int ans = 0;
//		
//		while (doc.indexOf(word) != -1) {
//			doc = doc.replaceFirst(word, "X");
//			ans++;
//		}
//		
//		System.out.println(ans);
		
		
//		Solution1
//		int count = 0;
//		for (int i = 0; i < doc.length(); i++) {
//			boolean match = true;
//			for (int j = 0; j < word.length(); j++) {
//				if (i + j >= doc.length() ||
//						doc.charAt(i + j) != word.charAt(j)	) {
//					match = false; break;
//				}
//			}
//			if (match) {
//				count++;
//				i += word.length() - 1;
//			}
//		}
		
//		Solution2
//		int count = 0;
//		int start_idx = 0;
//		while (true) {
//			int idx = doc.indexOf(word, start_idx);
//			if (idx < 0) break;
//			count++;
//			start_idx = idx + word.length();
//		}
//		System.out.println(count);
		
//		Solution3
		int doc_length = doc.length();
		int word_length = word.length();
		int replaced_length = doc.replace(word, "").length();
		int count = (doc_length - replaced_length) / word_length;
		System.out.println(count);
		sc.close();
	}
}
