package java09_api;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		//
		
		
		
		
		
		
		//------------------------------
		//문자열의 토큰화(Tokenize)
		
		String data1 = "HI HELLO HOLA";
		
		String[] tokens = data1.split(" ");
		
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println("-----------------");
		
		String data2 = "i@#am@#man";
		tokens = data2.split("@#");
		
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println("-----------------");

		StringTokenizer st1 = new StringTokenizer(data1);
		
		System.out.println("토큰의 개수 : " + st1.countTokens());
		//-----------------------------------------------
		
		//.nextToken() 메소드
		// 현재 토큰 문자열을 반환한다
		// 다음 토큰을 반환할 준비를 한다
		
		//.hasMoreTokens() 메소드
		// 반환할 토큰이 남아있는 지 boolean값으로 리턴한다

		
		while(st1.hasMoreTokens()) {
			st1.nextToken();
		}
		
		System.out.println("-----------------");

		StringTokenizer st2 = new StringTokenizer(data2, "@#");
		
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		
		//예외 발생
		// -> NoSuchElementException
		// -> nextToken()으로 반환할 데이터가 더 이상 존재하지 않는다
//		System.out.println(st2.nextToken());
		
	}
	

}
