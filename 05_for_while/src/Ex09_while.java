
public class Ex09_while {

	public static void main(String[] args) {
		
//		** while문 형태
//		1. 반복인자의 선언 및 초기값 설정;
//		2. while (실행(종결) 조건식) {
//		3.	- 반복인자값 증감설정(선택적/ 실행문 앞 뒤 중 선택 가능);
//			- 실행문(복수 가능);
//			- 반복인자값 증감설정(선택적 / 실행문 앞 뒤 중 선택 가능);
//		}
		
//		문제1. (가로)1~10 출력(for문으로 출력)
		System.out.println("== (가로)1~10 출력(for문으로 출력) ==");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("== (가로)1~10 출력1. (while문으로 출력) ==");
		int i = 1;
		while (i <= 10) {
			System.out.print(i);
			i++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("== (가로)1~10 출력2. (while문으로 출력) ==");
		i = 0;
		while (i < 10) {
			i++;
			System.out.print(i);
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("== while문 + break ==");
		System.out.println("== 증감식 위치에 따른 출력 결과 ==");
		int num = 1;
		while (true) {
			System.out.print(num + " ");
			num++;
			if (num == 10) break;
		}

		System.out.println();
		num = 1;
		while (true) {
			System.out.print(num + " ");
			if (num == 10) break;
			num++;
		}
		
		System.out.println();
		num = 1;
		while (true) {
			num++;
			System.out.print(num + " ");
			if (num == 10) break;
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("== while문 + continue ==");
		num = 1;
		while (num < 10) {
			num++;
			if (num == 5) continue;
			System.out.print(num);
		}
		
		
//		** do ~ while문 특징 및 형태
//		- 무조건 한 번은 실행
//		1. 반복인자의 선언 및 초기값 설정;
//		2. do {
//		3.	- 반복인자값 증감설정(선택적/ 실행문 앞 뒤 중 선택 가능);
//			실행문(복수, 가능);
//			- 반복인자값 증감설정(선택적 / 실행문 앞 뒤 중 선택 가능);
//		4. } while (실행(종결) 조건식);
//		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("== do ~ while문 ==");
		System.out.println("== (가로)1~10 출력1. (do ~ while문으로 출력) ==");
		int doNum = 1;
		do {
			System.out.print(doNum + " ");
			doNum++;
		} while (doNum <= 10);
		
		System.out.println();
		doNum = 1;
		do {
			doNum++;
			System.out.print(doNum + " ");
		} while (doNum <= 10);
		
		
//		while문은 조건에 안 맞을시 실행 불가
//		do while은 무조건 실행
		System.out.println();
		System.out.println();
		System.out.println();
		doNum = 10;
		do {
			System.out.print("do~while : " + doNum);
		} while (doNum < 1);
		
		
		System.out.println();
		System.out.println();
		System.out.println(" * 출력 (while문으로 출력)");
		int ha = 1;
		while (ha < 10) {
			ha++;
			System.out.println("*");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
