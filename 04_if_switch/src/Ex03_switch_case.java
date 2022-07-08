
public class Ex03_switch_case {

	public static void main(String[] args) {
		// switch case 문 : 동등비교구문
		// 기본 패턴
//		switch (조건값) {
//		case 비교값1 : 
//			실행할 문장(들);
//			break;
//		case 비교값2 : 
//			실행할 문장(들);
//			break;
//		case 비교값3 : 
//			실행할 문장(들);
//			break;
//		......
//		default : 
//			실행할 문장(들);
//			break;
//		}
		
		// break; 는 항시 입력하려는 의식 필요
		
		int month = 13;
		
		switch (month) {
		case 1 :
			System.out.println("31일까지 있습니다");
			break; // 중단하고 빠져나감
		case 2 :
			System.out.println("28일 또는 29일까지 있습니다");
			break;
		case 3 :
			System.out.println("31일까지 있습니다");
			break;
		case 4 :
			System.out.println("30일까지 있습니다");
			break;
		default : // default 정해진 위치는 없으며, 항상 있어야 하는 것도 아니다.
			System.out.println("일치하는 값이 없습니다");
			break;
		case 5 :
			System.out.println("31일까지 있습니다");
			break;
		}
		System.out.println();
		System.out.println("==== switch case 끝 ====");
		System.out.println();
		
		// 동일 결과값 - 다른 방식
		// case 세로 ㅣ 가로 방식 결과는 동일
		switch (month) {
		case 1 :
		case 3 :
		case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 2 :
			System.out.println(month + "28일 또는 29일까지 있습니다");
			break;
		case 4 : case 6 : case 9 :
			System.out.println(month + "30일까지 있습니다");
			break;
		default :
			System.out.println(month + "은 잘못된 값(정상: 1~12))");
			break;
		}
			
		// 추첨 결과에 따라서 상품 지급
		// 1등: 냉장고 / 2등: 김치냉장고 / 3등: 세탁기 / 4등: 청소기
		// 그 외: 휴지
		// 추첨결과 : 000 < 당첨됐을 경우
		
		System.out.println();
		System.out.println("===== 추첨 프로그램 =====");
		System.out.println();
		
//		System.out.println("추첨 결과");
//		String result = "5등";
//		String resultMsg = ""; // 빈 문자열
		
//		switch (result) {
//			case "1등" :
//				System.out.println(result + " 냉장고");
//				break;
//			case "2등" :
//				System.out.println(result + " 김치냉장고");
//				break;
//			case "3등" :
//				System.out.println(result + " 세탁기");
//				break;
//			case "4등" :
//				System.out.println(result + " 청소기");
//				break;
//			default :
//				System.out.println("휴지");
//		}
	
		
		System.out.println("추첨 결과");
		String result = "4등";
		String resultMsg = ""; // 빈 문자열
		
		
		switch (result) {
		case "1등" :
			resultMsg = "냉장고";
			break;
		case "2등" :
			resultMsg = "김치냉장고";
			break;
		case "3등" :
			resultMsg = "세탁기";
			break;
		case "4등" :
			resultMsg = "청소기";
			break;
		default :
			resultMsg = "휴지";
			break;
		}
		
		System.out.println(result + " 상품 : " + resultMsg);
		
		
		

	}

}















