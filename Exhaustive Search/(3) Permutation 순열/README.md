# [Permutation ����](https://bcp0109.tistory.com/14)
* ���� �ٸ� �͵� �� �� ���� �̾Ƽ� �� �ٷ� �����ϴ� ��
* 1���� N���� M���� ������� ����. ��, ������ ������ �ߺ��� ����.
* ������� **swap**�� **visited**�� �ִ�.


## �ܼ��ϰ� ������ �����ϴ� ���
    public class loop {
    	public static void main(String[] args) {
	    	for(int i=1; i<=3; i++) {
		    	for(int i2=1; i2<=3; i2++) {
			    	if(i!=i2) {
				    	for(int i3 =1; i3<=3; i3++ ) {
					    	if(i3!=i && i3!=i2)
						    	System.out.println(i + " "+ i2 +" "+ i3);
					    }
			    	}
		    	}
	    	}
    	}
    }
* �� �ڵ�� { 1 2 3 } { 1 3 2 } { 2 1 3 } { 2 3 1 } { 3 1 2 } { 3 2 1 } �� ��°��� ���´�.

## swap�� �̿��� ����

    import java.util.Arrays;
    public class recur {
	    public static void main(String[] args) {
		    perm(new int[] {1,2,3}, 0);
	    }
	    static void perm(int[] arr, int k) {
		    if(k==arr.length) {
			    System.out.println(Arrays.toString(arr));
			    return;
		    }
		    for(int i=k; i<arr.length; i++) {
			    swap(arr, i, k);
			    perm(arr, k+1);
			    swap(arr, i, k);
		    }
	    }
	
	    static void swap(int[] arr, int a, int b) {
    //		    arr[a] <=swap=> arr[b]
		    int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
	    }
    }
    
* �� �ڵ�� ������ ���� ��°��� ���´�. [1, 2, 3] [1, 3, 2] [2, 1, 3] [2, 3, 1] [3, 2, 1] [3, 1, 2]
* �迭�� ù ������ ������� �ϳ��� �ٲٸ� ��� ���� �� ���� swap�Ѵ�.
* �����ϰ� �ڵ嵵 ����ϰ� ��������, �������� ������ ������� �ʴ´�.

## visited �迭�� �̿��� ����
    import java.util.Scanner;

    public class one_2 {
	
	    static void perm(int[] arr, int c, int[] result, boolean[] visited) {
		    if (c == result.length) {
			    for(int i=0; i<result.length; i++) {
				    System.out.print(result[i]+" ");
			    }System.out.println();
			    return;
		    }
		    for (int i = 0; i < arr.length; i++) {

			    if (!visited[i]) {
				    visited[i] = true;
				    result[c] = arr[i];
				    perm(arr, c + 1, result, visited);
				    visited[i] = false;
			    }
		    }

	    }
	    static int N;
	    static int M;
	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    N = sc.nextInt();
		    M = sc.nextInt();
		
		    int[] arr = new int[N];
		    for(int i=1; i<=N; i++) {
			    arr[i-1]=i;
		    }
		
		    perm(arr, 0, new int[M], new boolean[N]);
	    }
    }
* {1, 2, 3, 4} �� 2���� ������ ������� �����ϱ�? 
      
      [1, 2]
      [1, 3]
      [1, 4]
      [2, 1]
      [2, 3]
      [2, 4]
      [3, 1]
      [3, 2]
      [3, 4]
      [4, 1]
      [4, 2]
      [4, 3]
* �� ��� ������, �������� �ֳ�? for������ �ۼ��� �� ������? �켱 ���� ������ ���ڵ��� 1~4�� ���� �����Ѵ�. �׸��� �� �ڿ� ���� �ڱ� �ڽ��� ���� �� ���� ���������� �����Ѵ�.
* ���� ��� �κп��� ���� ū for���� i=0���� arr.length���� ���������� �����Ѵ�. �׸���, �־��� index i�� �ش��ϴ� ���� �����ؾ� �ϱ� ������ visited�� true�� �ٲ��ְ�, �̸� ������ �͵� �߿��� ���� ���� �ε��� ���� �迭���� result�� ���������� ���� �ȴ�. ������ ���� �� �� �ܰ�� ���ư��� ���� visited[i]=flase; �κ��� �ǰڴ�. ���� ���̿� ���� �����ϰ� Ž���ϰ�, Ž���� ��ġ�� �������ǿ� ���� return�� �ϸ� �� �� ������ ȸ���ϰ� �Ǵ� ������ ���� �ִ�.

      
