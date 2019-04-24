import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class Player6 extends Player {
	Player6() {
		this.hp = 150;
		this.name = "서보국보국보구기";
		System.out.println(this.name + "~임수황무거부기와두루미삼천갑자어쩌구저쩌구하며 나타났다.");
	}
	public int getAttackPower() {
		System.out.println("이 플레이어는 사실 나무늘보였습니다!!!");
		delayTime(1);
		System.out.println("나무늘보가 공격을 시작합니다!!!");
		
		String dot = ".";
		for (int i = 0; i < 5; i++) {
			delayTime(1);
			System.out.println(dot);
			dot = dot + ".";
		}
		System.out.println("아 이제서야 공격을합니다....");
		delayTime(1);
		System.out.println("아 공격도 약합니다........");
		delayTime(1);
		return 5;
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber <= 8) {
//			받은 데미지가 남아있는 hp 보다 클 경우 hp 값 100으로 재	설정
			if (attackPower > hp) {
				hp = 100;
				System.out.println(this.name + "이(가) hp:100으로 부활했습니다");
			} else {
				hp = hp - attackPower;
				System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
			}
			
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
//		player 남은 hp 출력
		System.out.println(this.name + "의 남은 HP:" + hp);
	}
	
	private static void delayTime(int delaySec) {	
		Robot robot = null;
		try {
			//create instance
			robot = new Robot();
		} catch (AWTException e) {

		}
		robot.delay(delaySec * 1000);
	}
}