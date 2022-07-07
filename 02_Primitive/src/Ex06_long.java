
public class Ex06_long {

	public static void main(String[] args) {
		// 정수형 long : 8 byte 사용
		
		System.out.println("long 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 최대값 : " + Long.MAX_VALUE);
		
		long num1 = 2000000000000L; // 숫자 뒤 L(long 타입 접미어 사용)
		long num2 = 3000000000000L;
		long sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("==========");
		
		
		byte numByte = 100;
		short numShort = 3000;
		int sumInt = 30000;
		long sumLong = 3000000;
		
		// numByte = numShort;  >>>>  numByte = (byte) numShort;
		// 손실발생 -값 발생
		// 큰 타입에 작은 타입 적용시 발생 손실 없음, ex) long <- int = 정상값 표출
		// 작은 타입에서 큰 타입이 적용시 강제 형변환 필요, ex) numByte = (byte) numShort;
		
		numByte = (byte) numShort;
		System.out.println("numByte : " + numByte);
		
		

	}

}
