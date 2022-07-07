
public class Ex01_for {

	public static void main(String[] args) {
		// 제어문 - 반복문(for, while, do ~ while)
		// for (초기값; 실행(종결)조건; 증감설정) { }
		// for (; ;) {} <<<< 무한반복

		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");

		System.out.println("===========");
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		
		System.out.println("===========");
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("*****");
		}
		
		System.out.println("===========");
		System.out.println();
		
		int num = 1;
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		
		System.out.println("===========");
		System.out.println();

		num = 1;
		for (int i = 1; i <= 4; i++) {
			System.out.println(num++);
		}
		
		System.out.println("===========");
		System.out.println();
		
		num = 1;
		for (int i = 1; i <= 4; i++) {
			System.out.println(i);
				
		}
		
		System.out.println("===========");
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {	
			System.out.println(i);
		}	
		
		System.out.println("===========");
		System.out.println();
		
		for (int i = 10; i <= 20; i++) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		System.out.println();
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		System.out.println();
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		System.out.println();
		
		for (int i = 2; i <= 99; i = i++ * 2) {
			System.out.println(i);
		}
		
		

		
		
		
	}

}












