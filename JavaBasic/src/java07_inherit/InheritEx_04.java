package java07_inherit;

class Parent4 {
	protected int num;
	
	public Parent4() {
		
		//this 생성자 호출 코드, 같은 클래스의 다른 생성자를 호출한다
		this(0);
//		this(5555);
		
		System.out.println("부모 디폴트 생성자");
		
		//매개변수 있는 생성자를 호출하여 초기화 코드를 대신할 수 있다
		//	-> this(0);
//		this.num = 0;
	}

	public Parent4(int num) {
//		this();
		
		System.out.println("부모 매개변수있는 생성자");
		
		this.num = num;
	}	
}

class Child4 extends Parent4 {
	
	public Child4() {
		
		//부모 생성자 호출 코드, super 생성자 호출
		//	-> 자식클래스의 생성자에서 부모 생성자를 호출할 때 사용한다
		//	-> 코드를 생략해도 자식클래스는 항상 부모 생성자를
		//	 호출(super();)하도록 되어있다
		super();
		
		System.out.println("자식 디폴트 생성자");
	}
	
	public Child4(int num) {
		
		//** 자식 클래스는 기본적으로 항상 부모 디폴트 생성자를 호출한다

		//부모 디폴트 생성자를 호출한다 - 기본
//		super();
		
		//부모 매개변수 있는 생성자를 호출한다 - 선택
		super(num);
		
		System.out.println("자식 매개변수있는 생성자");
		
		//상속받은 num 필드 초기화
//		super.num = num;
		
		//에러 안 남, Child4에 num필드가 없어서 super영역에서 찾는다
		this.num = num;
		
	}
	
}


public class InheritEx_04 {
	public static void main(String[] args) {
		
		//디폴트 생성자 호출
		Parent4 p1 = new Parent4();
		System.out.println("---------------");
		
		//매개변수 있는 생성자 호출
		Parent4 p2 = new Parent4(222);
		System.out.println("---------------");

		//자식 디폴트 생성자 호출
		Child4 c1 = new Child4();
		System.out.println("---------------");
		
		Child4 c2 = new Child4(333);
		
	}
}














