import java.util.Random;

public class Enemy5 extends Enemy {
	Enemy5() {
		this.name = "대마왕 정예은";
		this.hp = 5000;
		System.out.println("야생의" + this.name + "이 출현했다.");
	}
	public int getAttackPower() {   // 2147483647
		Random random = new Random();
		int getAtt = random.nextInt(3);
		if (getAtt == 1) {
			System.out.println(this.name +" 밥을 먹고 강해졌습니다!!! (공격력이 3배가 되었습니다.)");
			return 30;
		} else {
			return 10;
		}
	}	
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber < 2) {
			hp = hp - (10 * attackPower);
			System.out.println(this.name + "고무고무노~!!!!!!!");
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다.");
		} else if (hitNumber > 2) {
			hp = hp - (2 * attackPower);
			System.out.println(this.name + "윙크 공격>_ㅇ");
			System.out.println(this.name + "이(가) " + (2 * attackPower) + "의 피해를 입었습니다.");
		}else {  
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
