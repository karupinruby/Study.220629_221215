package edu.class3.phone;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		System.out.println("== 1. 클래스명 ==");
		System.out.println("== 2-1. 속성(필드변수) ==");
		System.out.println("모 델 명 : " + phone.name);
		System.out.println("타   입 : " + phone.type);
		System.out.println("가로크기 : " + phone.hsize);
		System.out.println("세로크기 : " + phone.vsize);
		System.out.println("LCD유무 : " + phone.hasLCD);
		
		System.out.println("== 2-1. 속성(필드변수) ==");
		Phone phone2 = new Phone("노트", "바", false);
		System.out.println(phone2.name);
		
		System.out.println();
		System.out.println("== 3. 생성자 ==");
		
		
		phone.sendSms();
		phone.receiveSms("수신 완");
		
	}

}
