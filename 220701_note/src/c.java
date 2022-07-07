
public class c {
	public static void main(String[] args) {

		int score = (int) (Math.random() * 20) + 1;
		System.out.println("점수 :" + score);

		String grade;

		if (score >= 90) {
			if (score > 95) {	// 중첩 if문
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score > 85) {	// 중첩 if문
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점 :" + grade);
	}
}
