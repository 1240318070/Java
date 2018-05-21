package 河北省程序设计大赛;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ProblemA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for (int j = 0; j < i; j++) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			int a4 = sc.nextInt();
			int sum = 0;
			sum = a1 + a2 + a3 + a4;
			if (sum >= 305 && a1 >= 85 && a4 >= 85 && a2 >= 55 && a3 >= 55) {
				if (sum >= 370) {
					System.out.println("A");
				}
				else {
					System.out.println("B");
				}
			}
			else System.out.println("C");
		}
	}

}


/*3
100 80 85 120
90 60 65 110
140 50 75 135
*/