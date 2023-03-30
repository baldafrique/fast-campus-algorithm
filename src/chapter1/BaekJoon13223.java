package chapter1;
import java.util.Scanner;

public class BaekJoon13223 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Parsing1
//		String cur = sc.nextLine();
//		String drop = sc.nextLine();
		
//		int cur_h = Integer.parseInt(cur.substring(0, 2));
//		int cur_m = Integer.parseInt(cur.substring(3, 5));
//		int cur_s = Integer.parseInt(cur.substring(6, 8));
//		
//		int drop_h = Integer.parseInt(drop.substring(0, 2));
//		int drop_m = Integer.parseInt(drop.substring(3, 5));
//		int drop_s = Integer.parseInt(drop.substring(6, 8));
		
//		int gap_h = drop_h - cur_h;
//		int gap_m = drop_m - cur_m;
//		int gap_s = drop_s - cur_s;
		
//		Parsing2
		String[] cur = sc.nextLine().split(":");
		String[] drop = sc.nextLine().split(":");
		
		int cur_h = Integer.parseInt(cur[0]);
		int cur_m = Integer.parseInt(cur[1]);
		int cur_s = Integer.parseInt(cur[2]);
		
		int drop_h = Integer.parseInt(drop[0]);
		int drop_m = Integer.parseInt(drop[1]);
		int drop_s = Integer.parseInt(drop[2]);
		
//		calculating1
//		if (gap_s < 0) {
//			gap_s += 60;
//			gap_m--;
//		}
//		if(gap_m < 0) {
//			gap_m += 60;
//			gap_h--;
//		}
//		if(gap_h <= 0) {
//			gap_h += 24;
//		}
		
//		calculating2
		int cur_second = cur_h * 60 * 60 + cur_m * 60 + cur_s;
		int drop_second = drop_h * 60 * 60 + drop_m * 60 + drop_s;
		int gap_second = drop_second - cur_second;
		if (gap_second <= 0) gap_second += 24 * 60 * 60;
		
		int gap_h = gap_second / (60 * 60);
		int gap_m = gap_second % (60 * 60) / 60;
		int gap_s = gap_second % 60;
		
//		print1
//		String ans = "";
//		if (gap_h < 10) ans += "0" + gap_h + ":";
//		else ans += gap_h + ":";
//		if (gap_m < 10) ans += "0" + gap_m + ":";
//		else ans += gap_m + ":";
//		if (gap_s < 10) ans += "0" + gap_s;
//		else ans += gap_s;
//		System.out.println(ans);
		
//		print2
//		String ans = String.format("%02d:%02d:%02d", gap_h, gap_m, gap_s);
//		System.out.println(ans);
		
//		print3
		System.out.printf("%02d:%02d:%02d", gap_h, gap_m, gap_s);
		sc.close();
	}
}

