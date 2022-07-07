package edu.class3.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		System.out.println("phone1 : " + phone1);
		phone1.call();
		phone1.receiveCall();
		phone1.sendSms("안녕하세요~");
		
		phone1.receiveSms("반갑습니다~~"); //리턴값 받았으나 버려짐
		
		String receiveMsg = phone1.receiveSms("하이~~");
		System.out.println("받은메시지 : " + receiveMsg);
		System.out.println("----");
		
		phone1.view();
		phone1.hsize = 10;
		phone1.vsize = 20;
		System.out.println("---");
		phone1.view();
		
		System.out.println("===== phone2 ======");
		Phone phone2 = new Phone("갤럭시22", "스마트폰");
		System.out.println("phone2: " + phone2);
		phone2.hsize = 12;
		phone2.vsize = 22;
		phone2.hasLCD = true;
		phone2.view();
		
		System.out.println("===== phone3 =======");
		Phone phone3 = new Phone("아이폰", "스마트폰", true);
		System.out.println("phone3 : " + phone3);
		phone3.hsize = 13;
		phone3.vsize = 23;
		phone3.view();
		
	}

}










