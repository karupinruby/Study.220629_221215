package edu.class2.car;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스를 이용해서 객체(인스턴스) 생성
		Car car = new Car();
		System.out.println("car : " + car);
		System.out.println("이름 : " + car.name);
		System.out.println("모델명 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("길이 : " + car.CAR_LENGTH);
		System.out.println("폭 : " + car.CAR_WIDTH);
		System.out.println();
		System.out.println();

		car.name = "처음 가져본 차";
		System.out.println("이름 : " + car.name);
		//car.CAR_LENGTH = 400;
		//final 처리(상수)된 변수 값은 수정 불가

		System.out.println();
		System.out.println();
		System.out.println("== 기능 테스트 ==");
		car.run();
		car.run(100);
		car.stop();
		car.back();
		
		System.out.println();
		System.out.println();
		System.out.println("== car2 만들고 사용 ==");
		Car car2 = new Car("패밀리카", "그랜저", "검정");
		System.out.println("이름 : " + car2.name);
		System.out.println("모델명 : " + car2.model);
		System.out.println("색상 : " + car2.color);
		System.out.println("길이 : " + car2.CAR_LENGTH);
		System.out.println("폭 : " + car2.CAR_WIDTH);
				
		System.out.println();
		System.out.println();
		System.out.println("== car2 만들고 사용2 ==");
		car2 = new Car("패밀리카", "rm", "검정");
		car2.dispDate();
		
		car.dispDate();
		
		car.run(1000);
		car.stop();
		car.back();
		
		
		
		
		
		
	}

}






