package java01_variables;

public class Variables_06 { // C001

	public static void main(String[] args) { // M001
		
		int num; //변수
		num = 123;
		num = 456;
		num = 678; 
		
		final int MAX; //이름있는 상수 (변수의 상수화)
		
		MAX = 100;
//		max = 200; (1)
		
		
		final int WORKING_DAY = 25;
		
			System.out.println("이번 달은 " + WORKING_DAY + "일 근무 하셨습니다." );

			System.out.println("이번 달 급여 : " + WORKING_DAY * 150000);
		
		
		

	} // M001_end
} // C001_end


//====================== 설명 =============================
//(1) 상수화된 변수는 값 대입을 한 번만 할 수있다.
// ㄴ ** 이름있는 상수의 식별값은 모든 글자를 대문자로 작성한다. (더 이상 변수가 아니기에)
// ㄴ ※ 대입된 값을 좌클 refactor 클릭하면 동일한 대입값을 한꺼번에 동시에 수정이 가능! (alt+shift+r)