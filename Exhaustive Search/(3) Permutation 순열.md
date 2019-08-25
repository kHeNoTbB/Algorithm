# Permutation 순열
* 서로 다른 것들 중 몇 개를 뽑아서 한 줄로 나열하는 것

## 단순하게 순열을 생성하는 방법
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
* 위 코드는 { 1 2 3 } { 1 3 2 } { 2 1 3 } { 2 3 1 } { 3 1 2 } { 3 2 1 } 의 출력값을 갖는다.

## 재귀 호출을 통해 순열을 생성하는 방법

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
    
* 위 코드는 다음과 같은 출력값을 갖는다. [1, 2, 3] [1, 3, 2] [2, 1, 3] [2, 3, 1] [3, 2, 1] [3, 1, 2]
