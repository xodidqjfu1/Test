package java06_class.method;

//일반 클래스
public class Method_01 {

	public void hello() {
		System.out.println("Hello");
	}

	//-------------------------------------------------------
	
//	[접근제한자] [메소드제한자] [리턴타입] 메소드명( [매개변수] ) {
//	  // 실행 코드
//	}

	//-------------------------------------------------------
	
	//0. 메소드의 기본 형태 작성하기
	public void method() {
	}

	//1. 메소드 이름 정하기	- 만들려는 기능을 대표하는 단어로 이름을 정한다
	//2. 매개변수 작성하기	- 기능 수행에 필요한 데이터(값)을 저장할 수 있도록 변수 선언하기
	//3. 실행코드 작성하기	- 메소드의 기능을 구현한다
	//4. return코드 작성	- 기능을 수행하 결과값을 반환해야할 때 작성한다
	//5. return타입 작성	- return코드에 맞는 자료형을 작성한다
	
	//-----------------------------------------------------------------------
	
	//뺄셈 기능
	//	-> 2개의 정수값을 뺄셈하고 반환하는 기능을 구현한다
	
	//0. 메소드의 기본 형태 작성하기
	public int subtract( int num1, int num2 ) {
		
		int result = num1 - num2;
		
		return result;
		
	}

	//1. 메소드 이름 정하기	- subtract
	//2. 매개변수 작성하기	- int nurm1, int num2
	//3. 실행코드 작성하기	- num1 - num2
	//4. return코드 작성	- return 결과값;
	//5. return타입 작성	- int
	
}














