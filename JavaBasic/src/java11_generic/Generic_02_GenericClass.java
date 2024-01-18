package java11_generic;

class Class02 {
	private int data;
	
	public int display(int data) {
		this.data = data;
		return data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}

//제네릭 클래스
class Class02_<TYPE> {
	private TYPE data;
	
	public TYPE display(TYPE data) {
		this.data = data;
		return data;
	}

	public TYPE getData() {
		return data;
	}

	public void setData(TYPE data) {
		this.data = data;
	}
	
	
}


public class Generic_02_GenericClass {

	public static void main(String[] args) {
		
		
	}

}
