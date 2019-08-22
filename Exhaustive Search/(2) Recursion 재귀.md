# Recursion 재귀
* 반복과 재귀는 유사한 작업을 수행할 수 있다.
* 무작정 수행하는 작업이 완료될 때 까지 반복하는 반복과 달리, 재귀는 주어진 문제의 해를 구하기 위해 동일하면서 더 작은 해를 이용한다.
* 기본부분(basis part)과 유도파트(inductive part)로 나뉜다.
* 함수 호출은 프로그램 메모리 구조에서 스택을 사용한다. 따라서 재귀 호출은 반복적인 스택의 사용을 의미하며, 메모리 및 속도에서 성능저하가 발생할 수 밖에 없다.

## 재귀를 이용한 0~9까지 출력하기
    public class recur {
    	public static void main(String[] args) {
		    recursion(10,0);
    	}
	
	    static void recursion(int n, int idx) {
	    	//기저파트(재귀 함수가 종료되는 조건)
	    	if(idx==n)
		    	return;
		
	    	System.out.println(idx);
		    recursion(n, idx+1);
	    }
    }

## 재귀를 이용한 PowerSet
    public class PowerSet_recur {
	    public static void main(String[] args) {
		    int[] arr = {3,5,1};
		    powerset(arr, 0, new boolean[arr.length]);
	    }
	    static void powerset(int[] arr, int idx, boolean[] sel) {
		    if(idx==arr.length) {
			    for(int i=0; i<arr.length; i++) {
				    if(sel[i]) System.out.print(arr[i] + " ");
			    }
			    System.out.println();
			    return;
		    }
		    sel[idx]=true;
		    powerset(arr, idx+1, sel);
		    sel[idx]=false;
		    powerset(arr, idx+1, sel);
	    }
    }
* Bitmap을 이용하여 powerset을 구하기도 했지만, 재귀를 이용해도 얼마든지 가능하다.
