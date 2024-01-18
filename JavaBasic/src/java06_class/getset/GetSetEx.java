package java06_class.getset;

public class GetSetEx {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		//에러, 외부 객체의 접근이 막혀있다
//		data.num = 25342;
//		System.out.println( data.num );
		
		//---------------------------------
	
		//Setter 호출을 통해 멤버필드에 값 저장
		data.setNum(22);
		
		//Getter 호출을 통해 멤버필드의 값 불러오기
		System.out.println( data.getNum() );
		
		//---------------------------------
		
		data.getName();
		data.getPhone();
		
		data.setName("Alice");
		data.setPhone("01099883322");
		
	}
}















