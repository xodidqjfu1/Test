package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {

	private String name;
	private int money;
	
	private Product prod;

	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	
	public void buy(Product prod) {
		
		if( this.money < prod.getPrice() ) {
			System.out.println("[SYSTEM] 잔액이 부족합니다");
			System.out.println("[잔액] " + this.money + "원");
			return; //메소드 중단
		}
		
		//전달인자로 받은 Product를
		//멤버필드에 저장하고
		this.prod = prod;
		
		//물건가격만큼 money를 차감한다
		this.money -= prod.getPrice();
		
		//진행상황을 출력한다
		System.out.print( this.name + "님이 ");
		System.out.print( prod.getPrice() + "원을 지불하고");
		System.out.println( prod.getModel() + " 구매함");
		
		System.out.println("[잔액] " + this.money + "원");
	}

	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}

}














