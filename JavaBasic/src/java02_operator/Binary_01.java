package java02_operator;

public class Binary_01 { //C001

	public static void main(String[] args) { //M001
		
		int num1 = 15, num2 = 6; //피연산자 역활
		
		int result; //연산의 결과값을 저장할 변수
		
		result = num1 + num2; 
		
			System.out.println("덧셈 결과: " + result);
			
			System.out.println("===========================");
			
		int num3 = 15; int num4 = 6;
		
		int result2;
		
		result2 = num3 % num4;
			
			System.out.println(num3 + " 값을 " + num4 + " (으)로 나눈 나머지 : " + result2);
		
			System.out.println("----------------------");

//			System.out.println("num1 + num2 = " + num1 + num2); (2)
//			System.out.println("num1 + num2 = " + 16 + 17); (2)
//			System.out.println("num1 + num2 =  16" + 17); (2)
//			System.out.println("num1 + num2 =  1617"); (2)
			
			System.out.println("num1 + num2 = " + (num1 + num2) ) ; //21
			System.out.println("num1 - num2 = " + (num1 - num2) ) ; //9
			System.out.println("num1 * num2 = " + (num1 * num2) ) ; //90
			System.out.println("num1 / num2 = " + (num1 / num2) ) ; //2, 몫(2.5)
			System.out.println("num1 % num2 = " + (num1 % num2) ) ; //3, 나머지
			

			System.out.println("----------------------");
			
			System.out.println("15 / 6 = " + (15 / 6) ) ; // int / int = int
			System.out.println("15.0 / 6.0 = " + (15.0 / 6.0) ) ; // double / double = double

			System.out.println( (double)num1 / (double)num2 );
//			▼ System.out.println( (double)16 / (double)nu15 ); //변수값 불러오기
//			▼ System.out.println( 16.0 / 15.0 ); // 양쪽항이 double로 형변환
//			▼ System.out.println( 2.5 ); // double 데이터로 간주해서 산술
			
			System.out.println("----------------------");
			
			System.out.println( num1 / (double)num2 );
			System.out.println( 15 / (double)6 );
			System.out.println( 15 / 6.0 );
			// int / double // 기억하고 있는 형변환은 한 쪽만 바꿔도 자동 변환 (오른쪽에 넣는걸 추천한다.)
			
			System.out.println("==========23.12.18==========");

			
		int num5 = 17, num6=3;
			
			System.out.println( (double)(num5 / num6) ); // (3)에러
//			▼System.out.println( (double)(17 / 3 ); 변수값 불러오기          
//			▼System.out.println( (double)5 ); int/ int 수행
//			▼System.out.println( 5.0 ); double 형변환
//									▼			
			System.out.println( num5/(double)num6 ); //옳바른 형태
			
			System.out.println("----------------------------");
			
		double dnum = 3.14;
		
			System.out.println("3.14 / 2 =" + (dnum/2));
			System.out.println("3.14 % 2 =" + (dnum%2)); // (4)

			
			
			
			} //M001_end
} //C001_end


//=====================설명==========================
// (1) 이항 연산자 - 산술 ( + , - , * , /, %)
//    ㄴ '%' -나머지 연산자 (modular operator) 모드 연산자
//    ㄴ 나눗셈을 수행하고 그 나머지를 결과값으로 나타낸다.
//
// (2) 덧셈은 이항연산자인 '+'가 2개 이상이어서 수행이 불가
//
// **산술 연산은 반드시 피연산자들의 데이터 타입이 같아야한다.
//   ㄴ Apple (String) + 123 (int)
// **산술 연산의 결과값도 피연산자와 같은 데이터 타입을 가진다.
//   ㄴ 소수점 값을 원할 경우 (double)을 접두사로 붙여주면 임시로 더블 속성을 가지게 된다.
//
// (3) 에러, 둥근 괄호도 우선수행 연산자 역활을 수행해서 나누기 연산이 실행되고나서
//     double이 적용. (double 적용 전에 int 끼리 연산처리)
//
// (4) 실수 계산에서는 부동소수점 오차가 발생할 수 있다. ex))1.1400000000000000001
//     결과값이 .00000001 등 불필요한 소수점 같은 경우
//     회사나 프로젝트에 따라 소수점을 일정 수치까지만 활용하거나 문자열(sting)으로 변환해서 저장해둔다.