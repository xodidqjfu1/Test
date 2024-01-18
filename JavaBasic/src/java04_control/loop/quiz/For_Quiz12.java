package java04_control.loop.quiz;

public class For_Quiz12 {

	public static void main(String[] args) {
		//quiz12
		
		for(int i=0; i<9; i++) {
			
			if(i<9/2) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
			
			} else {
				for(int j=0; j<9-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
