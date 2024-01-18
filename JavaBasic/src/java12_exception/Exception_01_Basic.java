package java12_exception;

public class Exception_01_Basic {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i = 0;
		
		while(true) {
			
			//ArrayIndexOutOfBoundsException
			//	인덱스가 음수거나 배열의 길이보다 크거나 같을 때 발생한다
			
			//예외 처리 적용
			// -> 전통적인 방식의 예외 처리
			if(i<0 || i>= arr.length) {
				System.out.println("[SYSTEM] 인덱스 범위를 벗어났습니다.");
				
				break;
			}
			arr[i] = i+1;
			i++;
		}
		
	}

}
