
public class Ex06_star2 {

	public static void main(String[] args) {
		/* (실습)문제1 ----------------
		*****  : * 5번 + 줄바꿈
		****   : * 4번 + 줄바꿈
		***    : * 3번
		**
		*
		-------------------------- */
		//라인이 5개(5줄)
		int lineCnt = 5;
		int starCnt = lineCnt;
		String dispStr = "*";
		
		for (int line = 1; line <= lineCnt; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print(dispStr);
			}
			System.out.println();
			starCnt--;
		}
		
		System.out.println("------------------");
		/* (실습)문제2 ----------------
		    *  : 빈칸4 + "*" 1개 + 줄바꿈
		   **  : 빈칸3 + "*" 2개 + 줄바꿈
		  ***  : 빈칸2 + "*" 3개 + 줄바꿈
		 ****  : 빈칸1 + "*" 4개 + 줄바꿈
		*****  : 빈칸0 + "*" 5개 + 줄바꿈
		-------------------------- */
		int spaceCnt = 4;
		starCnt = 1;
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
			spaceCnt--;
			starCnt++;
		}
		
		System.out.println("------------------");
		/* (실습)문제3 ----------------
		*****  : 빈칸 0, * 5 + 줄바꿈
		 ****  : 빈칸 1, * 4 + 줄바꿈
		  ***  : 빈칸 2, * 3 + 줄바꿈
		   **
		    *
		-------------------------- */
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
		
		//====================================
		System.out.println("=========================");
		//문제 4 ------------
		//1        : (1 + 빈칸) + 줄바꿈
		//1 2      : (1 + 빈칸) + (2 + 빈칸) + 줄바꿈
		//1 2 3    : (1 + 빈칸) + (2 + 빈칸) + (3 + 빈칸) + 줄바꿈
		//1 2 3 4 
		
		
		
		//문제 5 ------------
		//1        
		//2 3      
		//4 5 6    
		//7 8 9 10 
		
		
		
		
		
		
		
	}
}














