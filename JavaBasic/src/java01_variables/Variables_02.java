package java01_variables;

public class Variables_02 { //C001
	public static void main(String[] args) { //M001
		
		System.out.println("12345");
		
		int data1; //(1)
			data1 = 17; //(2)
			data1 = 999; //(3)	
			
		int data2;
			data2 = 523;
		
		System.out.println( data1 );
		System.out.println( data2 );
		
	} //M001_end

} //C001_end


// ========================= 설명 ===================================
// 자료의 유형 및 대표 int(4b), double(8b), boolean(1b), char(2b)
// --------------------------------------------------------------

// (1) int 타입의 변수 공간 선언 (Declation)
//	
//     int data; -> int형 데이터를 저장할 수 있는 메모리 공간(변수)가 생성된다.
//        ▼
// (2) data = 17; -> data변수 공간에 값을 대입(Assignment)한 상황, data 변수에 17이라는 값을 저장한다.
// (3) data = 999; -> 값 대입, data 변수에 저장된 17을 지우고 새롭게 999를 저장한다. (내림차순)