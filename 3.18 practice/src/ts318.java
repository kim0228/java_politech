import java.util.Scanner;

public class ts318 {
		
	public static void main(String[] args) {
			int score1 = 98;
			int score2 = 86;
			int score3 = 78;
			// 학생1의 국어점수는 score1
			// 학생2의 국어점수는 score2
			// 학생3의 국어점수는 score3
			
			Scanner s = new Scanner(System.in);
			
			score1 = s.nextInt();
			score2 = s.nextInt();
			score3 = s.nextInt();
			
			if (score1 > 90 && score1 < 100) {
				System.out.println("학생1이 1등입니다.");
			} else if (score2 > 85 && score2 < 90) {
				System.out.println("학생2는 2등입니다.");
			} else if (score3 > 75 && score3 < 80) {	
				System.out.println("학생3은 3등입니다.");
			}
	}
}