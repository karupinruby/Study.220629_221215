
public class Ex01_boolean {

	public static void main(String[] args) {
		// 논리형 boolean : true / false 값을 가짐
		// 사용타입지정 사용할 변수명 = 초기값;
		boolean bool1 = true; // 변수선언 : 초기값 설정
		
		boolean bool2; // 변수선언
		bool2 = false; // 초기값 설정
		
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		System.out.println("----------------");
		
		
		
		bool1 = true;
		if (bool1) {
			System.out.println("if문 : bool1 참(true)이면 실행");
		} else {
			System.out.println("if문 : bool1 거짓(fale)이면 실행");
			
		}
		
		
		
		System.out.println("====END====");
		

	}

}
