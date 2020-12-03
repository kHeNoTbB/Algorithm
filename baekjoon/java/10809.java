import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().trim();
		char[] str = s.toCharArray();
		int[] a = new int[26];
		Arrays.fill(a, -1);
		
		for(char c : str) {
			if(a[c-97]==-1) a[c-97] = s.indexOf(c);	
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<a.length; i++) {
			sb.append(a[i]+" ");
		}
		System.out.println(sb.toString());
	}
}
