package review.day01;

import util.PrintUtil;
import util.SwapUtil;

// 버블 정렬 복습 2022-02-08
public class Main_220208 {

	public static void main(String[] args) {
		
		// 버블 정렬용
		int[] arr = {3, 5, 2, 4, 1};
		
		int length = arr.length - 1;
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<length-i; j++) {
				// 오른쪽이 큰 값이라는걸 항상 명심
				if(arr[j] > arr[j+1]) {
					SwapUtil.swap(arr, j, j+1);
				}
			}
		}
		
		PrintUtil.print(arr);
		
	}
}
