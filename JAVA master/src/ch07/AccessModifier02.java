package ch07;

public class AccessModifier02 {
	
	public static void main(String[] args) {
		
		Dog Obj = new Dog();
		
		Obj.breed = "포메라니언";
		Obj.color = "갈색";
		
		System.out.println("강아지 품종 : " + Obj.breed);
		System.out.println("강아지 색상 : " + Obj.color);
		
		Obj.bowwow();
		Obj.age = 10;
		System.out.println("강아지 나이 : " + Obj.age);
		Obj.run();
		
		
	}

}
