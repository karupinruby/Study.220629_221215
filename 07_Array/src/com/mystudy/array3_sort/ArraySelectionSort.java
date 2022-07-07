package com.mystudy.array3_sort;

import java.util.Arrays;

public class ArraySelectionSort {

	public static void main(String[] args) {
		// 배열에 저장된 숫자 정렬(오름차순 : ASC / 내림차순 : DSC)
		
		System.out.println("==== 오름차순 ====");
		int[] num = {30, 20, 50, 40, 10};
		
		System.out.println("==== 오름차순 : 원본 데이터(메인 메소드 내 출력) ====");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("==== 오름차순 : 원본 데이터(메소드 생성 후 출력) ====");
		printData(num);

		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡ 정렬 시작 ㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡㅡㅡ 인덱스0 <-> 인덱스1 ㅡㅡㅡㅡ");
		if (num[0] > num[1]) {
			int tmp = num[0];
			num[0] = num[1];
			num[1] = tmp;
		}
		printData(num);
		
		System.out.println();		
		System.out.println("ㅡㅡㅡㅡ 인덱스0 <-> 인덱스2 ㅡㅡㅡㅡ");
		if (num[0] > num[2]) {
			int tmp = num[0];
			num[0] = num[2];
			num[2] = tmp;
		}
		printData(num);
		
		System.out.println();		
		System.out.println("ㅡㅡㅡㅡ 인덱스0 <-> 인덱스3 ㅡㅡㅡㅡ");
		if (num[0] > num[3]) {
			int tmp = num[0];
			num[0] = num[3];
			num[3] = tmp;
		}
		printData(num);
		
		System.out.println();		
		System.out.println("ㅡㅡㅡㅡ 인덱스0 <-> 인덱스4 ㅡㅡㅡㅡ");
		if (num[0] > num[4]) {
			int tmp = num[0];
			num[0] = num[4];
			num[4] = tmp;
		}
		printData(num);
		
		System.out.println();		
		System.out.println("==== 반복문 사용 정렬 ====");
		num = new int[] {30, 20, 50, 40, 10};
		System.out.print("변경 전 : ");
		printData(num);
		
		System.out.println();		
		System.out.println("ㅡㅡ 첫 번째 데이터 처리(인덱스0) ㅡㅡ");
		for (int i = 1; i <= 4; i++) {
			if (num[0] > num[i]) {
				int tmp = num[0];
				num[0] = num[i];
				num[i] = tmp;
			}
			printData(num);
		}
		
		num = new int[] {30, 20, 50, 40, 10};
		System.out.print("변경 전 : ");
		printData(num);
		
		System.out.println();		
		System.out.println("ㅡㅡ 첫 번째 데이터 처리(인덱스0) ㅡㅡ");
		for (int i = 1; i <= 4; i++) {
			if (num[0] > num[i]) {
				int tmp = num[0];
				num[0] = num[i];
				num[i] = tmp;
			}
			printData(num);
		}
		
		System.out.println();		
		System.out.println("ㅡㅡ 두 번째 데이터 처리(인덱스1) ㅡㅡ");
		for (int i = 2; i <= 4; i++) {
			if (num[1] > num[i]) {
				int tmp = num[1];
				num[1] = num[i];
				num[i] = tmp;
			}
			printData(num);
		}
		
		System.out.println();		
		System.out.println("ㅡㅡ 세 번째 데이터 처리(인덱스2) ㅡㅡ");
		for (int i = 3; i <= 4; i++) {
			if (num[2] > num[i]) {
				int tmp = num[2];
				num[2] = num[i];
				num[i] = tmp;
			}
			printData(num);
		}
		
		System.out.println();	
		System.out.println();	
		num = new int[] {30, 20, 50, 40, 10};
		System.out.println("== 이중 반복문 사용 데이터 정렬 ==");
		System.out.print("변경 전 : ");
		printData(num);
		
		System.out.println();		
		for (int gijun = 0; gijun < num.length - 1; gijun++) {
			System.out.println("기준 인덱스 : " + gijun);
			for (int i = (gijun + 1); i < num.length; i++) {
				 if (num[gijun] > num[i]) {
					 int tmp = num[gijun];
					 num[gijun] = num[i];
					 num[i] = tmp;
				 }
				 System.out.print("반복문 사용 계산 : ");
				 printData(num);
			}
		}
		System.out.println();
		System.out.print("반복문 사용 후 : ");
		printData(num);
		
		System.out.println();	
		System.out.println();	
		num = new int[] {30, 20, 50, 40, 10};
		System.out.print("정렬 전 : ");
		printData(num);		
		
		Arrays.sort(num);	
		System.out.println("-- Arrays.sort() 사용 --");
		System.out.print("정렬 후 : ");
		printData(num);		
		
		
		
		
		
		
		
	}

	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
	}
	
	
}
