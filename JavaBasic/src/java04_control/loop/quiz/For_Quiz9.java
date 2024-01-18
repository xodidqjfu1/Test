package java04_control.loop.quiz;

public class For_Quiz9 {

	public static void main(String[] args) {
		
		//quiz9
		for(int i=0; i<5; i++) {

			for(int j=0; j<5-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	
		
	}

}
