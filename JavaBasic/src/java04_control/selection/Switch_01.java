package java04_control.selection;

public class Switch_01 {

	public static void main(String[] args) {
		
		//switch문, 선택문, 조건문
		//	switch-case문
		//----------------------------------------
		
//		switch(비교 대상) {
//		
//		case 비교값1:
//			
//		case 비교값2:
//			
//		case 비교값3:
//			
//		default:
//			
//		}
		
		//비교대상과 같은 값으로 지정한 case 구문의 위치부터
		//아래쪽 코드를 전부 실행한다
		
		//case의 값들 중 같은 값이 없으면 default부터 실행
		
		//default: 부분은 생략 가능하다
		//-----------------------------------------------
		
		int num= 20;
		switch(num) {
		
		case 10:
			System.out.println("10입니다");
			break;
		case 20:
			System.out.println("20입니다");
			break;
		case 30:
			System.out.println("30입니다");
			break;
		default:
			System.out.println("10, 20, 30 모두 아닙니다");
			
		}
		
		
	}

}
