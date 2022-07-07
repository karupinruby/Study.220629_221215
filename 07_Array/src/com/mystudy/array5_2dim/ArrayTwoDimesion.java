package com.mystudy.array5_2dim;

import java.util.Arrays;

public class ArrayTwoDimesion {

	public static void main(String[] args) {
		// 2차원 배열 선언 및 객체 생성
		// 타입[][] 변수명 = new 타입[크기값][크기값];
		// 타입 변수명[][] = new 타입[크기값][크기값];
		// 타입[][] 변수명 = {{..}, {..}, ..., {...}};
		int[][] nums = { {10, 20}, // 10 : nums[0][0], 20 : [0][1]
					     {30, 40},	
					     {50, 60},	
					     {70, 80},	
					     {90, 100, 110},	
		               };
		System.out.println("nums : " + nums);
		System.out.println("nums[0] : " + nums[0]);
		System.out.println("nums[0][0] : " + nums[0][0]);
		System.out.println("nums[0][1] : " + nums[0][1]);
		
		
		// 배열에 있는 데이터를 모두 출력
		System.out.println();
		System.out.println("-- 배열에 있는 데이터를 모두 출력 --");
		System.out.print("nums[0][0] : " + nums[0][0] + " / ");
		System.out.print("nums[0][1] : " + nums[0][1]);
		System.out.println();
		System.out.print("nums[1][0] : " + nums[1][0] + " / ");
		System.out.print("nums[1][1] : " + nums[1][1]);
		System.out.println();
		System.out.print("nums[2][0] : " + nums[2][0] + " / ");
		System.out.print("nums[2][1] : " + nums[2][1]);
		System.out.println();
		
		System.out.println();
		System.out.println("-- for문으로 출력 --");
		for (int i = 0; i < 2; i++) {
			System.out.println("nums[0][" + i + "] : " + nums[0][i]);
			
		}
		
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.println("nums[1][" + i + "] : " + nums[1][i]);
			
		}
		
		System.out.println();
		System.out.println("-- 이중 for문으로 출력 --");
		System.out.println("nums.length : " + nums.length);
		System.out.println("nums[0].length : " + nums[0].length);
		System.out.println("nums[1].length : " + nums[1].length);
		for (int i = 0; i < nums[0].length; i++) {
			System.out.print(nums[0][i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("-- 이중 for문 --");
		for (int k = 0; k < nums.length; k++) {
			for (int i = 0; i < nums[k].length; i++) {
				System.out.print(nums[k][i] + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println(Arrays.deepToString(nums));

		
		
		
		
		
		
		
	}

}


























