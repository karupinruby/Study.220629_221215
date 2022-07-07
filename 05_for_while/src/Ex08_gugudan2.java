
public class Ex08_gugudan2 {

	public static void main(String[] args) {
		/*
		 구구단 2~9단 출력
		 2*1=2 3*1=3 ----------- 8*1=8 9*1=9
		  2단	3단                8단   9단
		*/
		System.out.println();
		System.out.println("== 풀이1 : main단 ==");
		int main = 2;
		int sub = 1;
		for (main = 2; main < 10; main++) {
			System.out.print(main + " * " + sub + " = ");
			System.out.print((main * sub) + "\t");
		}
		

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("== 풀이2 : sub단 ==");
		main = 2;
		for (sub = 1; sub < 10; sub++) {
			System.out.println
				(main + " * " + sub + " = " + (main * sub) + "\t");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("== 풀이3 : main + sub단 ==");
		for (sub = 1; sub < 10; sub++) {
			for (main = 2; main < 10; main++) {
			System.out.print
			(main + " * " + sub + " = " + (main * sub) + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("== 19단 : main + sub단 ==");
		for (sub = 1; sub < 20; sub++) {
			int count = 0;
			for (main = 2; main < 20; main++) {
				if (main == 12 || main ==4) {
					continue;
				}
				System.out.print
				(main + " * " + sub + " = " + (main * sub) + "\t");
			}
			count++;
			System.out.println();
			System.out.println(count);
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("== 중첩 반복문을 모두 종료하는 경우 ==");
		System.out.println("== 명칭 지정 후 break문 사용 ==");
		for (int out = 1; out <= 10; out++) {
			for (int in = 1; in < 10; in++) {
				System.out.println
				("out : " + out + " / in : " + in);
				if (in == 1); break;
			}
		}

		System.out.println();
		System.out.println();
		outFor:  // 외부 for문 중단(outFor 명칭 지정 된) 중단
		for (int out = 1; out <= 10; out++) {
			for (int in = 1; in < 10; in++) {
				System.out.println
				("out : " + out + " / in : " + in);
//				if (in == 11); break outFor;
			}
		}

		
		
		
		
	}

}










