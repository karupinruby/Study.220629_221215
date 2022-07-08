package com.mystudy.array5_2dim;

import java.util.Arrays;

public class ArrayTwoDimExam_SAM {

	public static void main(String[] args) {
		// (실습) 2차원 배열을 사용해서
		// int[][] num2dim = {{10, 20},
	    //                    {30, 40},	
	    //                    {50, 60},	
	    //                    {70, 80},	
	    //                    {90, 100, 110},	
      	//					 };

		// 문제1. 2차원 배열 num2dim의 데이터를 화면에 출력 : 10, 20, 30, ...
		// 문제2. 배열의 세 번째 값 30을 100으로 변경하고 화면 출력(전체)
		// 문제3. num2dim 크기만큼 num2Copy 배열에 복사하고 화면 출력
		//       (num2dim 데이터 중 10의 값을 999로 변경 후 num2copy 값 확인)
		
		int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		
		System.out.println("Arrays.toString(num2dim)");
		System.out.println(Arrays.toString(num2dim));
		System.out.println();
		System.out.println("Arrays.deepToString(num2dim)");
		System.out.println(Arrays.deepToString(num2dim));
		System.out.println();
		System.out.println("nums2dim.length : " + num2dim.length);
		System.out.println();
		System.out.println();
		
		System.out.println("ㅡㅡ num2dim 데이터 주소 ㅡㅡ ");
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			System.out.println(num2dim[d2]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("-- -- -- --");
		System.out.println("문제1. 2차원 배열 num2dim의 데이터를 화면에 출력");
		for (int i = 0; i < num2dim[0].length; i++) {
			System.out.print(num2dim[0][i] + " ");
		}
		
		System.out.println();
		System.out.println();
		for (int i = 0; i < num2dim[1].length; i++) {
			System.out.print(num2dim[1][i] + " ");
		}
		
		
		System.out.println();
		System.out.println();
		for (int i = 0; i < num2dim[2].length; i++) {
			System.out.print(num2dim[2][i] + " ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("-- 문제1. 이중 반복문 활용 출력 --");
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("-- -- -- --");
		System.out.println("문제2. 배열의 세 번째 값 30을 100으로 변경하고 화면 출력(전체)");
		System.out.println(num2dim[1][0]);
		num2dim[1][0] = 100;
		System.out.println(num2dim[1][0]);
		System.out.print("전체 데이터 : ");
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("-- -- -- --");
		System.out.print("데이터 메소드 생성 후 출력");
		printData(num2dim);
		
		
		System.out.println();
		System.out.println("-- -- -- --");
		System.out.println("문제3. num2dim 크기만큼 num2Copy 배열에 복사하고 화면 출력");
		int[][] num2Copy = new int[num2dim.length][];
		System.out.println(Arrays.toString(num2Copy));
		
//		System.out.println("-- 1차원배열 만들고 저장 --");
//		num2Copy[0] = new int[num2dim[0].length];
//		num2Copy[1] = new int[num2dim[1].length];
//		num2Copy[2] = new int[num2dim[2].length];
//		System.out.println(Arrays.toString(num2Copy));
//		System.out.println(Arrays.toString(num2Copy[0]));
//		System.out.println(Arrays.toString(num2Copy[1]));
//		System.out.println(Arrays.toString(num2Copy[2]));

		System.out.println();
		System.out.print("-- num2Copy 데이터 확인 --");
		for (int i = 0; i < num2Copy.length; i++) {
			num2Copy[i] = new int[num2dim[i].length];
		}
		printData(num2Copy);
		System.out.println(Arrays.deepToString(num2Copy));
		System.out.println(Arrays.toString(num2Copy));
		
		System.out.println();
		System.out.println("-- -- -- --");
		System.out.println("문제3-2. num2dim 크기만큼 num2Copy 배열에 복사하고 화면 출력");
		
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int i = 0; i < num2dim[d2].length; i++) {
				num2Copy[d2][i] = num2dim[d2][i];
			}
		}
		printData(num2Copy);
		System.out.println(Arrays.deepToString(num2Copy));
		
		System.out.println();
		System.out.println("-- -- -- --");
		System.out.println
		("문제3-3. num2dim 데이터 중 10의 값을 999로 변경 후 num2copy 값 확인");
		System.out.println("-- 동일객체 여부 확인 --");
		System.out.println
		("num2dim == num2Copy : " + (num2dim == num2Copy));
		num2Copy[0][0] = 999;
		System.out.println();
		System.out.println("-- num2Copy[0][0] = 999 실행 후 --");
		printData("num2dim", num2dim);
		printData("num2Copy", num2Copy);
		
		System.out.println();
		System.out.println("-- -- -- --");
		System.out.println("메소드 .clone() 적용 배열 복사 ----");
		int[][] copyClone = num2dim.clone(); // <<< ***얕은 복사***
		
		
//		int[][] copyClone = new int[num2dim.length][];
//		for (int i = 0; i < num2dim.length; i++) {
//			copyClone[i] = num2dim[i].clone();    <<< ***물리적 복사***
//		}
		System.out.println("copyClone : " + copyClone);
		printData("copyClone", copyClone);
		System.out.println("-- 동일객체 여부 확인 --");
		System.out.println
		("num2dim == copyClone : " + (num2dim == copyClone));
		System.out.println("num2dim : " + Arrays.toString(num2dim));
		System.out.println("copyClone : " + Arrays.toString(copyClone));
		
		copyClone[0][0] = 777;
		printData("num2dim", num2dim);
		printData("copyClone", copyClone);
		
		
//		clone.(), System.arraycopy(), Arrays.coptOf() 사용시 주의점
//		데이터를 저장하고 있는 객체를 대상으로 복제 처리 : 물리적으로 데이터를 저장하고 있는 대상 상대
		
		System.out.println();
		System.out.println("-- 향상(개선)된 for문 --");
		System.out.println(" : 다른 프로그램 forEach문과 유사");
		int[] nums = {10, 20, 30}; // 평소 사용 for문 : 인덱스 적용시 사용
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();
		
		//for (타입 변수명 : 집합객체) { }
		for (int num : nums) {  // 향상된 for문 : 데이터만 필요할시 사용
			System.out.println(num);
		}
		
		

	}

	static void printData(String name, int[][] num2dim) {
//		System.out.println();
		System.out.print(name + " : ");
//		System.out.print("전체 데이터 : ");
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
	}
	
	static void printData(int[][] num2dim) {
		System.out.println();
		System.out.print("전체 데이터 : ");
		for (int d2 = 0; d2 < num2dim.length; d2++) {
			for (int i = 0; i < num2dim[d2].length; i++) {
				System.out.print(num2dim[d2][i] + " ");
			}
		}
		System.out.println();
	}
	
	
	
	
	
}












