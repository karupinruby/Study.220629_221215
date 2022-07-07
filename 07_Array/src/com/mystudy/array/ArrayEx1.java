package com.mystudy.array;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 배열의 선언 : 자료형[] 변수명
		// 변수의 값 저장 : 배열변수명[인덱스번호] = 값;
		/* 배열의 선언 및 생성
	  	   1. 자료형[] 변수명 = new 자료형[갯수];
			   자료형 변수명[] = new 자료형[갯수];
		   2. 자료형[] 변수명 = new 자료형[] {값1, 값2, ~~~ 등등등, 값n};
	       3. 자료형[] 변수명 = {값1, 값2, ~~~ 등등등, 값n}; //n개 데이터 저장공간 생성
		*/
		// 1. 자료형[] 변수명 = new 자료형[갯수];
		int[] arr = new int[6];
		System.out.println("arr : " + arr);
		System.out.println("arr 데이터확인 : " + Arrays.toString(arr));
		arr[0] = 100;
		System.out.println("arr[0] : " + arr[0]);
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600;
				
		System.out.println("arr 데이터확인 : " + Arrays.toString(arr));
		System.out.println();
		System.out.println("== 배열 데이터 화면 출력 ==");
		for (int i = 0; i < 6; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
			

		
		System.out.println();
		System.out.println("== 배열 데이터 합계 구하기 ==");
		//배열 데이터 합계 구하기
		int sum = 0;
		sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		System.out.println("sum : " + sum);
		System.out.println();
		System.out.println("== 반복문 이용 배열 데이터 합계 구하기 ==");
		sum = 0;
		for (int index = 0; index < 5
				; index++) {
			sum = sum + arr[index]; // 같은 결과 다른 방식 : sum += arr[index];
		}
		System.out.println("sum : " + sum);
		
		System.out.println();
		System.out.println("== 배열의 크기 값 확인(조회) ==");
		System.out.println("arr.length : " + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index]; // 같은 결과 다른 방식 : sum += arr[index];
		}
		System.out.println("sum : " + sum);
		
		
		// 2. 자료형[] 변수명 = new 자료형[] {값1, 값2, ~~~ 등등등, 값n};
		System.out.println();
		System.out.println("== 2. 2번 배열 선언 형태 ==");
	    int[] arr2 = new int[] {100, 101, 102, 103, 104};
	    System.out.println("arr2.length : " + arr2.length);
	    for (int i = 0; i < arr2.length; i++) {
	    	System.out.println(arr2[i]);
	    }
	    
	    
		
		
		
		// 3. 자료형[] 변수명 = {값1, 값2, ~~~ 등등등, 값n}; //n개 데이터 저장공간 생성
	    System.out.println();
		System.out.println("== 3. 3번 배열 선언 형태 ==");
		int[] arr3 = {10, 11, 12, 13, 14};
		System.out.println("arr3.length : " + arr3.length);
		for (int i = 0; i < arr3.length; i++) {
	    	System.out.println(arr3[i]);
	    }
		System.out.println("============");
        
        System.out.println();
        System.out.println("== 영어 알파벳 출력(A ~ Z)");
        char[] ch = new char[26]; //배열 선언 및 크기 지정
//        ch[0] = 'A' + 0;
//        ch[1] = 'A' + 1;
//        ch[2] = 'A' + 2;
//        ch[3] = 'A' + 3;
        
        //배열에 값 저장
        for (int i = 0; i < ch.length; i++) {
        	ch[i] = (char) ('A' + i);
        }
        
        //배열 값 출력(확인, 조회)
        for (int i = 0; i < ch.length; i++) {
        	System.out.println(i + " : " + ch[i]);
        }
        
        
        
        
        
        
        
        
        
        
		
	}

}









