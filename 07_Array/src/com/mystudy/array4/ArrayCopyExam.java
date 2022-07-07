package com.mystudy.array4;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// (실습) 배열 주소 변경 및 복사
		// 문제1) int 타입의 데이터 3개를 저장할 수 있는 배열(num1)에
		//      1. 10, 20, 30 숫자를 입력하고 화면 출력
		//      2. 세 번째 데이터를 100으로 바꾸고 화면 출력
		// 문제2) num1과 같은 크기의 배열 num1Copy를 만들고
		//       num1 데이터를 num1Copy에 복사하고 화면 출력
		// 문제3) 주소주소 복사 / 데이터 복사 여부 확인
		
		System.out.println("==== 문제1 ====");
		int[] num1 = {10, 20, 30};
		System.out.println("num1주소 : " + num1);
		System.out.print("num1 : ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		num1[2] = 100;
		System.out.print("3번째 데이터 변경 : ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int[] num1Copy = new int[num1.length];
		System.out.print("num1Copy주소 : " + num1Copy);

		System.out.println();
		
		num1Copy[0] = 1;
		num1Copy[1] = 2;
		num1Copy[2] = 3;
		
		for (int i = 0; i < num1.length; i++) {
			num1Copy[i] = num1[i];
		}
		
		System.out.print("num1Copy : ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1Copy[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < num1.length; i++) {
			System.out.println("num1 : " + num1[i] + " / " + "num1Copy : " + num1Copy[i]);
		}
		System.out.println(" ---------- ");
		System.out.println();
		
		
		System.out.print("num1 : ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " / ");
		}
		System.out.println();
		
		System.out.print("num1Copy : ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1Copy[i] + " / ");
		}
		System.out.println();
		
		

		System.out.println(" ---------- ");
		System.out.println();
	

		System.out.println("== num1 -> num1Copy 복사 ==");
		printData("num1", num1);
		printData("num1Copy", num1Copy);
		
		System.out.println("num1주소 : " + num1);
		System.out.println("num1Copy주소 : " + num1Copy);
		System.out.println(" ---------- ");
		System.out.println();
	
		num1[0] = 111;
		printData("num1", num1);
		printData("num1Copy", num1Copy);
		
		System.out.println("num1 == num1Copy : " + (num1 == num1Copy));
		
		}
	
	static void printData(String name, int[] num) {
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();	
			
		
	}
	

}
