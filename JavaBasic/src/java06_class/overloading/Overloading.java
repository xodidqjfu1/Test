package java06_class.overloading;

public class Overloading {
	
	//--- 멤버 필드 ---
	private int x;
	private int y;
	
	
	//--- 멤버 메소드 ---
	//멤버필드 x, y 를 콘솔에 출력하는 기능
	public void display() {
		System.out.println("(" + x + ", " + y + ")");
//		System.out.println("(" + getX() + ", " + getY() + ")");
	}
	
	//멤버필드 x, y에 값을 저장하고, 콘솔에 출력하는 기능
	public void display(int x, int y) {
		
//		//x, y 에 값 저장
//		this.x = x;
//		this.y = y;
//		
//		//출력
//		System.out.println("(" + x + ", " + y + ")");

		//--------------------------------------------------------
		
		setX(x);
		setY(y);
		
		display();
	}
	
	
	//--- 오버로딩 테스트 메소드 ---
	public void display(int num) {}
	
	//에러, 37라인 충돌, 매개변수 이름이 달라도 자료형이 같아서 오버로딩X
//	public void display(int data) {}
	
	public void display(double num) {}

	public void display(String data) {}
	public void display(String data, int num) {}
	public void display(int num, String data) {}
	
	//에러, 42라인 충돌, 접근제한자가 달라도 오버로딩X
//	private void display(double value) {}
	
	//에러, 12라인 충돌, ㅓ리턴타입이 달라도 오버로딩X
//	public int display() {
//		return 0;
//	}
	
	
	
	//--- Getter, Setter ---
	//	단축키 : alt + shift + s, r, alt + a, alt + r
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
