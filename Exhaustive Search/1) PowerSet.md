# PowerSet
* 공집합과 자기 자신을 포함한 모든 부분집합
* 각 원소가 포함되거나 포함되지 않는 2가지 경우의 수를 계산하면 모든 부분집합의 수가 계산된다.

## 비트 연산을 활용한 PowerSet
    public class PowerSet_Bitmap {
	    public static void main(String[] args) {
		    int[] arr = {1,3,5};
		
		    for(int i=0; i<(1<<arr.length); i++) { //i는 0부터 7까지 (8개, 2^3개)
			    for(int j=0; j<arr.length; j++) {
				    if((i & (1<<j))!=0) System.out.print(arr[j]+" ");
			    }
			    System.out.println();
		    }
	    }
    }

* 원소로 1, 3, 5 를 가진 부분집합을 구해봤다.
