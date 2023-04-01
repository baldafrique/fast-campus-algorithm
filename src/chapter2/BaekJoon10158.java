package chapter2;

import java.util.Scanner;

public class BaekJoon10158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int currX = sc.nextInt();
        int currY = sc.nextInt();
        int t = sc.nextInt();
        boolean isRight = true;
        boolean isUp = true;
        for (int i = 0; i < t; i++) {
            int nextX = currX + (isRight ? 1 : -1);
            int nextY = currY + (isUp ? 1 : -1);
            if (nextX < 0 || nextX > w) {
                isRight = !isRight;
                i--;
            }
            else if (nextY < 0 || nextY > h) {
                isUp = !isUp;
                i--;
            }
            else {
                currX = nextX;
                currY = nextY;
            }
        }
        System.out.printf("%d %d\n", currX, currY);
        sc.close();
    }
}
