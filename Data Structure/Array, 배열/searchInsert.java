import java.util.Arrays;

/*
 * https://www.neya.kr/132?category=766997
 * 삽입 위치 구하기
 */
public class Array_binarySerach {
	public static int binarySearch(int[] arr, int target) {
		return Arrays.binarySearch(arr, target);
	}
	
	public static int searchInsert(int[] arr, int target) {				
		int start = 0;
		int mid = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==target) return mid;
			else if(target<arr[mid]) end=mid-1; //아무튼 mid보다는 idx가 1작은 숫자니까!!!
			else start=mid+1;
		}
		
		return start;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int target = 5;

		System.out.println(searchInsert(arr, target));
		System.out.println(binarySearch(arr, target));
	}
	
}
