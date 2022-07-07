
public class Ex04_gugudan {

	public static void main(String[] args) {
		System.out.println("==== for 실습 : 구구단 ====");
		// 2단 출력
		
		System.out.println("==== 수동 입력 : 구구단 ====");
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 1 = " + (2 * 1));
		
		System.out.println();
		int num = 1;
		System.out.println("2 * " + num + " = " + (2 * num));
		num++;
		System.out.println("2 * " + num + " = " + (2 * num));
		num++;
		System.out.println("2 * " + num + " = " + (2 * num));
		num++;
		
		System.out.println();
		System.out.println("==== num 변수 입력, 구구단 출력 ====");
		num = 1;
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + num + " = " + (2 * num));
			num++;
		}
		
		System.out.println();
		System.out.println("==== for문 내 변수 입력, 구구단 출력 ====");
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
		
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.println("4 * " + i + " = " + (4 * i));
		}

		System.out.println();
		System.out.println();
		System.out.println("==== for문 밖 변수 입력 및 for문 내 변수 입력, 구구단 출력 ====");
		int dan = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		dan++;
		
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		dan++;
		
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		dan++;
		
		System.out.println();
		System.out.println();
		System.out.println("==== 중첩 반복문, 구구단 출력 ====");
		for (dan = 1; dan <= 9; dan++) {
				System.out.println();
			    System.out.println("==== " + dan + "단 출력====");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				if (dan * i == 16)break;
			}
		}
		
		
		
		
	}

}
