package com.mystudy.array4;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		int[] nums = {10, 11, 12, 13, 14};
		System.out.println("nums : " + nums);
		System.out.println(Arrays.toString(nums));
		
		
		// Arrays.copyOf(int[] original, int newLength)
		int[] numsCopy = Arrays.copyOf(nums, nums.length); // 복제
//		int[] numsCopy = nums; // 주소값 복사
		System.out.println("numsCopy : " + numsCopy);
		System.out.println(Arrays.toString(numsCopy));

		System.out.println("---- 동일 객체 확인 작업 ----");
		if (nums == numsCopy) {
			System.out.println("동일객체(주소값 복사)");
		} else {
			System.out.println("복사본은 독립 객체(독립 데이터)");
		}
		
		System.out.println();
		System.out.println("---- Arrays.copyOfRange() ----");
		// Arrays.copyOfRange(int[] original, int from, int to);
		int[] numsCopyRange = Arrays.copyOfRange(nums, 0, 3);
		System.out.println("numsCopyRange : " + numsCopyRange);
		System.out.println(Arrays.toString(numsCopyRange));
		
		
		System.out.println();
		System.out.println("---- 1 ~ 4 ----");
		// Arrays.copyOfRange(int[] original, int from, int to);
		numsCopyRange = Arrays.copyOfRange(nums, 1, 4);
		System.out.println("numsCopyRange : " + numsCopyRange);
		System.out.println(Arrays.toString(numsCopyRange));
		
		
		
		
		
		
		
		
		
		
	}

}



















