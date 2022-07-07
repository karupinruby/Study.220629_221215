
public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		
		//데이터 입력
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		
		//배열 값 출력
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] : " + nums[i]);
		}
		
		System.out.println();
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				System.out.println(nums[i]);
				sum = sum + nums[i];
			}
		}
		System.out.println("sum : " + sum);
		System.out.println();
		
		System.out.println("== 짝수 합계 ==");
		sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			    sum = sum + nums[i];
			}
		}
		System.out.println("sum : " + sum);

		System.out.println();
		System.out.println("== 홀수 ==");
		sum = 0;
		int[] nums2 = new int[] {100, 99, 30, 20, 44, 31, 33, 79, 11};
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] % 2 != 0) {
				System.out.println(nums2[i]);
			    sum = sum + nums2[i];
			}
		}
		System.out.println("sum : " + sum);
		
		System.out.println();
		System.out.println("== 홀수 ==");
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println("짝수 : " + nums[i]);
			}
		}
		
		

	}

}

















