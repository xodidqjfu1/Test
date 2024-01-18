package java04_control.selection;

public class Switch_03 {

	public static void main(String[] args) {
		
//		double d = 3.14;
//		
//		switch(d) {
//		
//		}
		
		//-------------------------------------------------
		
		//에러
//		boolean b = true;
//		switch(b) {
//		}
		//-------------------------------------------------
		
		//char형은 정수값(ASCII)으로 처리된다
		//	-> switch 비교대상으로 사용 가능
		
//		char alpha = 'B';
//		
//		switch(alpha) {
//		case 'A':
//			System.out.println("사과");
//			break;
//			
//		case 'B':
//			System.out.println("바나나");
//			break;
			//-------------------------------------------
		
		//String 타입을 switch구문에서 사용할 수 있다.
		//	-<JDK 1.7 이상
		
//		String str = "Banana";
//		
//		switch(str) {
//		case "Apple":
//			System.out.println("사과입니다.");
//			break;
//			
//		case "Banana":
//			System.out.println("바나나입니다.");
//			break;
//		}
		
		//------------------------------------------------
		
		String str1 = "Cherry"; //상수 활용
		String str2 = new String("Cherry"); //객체 활용
		
		// ==로 String 비교하면 안됨
		System.out.println(str1 == str2); //false
		
		//	.equls()를 이용하여 비교해야 한다
		System.out.println(str1.equals(str2)); //true
		
		System.out.println("------------------");
		
		if(str2.equals(str1)) {
			System.out.println("두 문자열이 똑같다!");
		}
	}

}
