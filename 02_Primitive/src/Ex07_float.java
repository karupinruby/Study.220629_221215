
public class Ex07_float {

	public static void main(String[] args) {
		// 실수형 float : 4 byte
		// 표시형식 : 숫자.숫자 + F or f
		// 
		
		System.out.println("float 최소값 : " + Float.MIN_VALUE);
		System.out.println("float 최대값 : " + Float.MAX_VALUE);
		System.out.println("-------------------");
		
		float f1 = 3.4F;
		float f2 = 3.2F;
		System.out.println("float 3.4F : " + f1);
		System.out.println("float 3.2F : " + f2);
		System.out.println("3.4F + 3.2F : " + (f1 + f2));
		System.out.println("3.4F + 3.2F : " + (3.4F + 3.2F));
		// float + float 연산시 소숫점 이하에서 오차 발생 가능
		// 소수점 이하 6자리까지만 정확도 보장
		

	}

}
