public class 이분탐색 {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6, 777, 8, 9, 10, 11, 12, 13, 14, 17, 22, 23, 24, 25, 26, 27, 30, 42};
		
		//포함을 확인해야 하는 숫자는 17이다.
		int find = 17;
		int idx = 0;
		
		int first = 0;
		int last = num.length-1;
		int mid = 0;
		while(true) {
			mid = (first+last)/2;
			if(num[mid]==find) {
				idx= mid;
				break;
			}
			else {
				if(num[mid]<find) {
					first = mid;
				} else {
					last = mid;
				}
			}
		}
		
		System.out.println(idx);
	}
}
