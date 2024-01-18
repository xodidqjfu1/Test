package java01_variables;

public class VariablesQuiz {
	
	public static void main(String[] args) {
		
		String name001;
		name001 = "Oswald";
			
		int age;
		age = 33;
			
		char gender1;
		gender1 = '남';
		
		char gender2;
		gender2 = '여';

		double height;
		height = 190.54;
		
			System.out.println( "이름: " + name001 );
			System.out.println( "나이: " + age );
			System.out.println( "성별: " + gender1 );
			System.out.println( "키: " + height);
			
			System.out.println( "이름: " + name001 + ", 나이: " + age + ", 성별: " + gender1 + ", 키: " + height);

			System.out.println("---------------------------------------------------");
			
			System.out.print("AAA");
			System.out.print("BBB");
			
			//출력에서 줄바꿈을 해주는 코드
			// -> ()괄호을 비우고 println을 사용한다.
			System.out.println();
		
			System.out.println("---------------------------------------------------");
			
			System.out.print( "이름: " + name001 );
			System.out.print( ", 나이: " + age );
			System.out.print( ", 성별: " + gender1 );
			System.out.println( ", 키: " + height);
			

			System.out.println("---------------------------------------------------");
			
			System.out.println("HI\nHELLO\nHOLA");
			
			System.out.println("---------------------------------------------------");

	}

}

// =============================퀴즈=======================================
// 변수에 알맞은 타입을 골라
// 선언하고
// 대입한 후
// 모든 변수의 데이터를 출력해보자.

// 이름, 나이, 성별, 키
// (문자열, 정수 , 단일 문자 or 문자열 , 실수)



//   출력 예시
//   이름 : Alice
//   나이 : 99
//   성별 : 남
//   키 : 222.66