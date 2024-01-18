package java04_control.loop.quiz;

public class For_Quiz13 {

	public static void main(String[] args) {
		//quiz13
		
		for(int i=0; i<9; i++) {
			
			if(i<9/2) {
				for(int j=0; j<(9/2)-i+1; j++) {
					System.out.print("*");
				}
			
			} else {
				for(int j=0; j<(i+1)-(9/2); j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
