import java.util.Random;

public class Player3 extends Player {
	Player3() {
		this.hp = 1;
		this.name = "동지형성";
		System.out.println(" 숫가락살인마 " + this.name + "출현");
	}
	public int getAttackPower() {
		return 10;
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(2);
		if (hitNumber == 1) {
			hp = hp + attackPower;
			System.out.println("낄낄ㅋ ㅋ " + attackPower + "의 데미지를 흡수했습니다. 현재 체력은^^~? " + hp + "이라능^-^");
		} else {
			System.out.println("그치만...뀨^^ㅗ");
		}
	}
}
