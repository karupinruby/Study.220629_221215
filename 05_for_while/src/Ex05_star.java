
public class Ex05_star {

	public static void main(String[] args) {
		// *****
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		
		
		System.out.println();
		System.out.println("== 반복문 사용 * 찍기 / 한 줄에 별 5개==");
		System.out.println();
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
	
		
		System.out.println();
		System.out.println();
		System.out.println("== 반복문 사용 * 찍기1 / 별 5개 3줄==");
		System.out.println();
		
		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("== 반복문 사용 * 찍기2 / 별 5개 3줄==");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("*****");
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("== Practice ==");
		System.out.println();
		
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("== *로 삼각형 그리기1 ==");
		System.out.println();
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i <= 5; i++) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				//System.out.println();
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("======");
		System.out.println();

		for (int i = 0; i <= 5; i++) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("======");
		System.out.println(); // 
		System.out.println("*"); 
		//System.out.print("*");
		//System.out.println();
		
		System.out.println("**");
		//System.out.print("**");
		//System.out.println();
		
		//for (int i = 1; i <= 2; i++) {
		//     system.out.print("*");
	    //}
		//system.out.println();
		
		//System.out.print("*");
		//System.out.print("*");
		//System.out.println();
		
		System.out.println("***");
		//System.out.print("***");
		//System.out.println();
		
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.println();
		
		System.out.println("****");
		//System.out.print("****");
		//System.out.println();

		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.println();
		
		System.out.println("*****");
		//System.out.print("*****");
		//System.out.println();
		
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.println();
		
		
		System.out.println();
		System.out.println();
		System.out.println("======");
		System.out.println();
		
		int iCnt = 1;
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j < iCnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			iCnt++;
		}
		
		
	}
}











