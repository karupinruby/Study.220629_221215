package edu.class2.car;
/*
  자동차 클래스
  속성 : 차량명, 모델명, 차량색상, 차량 길이, 차량 폭
  기능 : 출발, 멈춤, 후진, 차량 정보 확인
 */


public class Car {
	//필드 변수(속성) 영역 ---------------------
	String name = "마이카";         //차량명
	String model;                 //모델명
	String color;                 //차량색
	
	//final 제한자 : 변수에 값이 할당되면 변경할 수 없음
	//final 붙은 변수 : 상수화된 변수(상수)
	final int CAR_LENGTH = 350;   //차량 길이
	final int CAR_WIDTH = 200;   //차량 폭
	
	boolean hasAirbag; //에어백 존재 여부
	

	//생성자 영역 ---------------------
	//생성자 : 리턴 타입 없음
	//클래스명() {} : 기본생성자(default constructor
	//클래스명(매개변수, 등등) {}
	//주의 : 명시적으로 생성자 선언시 기본 생성자 만들어 주지 않음
	public Car () {
		model = "드림카";
		color = "무지개";
	}
	
	Car(String n, String m, String c) {
		name = n;
		model = m;
		color = c;
	}
	
	
	//메소드(동작, 기능, 함수) 영역 ---------------------
	void run() {
		System.out.println(">> 앞으로 이동");
	}
	
	void run(int speed) {
		System.out.println(">> 앞으로 이동 / " + speed + "km");
	}

	void stop() {
		System.out.println(">> 멈춤");
	}
	
	void back() {
		System.out.println(">> 뒤로가기");
	}
	
	void dispDate() {
		System.out.println("=== 자동차 정보 ===");
		System.out.println("이름 : " + name);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("길이 : " + CAR_LENGTH);
		System.out.println("폭 : " + CAR_WIDTH);
		System.out.println("에어백 여부 : " + hasAirbag);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", CAR_LENGTH=" + CAR_LENGTH
				+ ", CAR_WIDTH=" + CAR_WIDTH + ", hasAirbag=" + hasAirbag + "]";
	}
	
	
	
}











