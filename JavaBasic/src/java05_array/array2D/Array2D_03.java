package java05_array.array2D;

public class Array2D_03 {

	public static void main(String[] args) {
		
		
		//int형 2차원 배열 변수 선언
		int[][] arr = new int[3][];
		
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//---------------------------------------------------------------
		
		arr[0] = new int[5]; //0행 배열 생성
		arr[1] = new int[3]; //1행 배열 생성
		arr[2] = new int[7]; //2행 배열 생성
		
		//---------------------------------------------------------------
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println("-----------");
		
		//arr배열의 행과 열을 이용하여 모두 출력!
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				
			}
			
		}
		
	}

}
