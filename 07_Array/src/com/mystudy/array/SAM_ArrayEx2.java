package com.mystudy.array;

import java.util.Arrays;

public class SAM_ArrayEx2 {

	public static void main(String[] args) {
		//(실습) 배열만들고 데이터 저장, 화면 출력
		// 1. 배열 선언 int 값 10개를 저장할 수 있는 배열(nums) 만들기
		// 2. 1~10까지의 수를 배열에 저장(반복문사용)
		// 3. 배열에 저장된 데이터 화면 출력(반복문사용)
		//   출력형태 : 변수명[인덱스번호] : 값
		//---------------------------------------------
		// 1. 배열 선언 int 값 10개를 저장할 수 있는 배열(nums) 만들기
		int[] nums = new int[10];
		
		// 2. 1~10까지의 수를 배열에 저장(반복문사용)
		nums[0] = 1; // 값 : 인덱스번호 + 1
		nums[1] = 2; // 값 : 인덱스번호 + 1
		nums[2] = 3;
		
		//데이터 입력
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		System.out.println(Arrays.toString(nums));
		
		//배열 값 출력
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] : " + nums[i]);
		}
		
		System.out.println("===== 홀수합계 구하기 ========");
		//(실습) 배열에 있는 숫자 중에서 홀수합 구하기(배열값 사용)
		// 배열에 저장된 값 중에서 홀수값만 더해서 합계(sum) 구하기
		//------------------------------- 
		nums = new int[] {5, 3, 9, 2, 7, 1, 10, 4, 6, 8};
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) { //홀수냐?
				sum += nums[i]; //sum = sum + nums[i];
				System.out.println(nums[i]);
			}
		}
		System.out.println("홀수합계: " + sum);
		
		System.out.println("===== 짝수합/홀수합 구하기 =======");
		//(실습) 배열에 저장된 데이터 합계구하기
		// 짝수는 짝수끼리 합산(evenSum)
		// 홀수는 홀수끼리 합산(oddSum)
		// 결과 출력예)
		// 짝수합계 : ??
		// 홀수합계 : ??
		//------------------------------- 
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) { //짝수냐?
				evenSum += nums[i];
				System.out.println("짝수: " + nums[i]);
			} else {
				oddSum += nums[i];
				System.out.println("홀수: " + nums[i]);
			}
		}
		System.out.println(">> 짝수합계: " + evenSum);
		System.out.println(">> 홀수합계: " + oddSum);
		
		System.out.println("===================");
		//==============================
		/*  문제 : 배열 데이터 사용 출력
		!
		!@
		***
		****
		*****
		-------------*/
		//char[] ch = {'*', '*', '*', '*', '*'};
		char[] ch = {'!', '@', '#', '$', '%'};
		
		for (int i = 0; i < 1; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("-------------");
		int printCnt = 1;
		for (int line = 1; line <= 5; line++) {
			for (int idx = 0; idx < printCnt; idx++) {
				System.out.print(ch[idx]);
			}
			System.out.println();
			printCnt++;
		}
		
		System.out.println("--------------");
		for (int line = 1; line <= 5; line++) {
			for (int idx = 0; idx < line; idx++) {
				System.out.print(ch[idx]);
			}
			System.out.println();
		}
		
	}

}














