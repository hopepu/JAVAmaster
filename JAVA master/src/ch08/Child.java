package ch08;

public class Child extends Parent {
	String name = "홍길동";
	
	public void details() {
		super.details();
		System.out.println(this.name);
		
	}
	
	public void printDetails() {
		this.details();
		System.out.println("부모 이름 : " + super.name);
		System.out.println("자식 이름 : " + name);
	}

}
