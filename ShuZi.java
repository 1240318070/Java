package 河北省程序设计大赛;

import java.util.Scanner;

public class ShuZi {

	public static void main(String[] args) {
		System .out.println("");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		System .out.println(a[n-1][n-1]);
		int raw1 = 0, line1 = 0, raw2 = n-1, line2 = n-1;
		int time = 1;
		while (raw1 <= raw2 || line1 <= line2) {
			if (line1 <= line2) {
				for (int i = line1; i <= line2; i++) {
					a[raw1][i] =time++; 
				}
				raw1++;
			}
			if (raw1 <= raw2) {
				for (int i = raw1; i <= raw2; i++) {
					a[i][line2] =time++; 
				}
				line2--;
			}
			if (line1 <= line2) {
				for (int i = line2; i >= line1; i--) {
					a[raw2][i] =time++; 
				}
				raw1++;
			}
			if (raw1 <= raw2) {
				for (int i = line1; i <= line2; i++) {
					a[raw1][i] =time++; 
				}
				raw2--;
			}
			
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
