package D3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 퍼팩트셔플 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String answer="";
			int num = sc.nextInt();
			if(num %2==0) { //짝수
				List<String> list1 = new LinkedList<>();
				List<String> list2 = new LinkedList<>();
				
				
				for(int i=0; i<num/2; i++) {
					list1.add(sc.next());
				}
				for(int i=0; i<num/2; i++) {
					list2.add(sc.next());
				}
				
				//System.out.println(list1);
				//System.out.println(list2);
				
				for(int i=0; i<num/2; i++) {
					answer += list1.get(i) + " "+list2.get(i)+" ";
				}
				
				
			}
			else {
				List<String> list1 = new LinkedList<>();
				List<String> list2 = new LinkedList<>();
				
				for(int i=0; i<num/2+1; i++) {
					list1.add(sc.next());
				}
				for(int i=0; i<num/2; i++) {
					list2.add(sc.next());
				}
				//System.out.println(list1);
				//System.out.println(list2);
				
				for(int i=0; i<num/2; i++) {
					answer += list1.get(i) + " "+list2.get(i)+" ";
				}
				answer = answer+list1.get(list1.size()-1);
			}
			
			
			
			
			System.out.println("#"+tc+" "+answer);
		}
	}
}

