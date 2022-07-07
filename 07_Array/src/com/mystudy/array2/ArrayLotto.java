package com.mystudy.array2;

import java.util.Arrays;

public class ArrayLotto {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1. int 타입의 숫자 45개 저장할 수 있는 배열타입 변수(balls)
		// 2. 초기화 : 1 ~ 45 까지의 숫자를 입력
		// 3. 많이 섞고(Math.random()) 사용
		// 4. 6개 번호 추출(앞에서 6개)

		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 1. int 타입의 숫자 45개 저장할 수 있는 배열타입 변수(balls)
		int[] balls = new int[45];
		System.out.println(Arrays.toString(balls));
		
		// 2. 초기화 : 1 ~ 45 까지의 숫자를 입력
		balls[0] = 1;
		balls[1] = 2;
		System.out.println(Arrays.toString(balls));

		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		System.out.println("== 초기값 확인 ==");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// 3. 많이 섞고(Math.random()) 사용
		// Math.random() : 0 ~ 1 까지의 실수형 데이터(double) 리턴
		// (int) (Math.random() * 45) : 0 ~ 44까지의 숫자를 무작위로 생성
		int rNum = (int) (Math.random() * 45);
		System.out.println("랜덤숫자(0~44) : " + rNum);
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println((int) (Math.random() * 1));
//		}
		
		System.out.println("변경 전 0 : " + balls[0] + ", 랜덤 번호 : " + rNum + ", " + balls[rNum]);
		
		int tmp = balls[0];
		balls[0] = balls[rNum];
		balls[rNum] = tmp;
		System.out.println("변경 전 0 : " + balls[0] + ", 랜덤 번호 : " + rNum + ", " + balls[rNum]);
		System.out.println(Arrays.toString(balls));
		System.out.println();

		System.out.println("== 충분히 섞기 ==");
		for (int i = 1; i <= 10000; i++) {
			rNum = (int) (Math.random() * 45);
			tmp = balls[0];
			balls[0] = balls[rNum];
			balls[rNum] = tmp;
		}
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// 4. 6개 번호 추출(앞에서 6개)
		System.out.println("== 6개 번호 추출 ==");
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " : " + balls[i]);
		}
		
		
				
				
	}

}







