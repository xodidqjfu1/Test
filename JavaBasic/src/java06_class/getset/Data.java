package java06_class.getset;

public class Data {

	private int num; //번호
	private String name; //이름
	private String phone; //전화번호
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Generate Getters and Setters 단축키
	//alt + shift + s , r , alt + a, r
	
	

	
//	//Setter 메소드
//	//	-> 외부 객체에서 호출을 통해 멤버 필드의 값을 대입(저장)할 수 있다
//	public void setNum(int num) {
//		this.num = num;
//	}
//	
//	//Getter 메소드
//	//	-> 외부 객체에서 호출을 통해 멤버 필드의 값을 반환(불러오기)할 수 있다
//	public int getNum() {
//		return num;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getPhone() {
//		return phone;
//	}
	
}














