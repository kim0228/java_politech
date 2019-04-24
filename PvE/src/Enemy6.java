import java.util.Random;

public class Enemy6 extends Enemy {
	Enemy6() {
		this.name = "어둠의 보구기";
		this.hp = 150;
		System.out.println(this.name + "가 택시를 타고 나타났다");
	}
//	 공격력은 남은 hp에 비례해서 낮을 수록 올라감
	public int getAttackPower() {
		return 120 - hp;
	}	
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber <= 3) {
//			체력이 50 이하로 낮아질 경우 받은 데미지를 100% 흡수 함
			if (hp < 50) {
				hp = hp + attackPower;
				System.out.println(this.name + "이(가) " + attackPower + "만큼의 피해를 흡수하였습니다.");
			} else {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다.");
			}
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
//		enemy 남은 hp 출력
		System.out.println(this.name + "의 남은 HP:" + hp);
	}
}
