
public class Ex02_char {

	public static void main(String[] args) {
		// 문자형 char : 2 byer 사용, 문자 1글자 저장(65536개 가능 : 0 ~ 65535)
		// 자바 문자처리방식 유니코드(Unicode) 형태
		
		char char1 = 'A';
		System.out.println("char1 : " + char1);
		System.out.println("char1 정수값 : " + (int)char1);
		System.out.println("char1 다음문자 : " + (char)(char1 + 1)); // 65+1 -> char 형변환
		System.out.println("char1 다음문자 : " + char1 + 1);
		System.out.println("char1 다음문자 : " + (char1 + 1));
		System.out.println("char1 다음문자 : " + (char)(char1 + 1));
		
		char char2 = '한';
		System.out.println("char2 : " + char2);
		
		char char3 = '\uAC00'; // Unicode
		System.out.println("char3 : " + char3);
		
		char char4 = '\uAC01'; // Unicode
		System.out.println("char4 : " + char4);
		
		char char5 = '\uD10c'; // Unicode
		System.out.println("char5 : " + char5);
		
		// ("" = String 문자열 / '' = char 문자)
		
		System.out.println("char5 : " + char5 + char2);
		System.out.println("char5 : " + (char)char5 + (char)char2);
		System.out.println("char5 : " + (char5 + char2));
		
		int hex = 0xa; // 16진수 표기 0x, 0X 접두어 사용
		System.out.println("> hex : " + hex);
		
		int binary = 0b1010; // 2진수 표기 0b, 0B 접두어 사용
		System.out.println("> binary : " + binary);
		
		int octal = 012; // 8진수 표기 0접두어 사용
		System.out.println("octal : " + octal);
		
		
		

	}

}
