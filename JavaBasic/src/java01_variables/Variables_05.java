package java01_variables;

public class Variables_05 { //C001
	
	public static void main(String[] args) { //M001
		
		int student_age; // (1) snake case, 뱀 표기법 
		int studentAge;  // camel case, 낙타 등 표기법
		

//		int 1stNumber; // (2)
		int firstNumber;
		
//		int int; (3)
//		int static;
		
//		double 평수 = 523.0618; // (4)
				
//			System.out.println( 평수 );
//			System.out.println( 평수 );
		
	} //M001_end

} //C001_end


//====================== 설명 =============================
// (1) 변수 선언시 띄어쓰기 금지(에러), 대문자를 활용하되 변수값은 항상 소문자로 시작
//   ㄴ 자바에서는 낙타 등 표기법(camel case)을 권장함.
//
// (2) 에러, 변수 선언은 숫자로 시작하면 안된다.
//
// (3) 에러, 변수 선언시 키워드 사용 불가
//
// (4) 한글로 식별자를 설정하면 안된다. (한글 자체가 유니코드에서 인코딩을 해야함)