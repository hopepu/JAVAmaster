package ch07;

public class AccessModifier03 extends Dog{
	
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
		
//		Obj.name = "다운";
//		System.out.println("강아지 이름 : " + Obj.name);
//		Obj.sleep();
//		private 영역이여서 필드는 보통 명령어로는 접근 불가 getter setter 사용 필요 혹은 자식관계
		
	}

}
