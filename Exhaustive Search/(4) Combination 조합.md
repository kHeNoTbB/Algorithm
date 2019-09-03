# Combination 조합
* 조합이란 집합에서 일부 원소를 취해 부분집합을 만드는 방법이다.
* 따라서 powerset과 달리, 전체 원소가 5개라면, 그 중 3개의 원소를 취해 부분집합을 만들 수 있다.

## 코드 
    import java.util.Arrays;

    public class two {
	
	    static void combination(int[] arr, int n, int c, int[] sel) {
	    	if (c == sel.length) {
		    	System.out.println(Arrays.toString(sel));
		    	return;
		    }
		    if (n == arr.length) {
		    	return;
		    }

		    sel[c] = arr[n];
		    combination(arr, n + 1, c + 1, sel);
		    combination(arr, n + 1, c, sel);
	    }
	
	    public static void main(String[] args) {
		    int[] arr = {1,2,3,4};
		    combination(arr, 0, 0, new int[2]);
	    }
    }

# 중복 조합
## 코드
	static void mul_combination(int[] arr, int n, int c, int[] result) {
		if(c==result.length) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+ " ");
			}System.out.println();
			return;
		}
		if(n==arr.length) return;
		
			result[c] = arr[n];
			mul_combination(arr, n, c+1, result);
			mul_combination(arr, n+1, c, result);

	}
