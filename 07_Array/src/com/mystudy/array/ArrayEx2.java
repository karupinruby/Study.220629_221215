package com.mystudy.array;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 1. 배열 선언 int 값 10개를 저장할 수 있는 배열(nums) 만들기
		// 2. 1~10까지의 수를 배열에 저장(반복문 사용)
		// 3. 배열에 저장된 데이터 화면 출력
		// 출력형태 : 변수명[인덱스번호] : 값
		
		System.out.println("== 1번 ==");
		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] : " + nums[i]);
		}
		
		System.out.println();
		System.out.println("== 2번 ==");
		int[] nums2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("nums2 : " + Arrays.toString(nums2));
		
		for (int i = 0; i < nums2.length; i++) {
			System.out.println("nums2[" + i + "] : " + nums2[i]);
		}
		
		System.out.println();
		System.out.println("== 3번 ==");
		int[] nums3 = new int[10];
		for (int i = 0; i < nums3.length; i++) {
			nums3[i] = i + 1;
		}
		System.out.println(Arrays.toString(nums3));
		
		for (int i = 0; i < nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		
	    // 홀수값만 더해서 합계(sum) 구하기
		System.out.println();
		System.out.println("== 1~10까지의 수 중에서 홀수 합 구하기 ==");
		for (int i = 0; i < nums3.length; i++) {
			if (i % 2 != 0); {
				System.out.println(i);
			}
		}

		
		
		// 짝수는 짝수끼리, 홀수는 홀수끼리 합계 더하기
		// 홀수값만 더해서 합계(sum) 구하기
		// 짝수 합 = evenSum
		// 홀수 합 = oddSum
		System.out.println();
		System.out.println("== 1~10까지의 수 중에서 짝수 합 / 홀수 합 구하기 ==");
		
		
		int[] nums11 = new int[10];
		
		//데이터 입력
		for (int i = 0; i < nums11.length; i++) {
			nums11[i] = i + 1;
		}

		
		//배열 값 출력
		for (int i = 0; i < nums11.length; i++) {
			System.out.println("nums[" + i + "] : " + nums11[i]);
		}
		
		System.out.println();
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < nums11.length; i++) {
			if (nums11[i] % 2 != 0) {
				System.out.println(nums11[i]);
				sum = sum + nums11[i];
			}
		}
		System.out.println("sum : " + sum);
		System.out.println();
		
		System.out.println("== 짝수 합계 ==");
		sum = 0;
		for (int i = 0; i < nums11.length; i++) {
			if (nums11[i] % 2 == 0) {
				System.out.println(nums11[i]);
			    sum = sum + nums11[i];
			}
		}
		System.out.println("sum : " + sum);

		System.out.println();
		System.out.println("== 홀수 ==");
		sum = 0;
		int[] nums22 = new int[] {100, 99, 30, 20, 44, 31, 33, 79, 11};
		for (int i = 0; i < nums22.length; i++) {
			if (nums22[i] % 2 != 0) {
				System.out.println(nums22[i]);
			    sum = sum + nums22[i];
			}
		}
		System.out.println("sum : " + sum);
		
		System.out.println();
		System.out.println("== 홀수 ==");
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < nums11.length; i++) {
			if (nums11[i] % 2 == 0) {
				evenSum += nums11[i];
				System.out.println("짝수 : " + nums11[i]);
			}
			else {
				oddSum += nums11[i];
				System.out.println("홀수 : " + nums11[i]);
			}
		}
		System.out.println("짝수 합계 : " + evenSum);
		System.out.println("홀수 합계 : " + oddSum);
		
		
		
		
		
		
		
		
		
		
		// 문제) * 삼각형
		System.out.println();
		System.out.println("== * 삼각형 * ==");
		char[] star = new char[5];
		for (int i = 0; i < star.length; i++) {
			star[i] = '*';
			System.out.println(star[i]);
		}
		
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star.length; j++) {
				star[i] += 1;
				System.out.println(j + "00" + star[i]);
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

		
		for (int i = 0; i < 1; i++) {
			
		}
		
	}

}








