package java01_variables;

public class Variables_03 { //C001
	public static void main(String[] args) { //M001
	
		int number;  // (1)
		number= 123; // (2)
		
			System.out.println( number );
		
		int number2 = 678; // (3) 
		
			System.out.println ( number2 );
			
		double pi = 3.14;
		boolean isRight = true;	
		char alpha = 'T';
				
		String name = "Alice";
		
	} //M001 _end
} //COO1_end


// ====================== 설명 =============================
// (1) 변수 선언, 변수를 처음 선언하면 "쓰레기값(알 수 없는값)"이 저장돼있다.
//     자바 언어는 "쓰레기값"이 저장된 변수를 사용하면 문법 에러로 처리한다.
//
// (2) 변수 대입, 대입(초기화_initialize)시, 오류 사라짐. 초기화 이후에는 정상 작동
//
// (3) 변수 선언과 동시에 초기화, 쓰레기값이 들어가지 않고 곧바로 값을 초기화한다.