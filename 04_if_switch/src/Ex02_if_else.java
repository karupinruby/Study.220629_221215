
public class Ex02_if_else {

	public static void main(String[] args) {
		// if문 3종류
		// if (조건) { }     <<<< 참
		// if (조건) { } else { }    <<<< 참 아니면 이거
		// if (조건) { } else if ( ) { } else if ( ) { } ... else { } <<<< 복수 선택지
		
		// if문, else문 내에 if문을 작성할 수 있다
		// else문 단독은 사용 불가
		
		int num1 = 10;
		int num2 = 50;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		// 1. if (조건) { }
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		}
		if (num1 <= num2) {
			System.out.println("num1이 num2보다 작거나 같다");
		}
		
		
		System.out.println();	
		// 2. if (조건) { } else { }
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else {
			System.out.println("num1이 num2보다 작거나 같다");
		}

		
		System.out.println();	
		// 3. if (조건) { } else if ( ) { } else if ( ) { } ... else { }
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else if (num1 == num2) {
			System.out.println("num1이 num2와 같다");
		} else {
			System.out.println("num1이 num2보다 작다");
		}
				
		System.out.println("===========");

	}

}
