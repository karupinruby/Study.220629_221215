
public class Ex05_int {

	public static void main(String[] args) {
		// 정수형 int : 4byte, 범위(대략 21억 정도)
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);
		
		
		int num1 = 70000;
		int num2 = 30000;
		int sum = num1 + num2;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num1 + num2 = " + sum);
		
		// 사칙연산 부호 : + / - / * / /
		// 나머지 구하기 : %
		
		System.out.println("num1 + num2 = " + sum);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));	
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));	
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));	
		
		// % 연산자 : 나머지 연산 후 남은 나머지 값을 구함
		
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int num3 = 10;
		System.out.println(num1 / num3);
		
		System.out.println("  ㅡㅡ  끝  ㅡㅡ  ");
		

	}

}
















