import java.util.Arrays;

/*
 * 정렬된 정수형 배열을 입력받아 중복이 존재하는 숫자를 삭제함
 * 반환값은 새로 구성되는 배열의 길이
 * 추가 메모리를 사용하지 않고 중복을 제거해야 함
 */

public class Array_deleteDuplication {
	static public int deleteDuplication(int[] arr) {
		if(arr.length<=1) return arr.length;
		int res = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[i-1]) continue;
			//else res++;
			arr[res++] =arr[i]; //중복아닌 숫자를 앞에서부터 채워넣는다.
		}
		System.out.println(Arrays.toString(arr));
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,3,4,5};
		int ans = deleteDuplication(arr);
		System.out.print(ans);
	}
}
