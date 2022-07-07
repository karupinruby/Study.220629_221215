
public class a {

	public static void main(String[] args) {
		// ? : <<<<= 조건연산자
		// 조건식 ? 실행문 1 : 실행문2;
		
		int num1 = 30;
		int num2 = 20;
		boolean big = true;
		big = num1 < num2;
		
		System.out.println("num1:" + num1 + ", num2:" + num2);
		System.out.println("num1 > num2 : " + big);

		String str = (num1 > num2) ? "num1이 크다" : "num1이 크지 않다";
		System.out.println("num1 > num2 결과는? " + str);
		
		System.out.println();
		
		char sub1 = 'h';
		
		

	}

}
