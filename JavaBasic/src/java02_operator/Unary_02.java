package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
	//단항연산자 - 증감
		
	// ++ 증가 연산자
	// -- 감소 연산자
		
	// 피연산자로 적용한 변수에 지정된 값을 1증가(감소) 시킨다.
	//----------------------------------------------------------
		
		int num;
		
		num = 15;
		
		num++;
		
			System.out.println(num);
			
		++num;
		
			System.out.println(num);
			
		num = 15;
		
	//----------------------------------------------------------
			
		num--;
		
			System.out.println(num);
			
		--num;
			
			System.out.println(num);
			
	//----------------------------------------------------------
	// ** 증감 연사자는 다른 연산식과 같이 사용할 떄 계산법이 달라진다
	// -> 변수의 앞에 적용했는지 뒤에 적용했는지에 따라 달라짐
			
			System.out.println("--------------");
		
		num = 15;
			System.out.println(num);
			System.out.println(num--); //감소연산자 적용, 후치 감소(후위 감소)
			System.out.println(num);

			System.out.println("--------------");
			
		num = 15;
			System.out.println(num);
			System.out.println(--num); //감소연산자 적용, 전치 감소(전위 감소)
			System.out.println(num);
	
		// 전위 증감연산은 변수의 값을 불러오기 전에 증/감 한다.
		// 후위 증감연산은 변수의 값을 불러온 후에 증/감 한다.
	//-----------------------------------------------------------
			
		System.out.println("--------------");
			
		num = 13;
			
		System.out.println(num++-10-++num);
//		System.out.println(num++(1) -(3) 10 -(4) ++(2)num);
//		System.out.println(13 + 1 - 10 -  14);
		
		System.out.println("--------------");

		
		  int a = 5, b = 6, c = 10, d;
	      
	      d = ++a * b--;
	      
	      System.out.println("a=" + a + ", b=" + b + ", d=" + d);
//	      System.out.println( a=6, b=5, d=36);
	      
	      d = a++ + ++c - b--;
	      //d = 6 + 11 - 5;
	      
	      System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
//	      System.out.println( a=7(후위증가) , b=4(후위감소), c=11, d=12 );
	      
	      System.out.println("--------------");

		



	
	}
}
