// package 선언문 : java 파일의 맨 첫줄에 위치하며, 한 번만 작성
// 자바(class) 파일의 위치를 나타냄
// 일반적으로 회사의 도메인을 반대로 사용해서 시작


package edu.class1.basic;

import java.util.Scanner;
// 대표문자 : 1. import java.lang.*;
//		    2. 대표 문자(wild card) *
//		    3. *      <<<< 모든 것을 뜻하는 문자
//		       사용 가능
//		    
//			import 선언문 : 선택항목이지만 일반적으로 사용
//			(java.lang 패키지 이외의 패키지에 있는 타입 사용시 사용)
//		    class 선언문 : 필수항목

public class Ex01_package_import_class {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> 인사말 : ");
		String hello = scan.nextLine();
		System.out.println("인사말출력: " + hello);

	
	
	
	
//	import 구문 없을 시 사용 방법
//	public static void main(String[] args) {
//		java.util.Scanner scan = new java.util.Scanner(System.in);
//		System.out.print(">> 인사말 : ");
//		String hello = scan.nextLine();
//		System.out.println("인사말출력: " + hello);
	}

}
