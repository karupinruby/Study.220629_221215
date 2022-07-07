
public class b {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;    // 1 ~ 6에서 임의의 정수를 뽑는 Math.random() 메소드를 사용(해당 메소드는 추후 포스팅에서 다룰 예정) 
			
			if (num == 1) {
				System.out.println("1번이 나왔습니다.");
			} 
			else if (num == 2) {
				System.out.println("2번이 나왔습니다.");
			} 
			else if (num == 3) {
				System.out.println("3번이 나왔습니다.");
			} 
			else if (num == 4) {
				System.out.println("4번이 나왔습니다.");
			}
			else if (num == 5) {
				System.out.println("5번이 나왔습니다.");
			} else {
				System.out.println("6번이 나왔습니다.");
			}
		}
}
