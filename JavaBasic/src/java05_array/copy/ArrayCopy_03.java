package java05_array.copy;

public class ArrayCopy_03 {

	public static void main(String[] args) {
		
		int[] arr1 = {50, 60, 70 };
		int[] arr2;
		
		//1. 데이터가 복사될 공간을 새롭게 생성한다
		arr2 = new int[arr1.length];
		
		//2. 데이터를 복사한다 - Systen.arrayCopy() 메소드 이용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		// -> src배열을 dest 배열로 복사하는 기능
		
		// -> src		- 원본 배열
		// -> srcPos 	- 원본 배열에서 복사가 시작될 인덱스
		// -> dest		- 사본 배열
		// -> destPos	- 사본 배열에 복사가 시작될 인덱스
		// -> length	- 복사가 될 요소의 개수
		
		
		System.out.println("arr1 : " + arr1 + ", arr2 : " + arr2);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("--------------------------");
		
		arr2[1] = 99999;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " : " + arr2 [i]);
		}
		
		
	}

}
