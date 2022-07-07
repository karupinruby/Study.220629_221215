
public class Ex06_star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제1)
//		*****
//		****
//		***
//		**
// 		*
//
		System.out.println("==== 문제1-1 풀이 ====");
		for (int i = 5; i >= 1; i--) {
			System.out.print("*");
		}
		
		System.out.println();
		for (int i = 4; i >= 1; i--) {
			System.out.print("*");
		}
		
		System.out.println();
		for (int i = 3; i >= 1; i--) {
			System.out.print("*");
		}
		
		System.out.println();
		for (int i = 2; i >= 1; i--) {
			System.out.print("*");
		}
		
		System.out.println();
		for (int i = 1; i >= 1; i--) {
			System.out.print("*");
		}
		
//		System.out.println();
//		System.out.println("==== 문제1-2 풀이====");
//		for (int j = 1; j <= 5; j++) {
//			for (int i = 5; i <= 5; i--) {
//				System.out.print("*");
//			}
//		System.out.println();
//		}
		
		System.out.println();
		System.out.println("==== 문제1-2 풀이====");
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}		

		
		System.out.println();
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 5; j > 0; j--) {
//				System.out.println();
//			}
//			System.out.print("*");
//		}
		
		
		
//		문제2)
//		    * : 빈칸 4개 + "*" 1개
//		   **
//		  ***
//		 ****
// 		*****
//
		System.out.println();
		System.out.println();
		System.out.println("==== 문제2 ====");
//		for (int i = 0; i <= 5; i++) {
//			System.out.print("*");
//			for (int j = 4; j > i; j--) {
//				for (int k = 4; k == j; k--) {
//				}
//				System.out.print(" ");
//		System.out.println();
//			}
//		}
		
		int lineCnt = 1;
		int spaceCnt = 4;
		int starCnt = 1;
		
		for (int line = 1; line < 5; line++) {
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			lineCnt++;
			spaceCnt--;
			starCnt++;
		}
		
		
		
		
//		문제3)
//		***** : 빈칸 0개 + "*" 5개
//		 ****
//		  ***
//		   **
// 		    *
//
		System.out.println();
		System.out.println("==== 문제3 ====");
		System.out.println();
		
		spaceCnt = 4;
		starCnt = 1;
		
		for (int line = 1; line < 5; line++) {
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCnt++;
			starCnt--;
		}
		
		
		System.out.println("==== SAM ====");
		
		spaceCnt = 0;
		starCnt = 5;
		for (int line = 1; line <= 5; line++) {
			//빈칸 출력
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			// * 출력
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
			spaceCnt++;
			starCnt--;
		}
		
		
		
//		문제4)
//		1
//		1 2
//		1 2 3
//		1 2 3 4 		
//		1 2 3 4 5
//
		System.out.println();
		System.out.println("==== 문제4 ====");
		System.out.println();
		
		int num = 1;
		for (int line = 1; line < 5; line++) {
			int dispNum = 1;
			for (int cnt = 0; cnt < num; cnt++) {
				System.out.print(dispNum + " ");
				dispNum++;
			}
			System.out.println();
			num++;
		}
	
		
		
//		문제5)
//		1
//		2 3
//		4 5 6
//		7 8 9 10 		
//
		System.out.println();
		System.out.println("==== 문제5 ====");
		System.out.println();
		
		num = 1;
		int dispNum = 1;
		for (int line = 1; line < 5; line++) {
			for (int cnt = 0; cnt < num; cnt++) {
				System.out.print(dispNum + " ");
				dispNum++;
			}
			System.out.println();
			num++;
		}
		
		
		
	}

}
