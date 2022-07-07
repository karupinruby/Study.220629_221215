package com.mystudy.array;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 변수값 서로 교환하기
		
		System.out.println("== 변수값 서로 교환 ==");
		int a = 100;
		int b = 200;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println();
		System.out.println("== 교환 후 ==");

		int tmp;
		System.out.println("a : " + a + "/ b : " + b);
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a : " + a + "/ b : " + b);
		
		System.out.println();
		System.out.println("== 변수값 서로 교환 ==");
		
		System.out.println();
		System.out.println();
		int[] nums = {100, 200, 300, 400, 500};
		System.out.println("배열의 크기 : " + nums.length);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("== arr 메소드 ==");
		
		printArray(nums);
		
		System.out.println();
		System.out.println();
		System.out.println("== 배열 순서 바꾸기 ==");
		// 배열 데이터 중 첫번째와 마지막 맞교환
		System.out.println("== nums[0] <-> nums[4] 교환 ==");
//		tmp = nums[0];
//		nums[0] = nums[4];
//		nums[4] = tmp;
//		printArray(nums);
		
		System.out.println("== nums[0] <-> nums[4] 교환 : 일반화 과정 ==");
		tmp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = tmp;
		printArray(nums);
		
		System.out.println("== nums[1] <-> nums[3] 교환 ==");
//		tmp = nums[1];
//		nums[1] = nums[3];
//		nums[3] = tmp;
//		printArray(nums);
		
		System.out.println("== nums[1] <-> nums[3] 교환 : 일반화 과정 ==");
		tmp = nums[1];
		nums[1] = nums[nums.length - 2];
		nums[nums.length - 2] = tmp;
		printArray(nums);
		
		
		// 배열의 데이터 갯수와 관계없이 데이터를 뒤집는 로직 작성
		System.out.println("== 실습 : 배열 데이터 교환, 일반화 과정 ==");

		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("배열의 크기 : " + arr.length);
		tmp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " / ");
		}
		
		System.out.println();
		for (int i = 0; i < arr.length / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = tmp;
			System.out.print(arr[i] + " / ");
		}
		System.out.println();
		printArray(arr);
		
		
		
		

	} // main end

	// 메소드 만들기 - 배열값 화면에 출력
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	// arr 메소드 끝
	
	
	
} // class end




















