
public class Ex08_double {

	public static void main(String[] args) {
		// 실수형 double : 8 byte
		// 표시형식 : 숫자.숫자(명시적 단어 생략해도 double 방식) / 숫자.숫자 + D or d
		
		System.out.println("double 최소값 : "+ Double.MIN_VALUE);
		System.out.println("double 최대값 : "+ Double.MAX_VALUE);
		
		double d1 = 1.1;
		double d2 = 1.12345678901234567890d;
		System.out.println("double 1.1 : " + d1);
		System.out.println("double 1.12345678901234567890d : " + d2);
		
		double sum = d1 + d2;
		System.out.println("d1 + d2 : " + sum);

		System.out.println("3.4d + 3.2d : " + (3.4d + 3.2d));
		
		float f1 = 3.4F;
		d1 = f1; // 큰 타입에 작은 타입 적용시 발생 손실 없음, ex) double <- float = 정상값 표출
		
		

	}

}
