package D3;

import java.util.Scanner;

public class 안경이없어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String str = sc.next();
			String str2 = sc.next();
			int[] st = new int[str.length()];
			int[] st2 = new int[str2.length()];
			
			int flag=0;
				for(int i=0; i<str.length(); i++) {
					if(str.split("")[i].equals("A") || str.split("")[i].equals("D") ||str.split("")[i].equals("O") ||str.split("")[i].equals("P")||
							str.split("")[i].equals("Q") || str.split("")[i].equals("R")) st[i]=0;
					else if(str.split("")[i].equals("B")) st[i]=1;
					else st[i]=2;
				}
				for(int i=0; i<str2.length(); i++) {
					if(str2.split("")[i].equals("A") || str2.split("")[i].equals("D") ||str2.split("")[i].equals("O") ||str2.split("")[i].equals("P")||
							str2.split("")[i].equals("Q") || str2.split("")[i].equals("R")) st2[i]=0;
					else if(str2.split("")[i].equals("B")) st2[i]=1;
					else st2[i]=2;
				}
			
			
			
			for(int i=0; i<str.length(); i++) {
				if(str.length()!=str2.length()) {flag=1; break;}
				else if(st[i]!=st2[i]) {
					flag=1;
					break;
				}
			}
            
            System.out.print("#"+tc+" ");
			if(flag==0) System.out.println("SAME");
			else System.out.println("DIFF");
			
			
		}
	}
}

