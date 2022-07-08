
public class Ex01_if {

	public static void main(String[] args) {
		/* 제어문-분기문(비교문) : if문
		if (조건식) {
			실행할 문장(조건이 참일 경우);
		}		
		*/

		int num1 = 10;
		int num2 = 20;
		if (num1 < num2) {
			System.out.println("num1이 num2보다 작다");
		}	
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크거나 같다");
		}		
		System.out.println(">>비교작업 끝");
		
		System.out.println();
		
		boolean result = num1 < num2;
		if (result) {
			System.out.println("num1이 num2보다 작다");
		}
		System.out.println();
		System.out.println("점수 평가 결과 출력");
		System.out.println();
		// 점수 평가 결과 출력
		// 90~100 : A, 80~89 : B, 70~79 : C, 이 외 : 노력하세요;
		// 출력 형태 = 점수 : 00, 평가결과 : 등급
		/*int jumsu = 87;
		
		int num100 = 90;
		int num90 = 80;
		int num80 = 70;
		int num70 = 0;
		
		String str100 = "평가결과 : A등급";
		String str90 = "평가결과 : B등급";
		String str80 = "평가결과 : C등급";
		String str0 = "노력하세요";
		/*
		if (jumsu > num100) {
			System.out.println("점수 : " + jumsu + ", " + str100);
		}
		if (jumsu > num90) {
			System.out.println("점수 : " + jumsu + ", " + str90);
		}
		if (jumsu > num80) {
			System.out.println("점수 : " + jumsu + ", " + str80);
		}
		if (jumsu > num70) {
			System.out.println("점수 : " + jumsu + ", " + str0);
		}
		System.out.println("수고하셨습니다");
		*/
//		int jumsu = 80;
//		
//		System.out.println("점수 : " + jumsu);
//		String result100 = 
//		if (jumsu >= 90 && jumsu <= 100) {
//			System.out.println("평가결과 : A");
//		}
//		if (jumsu >= 80 && jumsu <= 89) {
//			System.out.println("평가결과 : B");
//		}
//		if (jumsu >= 70 && jumsu <= 79) {
//			System.out.println("평가결과 : C");
//		}
//		if (jumsu >= 0 && jumsu <= 69) {
//			System.out.println("평가결과 : 노력하세요");
//		}
//		System.out.println("성적 처리 끝");
		
		
		int jumsu = 80;
		
		System.out.println("점수 : " + jumsu);
		String message = "";
		if (jumsu >= 90 && jumsu <= 100) {
		    message = "A";
				}
		if (jumsu >= 80 && jumsu <= 89) {
			message = "B";
		}
		if (jumsu >= 70 && jumsu <= 79) {
			message = "C";
		}
		if (jumsu >= 0 && jumsu <= 69) {
			message = "노력하세요";
		}
		
		System.out.println("평가결과 : " + message);
		System.out.println("성적 처리 끝");
		
		
		
	}

}








