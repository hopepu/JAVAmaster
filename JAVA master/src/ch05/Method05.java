package ch05;

public class Method05 {

	public static void main(String[] args) {
		int a = 4; // 반지름
		double pi = 3.14;
		System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율 ");
		
		System.out.println("2 x " + a + " x " + pi + " = ");
		calculate(a, pi);
		
	}

	private static void calculate(int x, double y) {
		System.out.println(2*x*y);
	}


}
