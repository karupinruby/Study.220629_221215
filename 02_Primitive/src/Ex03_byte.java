
public class Ex03_byte {

	public static void main(String[] args) {
		// byte 정수형 : 정수 숫자 지정 256개 저장(-128 ~ 127)
		byte byte1 = 100;
		byte byte2 = 29;
		
		System.out.println("byte1 : " + byte1);
		System.out.println("byte2 : " + byte2);
		
		byte byte3 = (byte)(byte1 + byte2);
		System.out.println("byte1 + byte2 : " + byte3);

		
		System.out.println("~~~~ byte 최소값, 최대값 ~~~~");
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);
		
		

	}

}
