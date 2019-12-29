package D3;

import java.util.Scanner;
public class String_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int a=sc.nextInt();
			String find = sc.next();
			String str = sc.next();
			int answer = 0;
			
			for(int i=0; i<str.length()-find.length()+1; i++) {
				int j=1;
				int flag=0;
				int find_length=find.length()-1;
				if(str.charAt(i)==find.charAt(0)) {
					while((find_length--)!=0) {
						if(str.charAt(i+j)!=find.charAt(0+j)) flag=1;
						j++;
					}
					if(flag==0) answer++;
				}
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
}
