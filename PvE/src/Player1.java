import java.util.Random;
import java.util.Scanner;

public class Player1 extends Player {
	Player1() {
		this.name = "명수형";
		this.hp = 5000;
		System.out.println("야생의 " + this.name + "이 나타났다!!!!!");
	}
	public int getAttackPower() {
		return 10;
	}
	public void beUnderAttack(Enemy E) {
		System.out.println("Enter를 누르면 N행시를 시작합니다.");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		Random r = new Random();
		int p = r.nextInt(3);
		if (p == 0) {
			System.out.println("엣큥☆");
			this.hp -= 10;
			System.out.println(this.hp);
		} else {
			String m1 = "F : Fine \nT : Thank You \nA : And You?";
			String m2 = "아 : 아버지 \n나 : 나를 낳으시고 \n바 : 바지적삼 \n다 : 다 적시셨네..";
			String m3 = "굴 : 굴뚝에 빠진 산타 할아버지 \n전 : 전두환";
			String m4 = "에 : 에야 에야 \n너 : 너 저 얼마 있어? \n지 : 지져서 나오면 10원에 백 대야";
			String m5 = "박 : 박식하기 그지없고 \n명 : 명석한 두뇌를 가진 \n수 : 수재요!";
			String m6 = "관 : 관세음보살 \n자 : 자비를 베푸소서";
			String m7 = "남 : 남자는 \n미 : 미쳤다";
			String m8 = "새 : 새엄마보다 \n우 : 우리 엄마가 좋다";
			String m9 = "광 : 광어 \n주 : 주이소!";
			String m10 = "대 : 대자도 돼요? \n구 : 구이도 돼요?";
//			int select = r.nextInt(10);
//			if (select == 0) {
				System.out.println(m1);
//			} else if (select == 1) {
				System.out.println(m2);
//			} else if (select == 2) {
				System.out.println(m3);
//			} else if (select == 3) {
				System.out.println(m4);
//			} else if (select == 4) {
				System.out.println(m5);
//			} else if (select == 5) {
				System.out.println(m6);
//			} else if (select == 6) {
				System.out.println(m7);
//			} else if (select == 7) {
				System.out.println(m8);
//			} else if (select == 8) {
				System.out.println(m9);
//			} else if (select == 9) {
				System.out.println(m10);
//			}
			E.hp = 0;
		}
	}
}