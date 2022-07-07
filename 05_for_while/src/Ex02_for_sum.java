
public class Ex02_for_sum {

	public static void main(String[] args) {
		// for문 sum 실습
		// 1~10까지의 합계를 구하시오(for문 사용, 화면 출력)
		
		int sum = 0;
		int num = 1;
		for (int i = 1; i <= 10; i++ ) {
			sum = sum + num;
			System.out.println(i + "  "+ sum + "  " + num);
			num++;
			
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("짝수 출력");
		System.out.println("문제 : 1~10까지의 숫자 중 짝수 출력(2~10)");		
		// 문제 : 1~10까지의 숫자 중 짝수 출력(2~10)
		
		sum = 0;
		
		System.out.println();
		
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
			
		}
		
		System.out.println("");
		System.out.println("짝수여부 판별");
		System.out.println("");
		for (int i = 1; i <= 10; i++ ) {
			if (i % 2 == 0) {     // 2로 나눈 나머지가 0??
				System.out.println(i);
			}
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("홀수 출력");
		System.out.println("");
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
			
		}
		
		System.out.println("");
		System.out.println("홀수여부 판별");
		System.out.println("");
		for (int i = 1; i <= 10; i++ ) {
			if (i % 2 != 0) {     // 2로 나눈 나머지가 0??
				System.out.println(i);
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("나머지 연산자");
		System.out.println("");
		System.out.println(10 % 2 == 0);
		

		
		
		
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			for (sum = 0; sum < i + i; sum = sum + i) {
//			}
//			System.out.println("111  " + i);
//			
//			System.out.println("==1111==");
//			
//			System.out.println("222  " + sum);
//			
//			System.out.println("==2222==");
	    }
		
}


