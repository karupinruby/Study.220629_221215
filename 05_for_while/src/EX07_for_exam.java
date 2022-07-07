
public class EX07_for_exam {

	public static void main(String[] args) {
		// 문제 : 1 ~ 10까지 숫자중 짝수 출력
		// 2로 나눠서 나머지가 0인 숫자
		System.out.println("== 문제 : 짝수 출력 ==");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		// 문제 : 1 ~ 10까지 숫자중 3의 배수 출력
		System.out.println();
		System.out.println("== 문제 : 3의 배수 ==");
		for (int i = 1; i <=10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		
		// 문제 : 900 ~ 1000중 17의 배수인 숫자 출력
		System.out.println();
		System.out.println("== 문제 : 900~1000 중 17의 배수 출력 ==");
		for (int i = 900; i <= 1000; i++) {
			if (i % 17 == 0) {
				System.out.println(i);
			}
		}
		
		
		// 문제 : 2000 ~ 3000중 19의 배수인 숫자 출력
		System.out.println();
		System.out.println("== 문제 : 2000 ~ 3000중 19의 배수인 숫자 출력 ==");
		for (int i = 2000; i <= 3000; i++) {
			if (i % 19 == 0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println();
		System.out.println("== 변수 선언 후 작업 ==");
		int startNum = 2000;
		int endNum = 3000;
		int divNum = 19;
		
		for (int i = startNum; i <= endNum; i++) {
			if (i % divNum == 0) {
				System.out.println(divNum +"의 배수는 " + i);
			}
		}
		
		
		System.out.println();
		System.out.println("== 문제 : 0 ~ 300000000중 19의 배수인 숫자 갯수 ==");
		int count = 0;
		for (int i = 0; i <= 300000000; i++) {
			if (i % 19 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		

	}

}
