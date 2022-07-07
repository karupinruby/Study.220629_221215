package com.mystudy.array;

public class SAM_ArrayEx3 {

	public static void main(String[] args) {
		// 변수값 서로 교환하기
		int a = 100;
		int b = 200;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int temp;
		temp = a; //a 값 복사본 만들기
		a = b;
		b = temp;
		
		System.out.println("---- 교환후 ---");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("temp: " + temp);
		System.out.println("=================");
		//            0    1    2    3    4  : 5개
		int[] nums = {100, 200, 300, 400, 500, 600};
		System.out.println("배열의 크기 : " + nums.length);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("-------");
		printArray(nums);
		
		System.out.println("------------------");
		//배열 데이터 중 첫번째와 마지막 맞교환
		// nums[0] <-> nums[4]
		System.out.println("nums[0] <-> nums[4] 교환");
		temp = nums[0]; //첫번째 데이터
		nums[0] = nums[nums.length - 1]; //마지막데이터를 첫번째 데이터에 복사
		nums[nums.length - 1] = temp;
		printArray(nums);
		
		//nums[1] <-> nums[3]
		System.out.println("nums[1] <-> nums[3] 교환");
		temp = nums[1];
		nums[1] = nums[nums.length - 2]; //마지막 이전데이터
		nums[nums.length - 2] = temp;
		printArray(nums);
		
		System.out.println("=========================");
		//(실습)배열의 데이터 갯수와 관계없이 데이터를 뒤집는 로직 작성
		nums = new int[] {100, 200, 300, 400, 500};
		printArray(nums);
		System.out.println("-----");
		
		for (int i = 0; i < nums.length / 2; i++) {
			temp = nums[i]; 
			nums[i] = nums[nums.length - (i + 1)]; 
			nums[nums.length - (i + 1)] = temp;
			
			printArray(nums);
		}
		
		

	}//main end
	
	//메소드 만들기 - 배열값 화면 출력
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	
}//class end






