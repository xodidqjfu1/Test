package java01_variables;

public class Variables_04 { //C001

	public static void main(String[] args) { //M001
		
		int data1;
		int data2 = 777;
		int data3;
		
		int data4, data5 = 999, data6 = 888;
		
// 에러각주, int data7, data8, double data9; (1)
		
		double height; //높이	

		height = 190.8;
				
			System.out.println("height변수의 값은" + height); //(2)
		//  ▼System.out.println("height변수의 값은" + 190.8);
		//  ▼System.out.println("height변수의 값은 190.8"); 			
			
	} //M001_end
} //C001_end


//====================== 설명 =============================
// (1) 에러 상태, 서로 다른 자료형의 변수를 ,(콤마)로 한 번에 선언 할 수 없다.
//
// (2) 큰따옴표 사이는 문자열(string)로 처리, string 뒤에 '+' 삽입시 덧셈이 아닌 문장을 이어줌.
//  ㄴ 3개의 요소가(스트링,변수,+) 단계적으로 합쳐져서 1개로 출력 