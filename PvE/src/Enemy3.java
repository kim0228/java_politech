import java.util.Random;

public class Enemy3 extends Enemy {
	Enemy3() {
		this.name = "퀴즈과제시험";
		this.hp = 1515155555;
		System.out.println(" 지옥의 " + this.name + "출현");
	}
	public int getAttackPower() {
		return 10;
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(15151515);
		if (hitNumber == 0) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었지만 간지러워 합니다.");
		} else {
			System.out.println("태연하게 " + this.name + "이(가) 회피했습니다.");
			
		}
	}
}
