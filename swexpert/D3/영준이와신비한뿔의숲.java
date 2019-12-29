package D3;

import java.util.Scanner;
public class 영준이와신비한뿔의숲 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int horn = sc.nextInt();
			int animal = sc.nextInt();
			int twin = 0;
			for(int i=0; i<=animal; i++)
				if(animal+i==horn) {twin=i; break;}
			System.out.println("#"+tc+" "+ (animal-twin) + " " + twin);
		}
	}
}

