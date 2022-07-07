
public class Ex03_break_continue {

	public static void main(String[] args) {
		// 제어문 : break(반복문을 중단하고 빠져나감) / continue(다음 반복 실행)
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("1 ~ 10까지 출력하되 8은 출력하지 말 것");
		for (int i = 1; i <= 10; i++) {
			if (i != 8) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("====continue : 이어 실행=====");
		for (int i = 1; i <=10; i++) {
			if (i == 8) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("1~10 출력 중 8인 경우 처리 중단");
		for (int i = 1; i <=10; i++) {
			if (i < 8) {
				System.out.print(i + " ");}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("====break : 중단=====");
		System.out.println("1~10 출력 중 8인 경우 처리 중단");
		for (int i = 1; i <=10; i++) {
			if (i == 8) {
				break;
			}
		System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("=========");
		int num = 1;
		for ( ; ; ) {
			if (num == 8) break;
			System.out.println(num++);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("=========");
		
		
		
		
	}

}















