package edu.class1.basic;

public class Ex02_class {
    //==== 변수 선언 영역 ====
	//필드 변수(인스턴스 변수, 멤버 변수, 전역 변수, 속성(property) 선언)
	int num = 11;
	
	//클래스 변수, 스태틱 변수, 인스턴스(객체) 공통 변수
	static int staticNum = 22;
	
	//==== 생성자 선언 영역 ====
	Ex02_class() {} // 기본 생성자(default constructor) 생략 가능
	
	
	
	//==== 메소드(method : 기능, 동작) 선언 영역 ====
	//main 메소드
	public static void main(String[] args) {
		int num1 = 300;
		int num2 = 100;
		System.out.println("num1 : " + num1 + " / num2 : " + num2);
		
		int result = num1 + num2;
		System.out.println("result = num1 + num2 : " + result);
		
		// 메소드 호출(부), 실행(전달하는 데이터(값) : 인수(argument))
		result = add(num1, num2); 
		System.out.println("add(num1, num2) : " + result);	
	
			
		System.out.println("subtract(num1, num2) : " + subtract(num1, num2));	
			
	}
	
	
	
	// add 라는 메소드 선언(전달 받은 데이터(값) : 파라미터(parameter))
	public static int add(int a, int b) {
		return a * b;
	}
	
	
	
	public static int subtract(int a, int b) {
		return a - b;
	}

}
