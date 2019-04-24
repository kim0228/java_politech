import java.util.Random;
import java.util.Scanner;
public class Test21 {
	public static void main(String[] args) {
		int gbbUser1;
		int gbbUser2;
		
		Random rand = new Random();
		gbbUser1 = rand.nextInt(3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보를 입력해주세요.\n 가위는 0, 바위는 1, 보는 2 입니다 : ");
		gbbUser2 = scan.nextInt();
		
		if (gbbUser1 == gbbUser2) {
			System.out.println("비겼습니다.");
		} else if (gbbUser1 == 0 && gbbUser2 == 1) {
			System.out.println("gbbUser2가 이겼습니다.");
		} else if (gbbUser1 == 0 && gbbUser2 == 2) {
			System.out.println("gbbUser1가 이겼습니다.");
		} else if (gbbUser1 == 1 && gbbUser2 == 0) {
			System.out.println("gbbUser1가 이겼습니다.");
		} else if (gbbUser1 == 1 && gbbUser2 == 2) {
			System.out.println("gbbUser2가 이겼습니다.");
		} else if (gbbUser1 == 2 && gbbUser2 == 0) {
			System.out.println("gbbUser2가 이겼습니다.");
		} else if (gbbUser1 == 2 && gbbUser2 == 1) {
			System.out.println("gbbUser1가 이겼습니다.");
		}
	}
}			
