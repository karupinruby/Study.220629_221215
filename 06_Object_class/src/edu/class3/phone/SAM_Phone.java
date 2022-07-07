package edu.class3.phone;

public class Phone {
	String name; //모델명
	String type; //타입
	int hsize; //가로크기
	int vsize; //세로크기
	boolean hasLCD; //LCD유무
	
	// 생성자 ---------------------------
	Phone() {}
	
	Phone(String name, String type) {
		this.name = name; // this 현재객체(인스턴스)
		this.type = type;
	}
	
	Phone(String name, String type, boolean hasLCD) {
		this.name = name; // this 현재객체(인스턴스)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	
	//메소드(기능,동작) =============================
	void call() {
		System.out.println(">>전화걸기");
	}
	
	void receiveCall() {
		System.out.println(">>전화받기");
	}

	void sendSms(String message) {
		System.out.println("[메시지전송]" + message);
	}
	
	String receiveSms(String message) {
		System.out.println("[메시지수신]" + message);
		return message;
	}
	
	void view() {
		System.out.println("모델명: " + name);
		System.out.println("타입: " + type);
		System.out.println("가로크기: " + hsize);
		System.out.println("세로크기: " + vsize);
		System.out.println("LCD유무: " + hasLCD);
	}
	
	
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", type=" + type + ", hsize=" + hsize + ", vsize=" + vsize + ", hasLCD=" + hasLCD
				+ "]";
	}
	
	
	
	
	
	
}










