package java05_array.sort;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		
		// 버블 정렬
		
		//---------------------------------------------
		int[] arr = {3, 2, 5, 4, 1};
		
		//원본 출력
		System.out.println("-----정렬 전-----");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//---버블 정렬 수행---
//		for (int i = 4; i >0; i--) {//i=0일 때 3 
//			for (int j = 0; j < i; j++) {
//				
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//			
//			
//		}
		
		for(int j=0; j<arr.length-1; j++) {
			
		//각 회차 반복
		for (int i = 0; i < arr.length-1-j; i++) {//i , 0~arr.length-2
			if(arr[i] > arr[i+1]) {
				//스왑 - 인접한 요소를 비교하고 왼쪽이 크면 스왑
				int tmp=arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
			
		}
	}
		
		
		// temp
		//--결과출력--
		System.out.println();
		System.out.println("---정렬 후---");
		
		for(int i=0; i<arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("---편한 정렬 방법---");
		
		int[] arr2 = {1234,54636,4635,6567,53221};
		
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
