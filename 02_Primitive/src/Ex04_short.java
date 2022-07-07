
public class Ex04_short {

	public static void main(String[] args) {
		// 정수형 short : 2 byte 사용(65536개 사용 가능, 범위 : -23768 ~ 32767)
		
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		short sum = (short)(short1 + short2);
		System.out.println("short sum : " + sum);
		
		int sumInt = short1 + short2;
		System.out.println("int sumInt : " + sumInt);
		
		/*                                                        */
		
		System.out.println("~~~~ short 최소값, 최대값 ~~~~");
		System.out.println("short 최소값 : " + Short.MIN_VALUE);
		System.out.println("short 최대값 : " + Short.MAX_VALUE);
		

	}

}
