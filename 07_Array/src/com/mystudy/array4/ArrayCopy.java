package com.mystudy.array4;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		printData(num1);
		printData("num1", num1);
		printData("num2", num2);
		
		System.out.println("== 배열 복사 ==");
		System.out.println("-- 1. 주소값 복사(얕은 복사, shallow copy) --");
		num2 = num1;
		num1[0] = 999;
		
		printData("num1", num1);
		printData("num2", num2);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println();
		System.out.println("-- 2. 물리적 복사(깊은 복사, deep copy) --");
		int[] num3 = new int[5];
		System.out.println("num3 : " + num3);
		printData("num3", num3);
		
		
		System.out.println("num1 -> num3 데이터 복사");
		for (int i = 0; i < num1.length; i++) {
			num3[i] = num1[i];
		}
		printData("num1", num1);
		printData("num2", num2);
		printData("num3", num3);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println();
		
		System.out.println("num[0] -> 888 변경 후");
		num1[0] = 888;
		printData("num1", num1);
		printData("num2", num2);
		printData("num3", num3);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println();
		
		
		System.out.println("num[1] -> 777 변경 후");
		num1[1] = 777;
		printData("num1", num1);
		printData("num2", num2);
		printData("num3", num3);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		
		System.out.println();
		System.out.println();
		System.out.println("== System.arraycopy() ==");
		int[] num4 = new int[num1.length];
		printData("num4", num4);
		// void java.lang.System.arraycopy
		// (Object src, int srcPos, Object dest,
		// int destPos, int length)
		// (소스 배열, 소스 시작 위치, 대상 배열, 대상 시작 위치, 크기)
		System.arraycopy(num3, 0, num4, 0, num1.length);
		System.out.println(">> System.arraycopy() 복사 후") ;
		printData("num4", num4);
		
		if (num1 == num2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체(2개의 독립된 데이터)");
		}
		
		
		System.out.println();
		System.out.println("== 실습 : 배열객체.clone() 복사 ==");
		int[] num5 = num4.clone();
		printData("num4", num4);
		printData("num5", num5);
		System.out.println("num4 == num5 : " + (num4 == num5));
		System.out.println("num1 == num2 : " + (num1 == num2));
		
		
		
		
		
		
	}

	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();	
		System.out.println();	
		System.out.println();	
	}
	
	// 메소드 오버로딩(method overloading) : 같은 메소드 이름에 파라미터(타입, 갯수, 종류)를 추가하는 동작
	static void printData(String name, int[] num) {
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();	
		System.out.println();	
		System.out.println();	
	}
	
	
}









