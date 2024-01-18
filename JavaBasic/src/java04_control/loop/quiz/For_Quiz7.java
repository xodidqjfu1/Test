package java04_control.loop.quiz;

public class For_Quiz7 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			
//			for(int j=i; j<=i+4; j++) {
//				
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
		
		//quiz7
		for(int i=5; i>=1; i--) {
			//5일 때 
			for(int j=i; j<=i+4; j++) {
				
				System.out.print(j);//5부터 i+4까지 1씩 증가
			}
			
			System.out.println();
		}
		
	}

}
