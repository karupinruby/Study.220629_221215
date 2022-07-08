
public class Ex04_if_sungjuk {

	public static void main(String[] args) {
		/* (실습) 성적처리
		 * 입력 : 국어(kor), 영어(eng), 수학(math) 점수
		 * 연산처리
		 *  - 총점(tot) = 국어 +영어 + 수학
		 *  - 평균(avg) = 총점 / 3
		 * 평균점수 구간별 평가(학점)
		 * 90 ~ 100 : A / 80 ~ 89 : B / 70 ~ 79 : C / 60 ~ 69 : D / other : F
		 * 
		 *  <출력 형태>
		 *  국어 : 점
		 *  영어 : 
		 *  수학 : 
		 *  --------
		 *  총점 : 
		 *  평균 : 
		 *  <평가 결과>
		 *  학점
		 */
		
		int kor =100;
		int eng = 100;
		int math = 100;
		
		int tot = kor + eng + math;
		int avg = tot / 3;
		
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("합계 : " + tot + "점");
		System.out.println("평균 : " + avg + "점");
		
		String sum = "";
		if (avg >= 90 && avg <= 100) {
			sum = "A";
		} else if (avg >= 80) {
			sum = "B";
		} else if (avg >= 70) {
			sum = "C";
		} else if (avg >= 60) {
			sum = "D";
		} else {
			sum = "F";
		}

		System.out.println("학점 : " + sum);

		
//		String stg = "학점 : ";
//		if (avg >= 90 && avg <= 100) {
//			System.out.println(stg + "A");
//		} else if (avg >= 80) {
//			System.out.println(stg + "B");
//		} else if (avg >= 70) {
//			System.out.println(stg + "C");
//		} else if (avg >= 60) {
//			System.out.println(stg + "D");
//		} else {
//			System.out.println(stg + "F");
//		}
		
		
		
		
		
		

	}

}










