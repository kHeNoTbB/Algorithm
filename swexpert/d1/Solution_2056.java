package d1;

import java.util.Scanner;

public class Solution_2056 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int i=0; i<testcase; i++) {
			int date = scan.nextInt();
			
			int year = date/10000;
			int month = (date%10000)/100;
			int day = (date%10000)%100;
			int check_month=0;
			int check_d=0;
			
			int[] check_day = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			for(int j=1; j<13; j++) {
				if(j==month) {
					check_month=1;
				}
			}
			
			for(int k=1; k<=check_day[month-1]; k++) {
				if(k==day) {
					check_d=1;
				}
			}
			
			if(check_month!=0 && check_d!=0) {
				if(month/10==0) {
					System.out.println("#"+(i+1)+" "+year+"/"+0+month+"/"+day);
				}
				else System.out.println("#"+(i+1)+" "+year+"/"+month+"/"+day);
			}
			else
				System.out.println("#"+(i+1)+" "+"-");
		}
		

	}

}
