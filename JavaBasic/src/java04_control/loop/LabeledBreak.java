package java04_control.loop;

public class LabeledBreak {

	public static void main(String[] args) {
		
//		A:
		OuterLoop:
		for(int i=0; i<5; i++) {
//			B:
			InnerLoop:
			for(int j=0; j<5; j++) {
				
				if(j>=2) {
//					break InnerLoop;
					break OuterLoop;
				}
				
				System.out.println("i:"+i+",j:"+j);
			}
			System.out.println();
		}
		
		
	}

}
