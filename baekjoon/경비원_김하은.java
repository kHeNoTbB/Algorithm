import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int R = sc.nextInt();
		int num = sc.nextInt();
		int[] dist = new int[num+1];
		
		for(int i=0; i<num+1; i++) {
			switch (sc.nextInt()) {
			case 1:
				dist[i] = sc.nextInt();
				break;
			case 2:
				int tmp = sc.nextInt();
				dist[i] = C+R+C-tmp;
				break;
			case 3:
				int tmp2 = sc.nextInt();
				dist[i] = (C+C+R+R)-tmp2;
				break;
			case 4:
				int tmp3 = sc.nextInt();
				dist[i] = C+tmp3;
				break;
			default:
				break;
			}
		}		
		
		int sum=0;
		for(int i=0; i<dist.length-1; i++) {
			int dist_tmp = Math.abs(dist[i]-dist[num]);
			if(dist_tmp<C+R) {
				sum += dist_tmp;
			}
			
			else sum+=2*(C+R)-dist_tmp;
		}
		System.out.println(sum);
		
	}
	
	
}
