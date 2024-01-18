package java04_control.loop.quiz;

public class For_Quiz10 {

	public static void main(String[] args) {
		
		//quiz11
//		for(int i=5; i>=1; i--) { //i가 5
//			for(int k=1; k<=i-1; k++) {
//				System.out.print(" ");
//			}
//			for(int j=5; j>i-1; j--) { 
//					System.out.print("*");
//			}
//					
//			//i-1만큼 공백
//			
//			System.out.println();
//		}
		
		//quiz10
		for(int i=1; i<=5; i++) { //i가 1
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) { 
				System.out.print("*");
			}
			
			//i-1만큼 공백
			
			System.out.println();
		}
	
		
	}

}
