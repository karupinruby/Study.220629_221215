package edu.class3.phone;

public class Phone {
	String name;
	String type;
	int hsize = 5;
	int vsize = 10;
	boolean hasLCD;
	
	String sendSms = "내용";

	
	
	public Phone() {
		name = "Note20";
		type = "Bar";
	}
	
	Phone(String name, String t, boolean l) {
		this.name = name; // 필드에 있는 변수 선언시 this. // this 현재객체(인스턴스)
		type = t;
		hasLCD = l;
	}
	
	
	
	
	void sendSms () {
		System.out.println("메시지전송 : " + sendSms);
	}
	
	void receiveSms(String receiveSms) {
		System.out.println("메시지수신 : " + receiveSms);
	}

	
	
	
}








