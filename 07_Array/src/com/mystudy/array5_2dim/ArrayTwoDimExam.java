package com.mystudy.array5_2dim;

import java.util.Arrays;

public class ArrayTwoDimExam {

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
		
		int[][] num2dim = { {10, 20}, {30, 40}, {50, 60},
				             {70, 80}, {90, 100, 110},	
                           };
		
		System.out.println("Arrays.deepToString(num2dim)");
		System.out.println(Arrays.deepToString(num2dim));
		System.out.println();
		System.out.println("nums2dim.length : " + num2dim.length);
		
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.println(num2dim[0][i]);
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println(num2dim[1][i]);
		}
		
		System.out.println("-- -- -- --");
		for (int i = 0; i < num2dim.length; i++) {
			System.out.println(num2dim[i][1]);
		}
		
		System.out.println("-- -- -- --");
		System.out.println("문제1. 2차원 배열 num2dim의 데이터를 화면에 출력");
		for (int j = 0; j < num2dim.length; j++) {
			for (int i = 0; i < num2dim[j].length; i++) {
				System.out.println(num2dim[j][i]);
			}
		}
		
		System.out.println("-- -- -- --");
		System.out.println("문제2. 배열의 세 번째 값 30을 100으로 변경하고 화면 출력(전체)");
		for (int j = 0; j < num2dim.length; j++) {
						for (int i = 0; i < num2dim.length; i++) {
				if (30 == num2dim.length && 100 == num2dim.length) {
					int[] tmp = num2dim[i];
					num2dim[i] = num2dim[j];
					num2dim[j] = tmp;
					System.out.println(Arrays.deepToString(num2dim));
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		
		
		printData("num2dim", num2dim);
		
		
		
		
		
		
	}
	
	static void printData(String name, int[][] num) {
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();	
	}
	

}

















