import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Horse[] horse = new Horse[5];
		horse[0] = new Horse("1번말");
		horse[1] = new Horse("2번말");
		horse[2] = new Horse("3번말");
		horse[3] = new Horse("4번말");
		horse[4] = new Horse("5번말");

		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10; i++) {
			scanner.nextLine();

			for (int j = 0; j < horse.length; j++) {
				if (horse[j].status()) {
					horse[j].run();
				}
			}
		}

		for (int j = 0; j < horse.length; j++) {
			if (horse[j].status()) {
//				
			}
			System.out.println(horse[j].name + "의 순위 : " + horse[j].myRank + "등");
		}
		scanner.close();
	}
}
