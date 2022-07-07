
public class char220630 {

	public static void main(String[] args) {
		// 문자형 char : 2 byer 사용, 문자 1글자 저장(65536개 가능 : 0 ~ 65535)
		// 자바 문자처리방식 유니코드(Unicode) 형태
		
		char char1 = 'A';
		char char2 = 'C';
		
		System.out.println("char1 : " + char1);
		System.out.println("char1 정수값 : " + (int)char1);
		System.out.println("char1 다음문자 : " + (char)(char1 + 1)); // 65+1 -> char 형변환
		System.out.println("char1 다음문자 : " + char1 + 1);
		System.out.println("char1 다음문자 : " + (char1 + 1));
		System.out.println("char1 다음문자 : " + (char)(char1 + 1));
		
		

		

	}

}


