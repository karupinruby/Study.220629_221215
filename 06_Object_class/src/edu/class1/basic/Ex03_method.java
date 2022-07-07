/*
	 ======== 메소드 4가지 형태 ========
	 1. 리턴값 없음, 전달받는 파라미터 없음
	 	- void 메소드명() {}
	 2. 리턴값 없음, 전달받는 파라미터 있음
	 	- void 메소드명(파라미터타입 변수명, 등등등) {}
	 3. 리턴값 있음, 전달받는 파라미터 없음
	 	- 리턴타입 메소드명() {}
	 4. 리턴값 있음, 전달받는 파라미터 없음
	 	- 리턴타입 메소드명(파라미터타입 변수명, 등등등) {}
 */
package edu.class1.basic;

public class Ex03_method {
	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		
		// 참조형(데이터)타입 변수명 = new
		Ex03_method ex03 = 	new Ex03_method();
		
		int sum = ex03.add(num1, num2);
		System.out.println("sum : " + sum);
		
		System.out.println
		("add(num1, num2) : " + ex03.add(num1, num2));
		System.out.println
		("subtract(num1, num2) : " + ex03.subtract(num1, num2));
		System.out.println
		("multiply(num1, num2) : " + ex03.multiply(num1, num2));
		System.out.println
		("divide(num1, num2) : " + ex03.divide(num1, num2));
		
		
		System.out.println();
		System.out.println("==== 메소드 생성 ====");
		ex03.multiply2(num1, num2);
		
		ex03.dispTitle();
	}
	
	
	
	int add(int a, int b) {
		return a + b; // return문 : 호출한 곳으로 되돌아 감
	}
	
	int subtract(int a, int b) {
		return a - b;
	}
	
	int multiply(int a, int b) {
		return a * b;
	}
	
	int divide(int a, int b) {
		return a / b;
	}
	
	void multiply2(int a, int b) {
		System.out.println(a + " * " + b + " : " + (a * b));
	}
	
	void dispTitle() {
		System.out.println("==== 메소드 알아보기 ====");
		System.out.println(">>>> 4가지 형태 확인하기");
	}
	
	
}









