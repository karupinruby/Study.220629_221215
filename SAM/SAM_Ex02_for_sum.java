
public class Ex02_for_sum {

	public static void main(String[] args) {
		// 문제 : 1~10까지의 합계를 구하시오(for, 화면출력)
		// 1~10까지의 합계 결과 : 55
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("1~10까지의 합계 : " + sum);
		System.out.println("----------------");
		
		sum = 0;
		int num = 1;
		for (int i = 1; i <= 10; i++) {
			sum += num; //sum = sum + num;
			System.out.println("i:" + i + " - num: " + num + ", sum: " + sum);
			num++;
		}
		System.out.println("1~10까지의 합계 : " + sum);
		
		System.out.println("---for 반복인자 i값 합산 처리 ----");
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; //sum = sum + i;
			System.out.println("i:" + i + ", sum: " + sum);
		}
		System.out.println("1~10까지의 합계 : " + sum);
		
		System.out.println("======================");
	}

}







