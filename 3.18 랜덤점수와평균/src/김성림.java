import java.util.Random;

public class 김성림 {
		public static void main(String[] args) {
			Random rand = new Random();
			
			int totalScore = 0;
			for (int i = 0; i < 3; i++) {
				int randNumber = rand.nextInt(101);
				System.out.println("입력된 점수 : "+ randNumber);
				totalScore = totalScore + randNumber;
			}	
//			int index = 0;
//			while (index < 8 ) {
//				int randNumber = rand.nextInt(101);
//				System.out.println("입력된 점수 : "+ randNumber);
//				totalScore = totalScore + randNumber;
//				index++;
//			}
			
			System.out.println("총점은 "+ totalScore + "입니다.");
			
			double averageScore = 0;
			averageScore = (double)totalScore / 8;
			
			System.out.println("평균은 "+ averageScore + "입니다.");
	}
}
