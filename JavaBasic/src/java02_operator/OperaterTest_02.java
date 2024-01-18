package java02_operator;

public class OperaterTest_02 {

	public static void main(String[] args) {
		
		 int a = 5, b = 6, c = 10;

	      boolean res1;
	      res1 =  a < b || --a > c++;
//	      res1 =  5 < 6 or 4 > 10;
//        왼쪽항이 true로 판단되면 오른쪽항은 비교 수행 조차를 안한다 (숏컷_논리연산의 단축수행)
//        당연히 오른쪽의 연산작업도 수행을 안한다.
	      System.out.println("a=" + a + ", b=" + b + ", c=" + c);
//	      System.out.println(a= 5, b= 6, c=10);

	      
	      boolean res2;
	      res2 = c<b++ && c-->++a;
//	      res2 = 10<6 and 10>6;
	      // 왼쪽이 거짓으로 판명되서 오른쪽은 비교,연산이 시도조차 안됨
	      System.out.println("a=" + a + ", b=" + b + ", c=" + c);
//	      System.out.println("a=6, b=7, c=10);
	      
	      //논리연산의 단축수행
	      //	AND 연산은 왼쪽의 피연산자가 false라면 오른쪽항 연산을 수행하지 않는다.
	      //	OR 연산은 왼쪽 피연산자가 true라면 오른쪽항 연산을 수행하지 않는다.
		
	}
}
