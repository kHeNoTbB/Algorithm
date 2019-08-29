# [냉장고](http://jungol.co.kr/theme/jungol/status.php?sca=&sop=and&fcode=1828&fid=publu05&flang=0)
    import java.util.Arrays;
    import java.util.Scanner;

    public class 냉장고2 {
	    static class Point implements Comparable<Point> {
		    int x;
		    int y;

		    Point(int x, int y) {
			    this.x = x;
			    this.y = y;
		    }

		    @Override
		    public int compareTo(Point o) {
			    // TODO Auto-generated method stub
			    return this.y-o.y;
		    }
	    }
	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    Point[] p = new Point[N];
		    for(int i=0; i<N; i++) {
			    p[i] = new Point(sc.nextInt(), sc.nextInt());			
		    }
		
		    // (1) 재료의 최대 온도 오름차순 정렬
		    Arrays.sort(p);
		
		    //(2) 새로운 재료의 최저온도가 현재 최대온도보다 작다면 ㅇㅋ
		    //새로운 재료의 최저온도가 현재 최대온도보다 크다면, 냉장고 추가/온도갱신

		    int re_num=1;
		    int max_tmp=p[0].y;
		    for(int i=1; i<N; i++) {
			    if(p[i].x>max_tmp) {
				    re_num++;
				    max_tmp = p[i].y;
			    }
			
		    }
		    System.out.println(re_num);
	    }
    }
