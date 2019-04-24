import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;
	
	Enemy(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public int getAttackPower() { // 플레이어에게 공격을 하면 플레이어에게 10의 값을 돌려준다. 
		return 10;
	}	
	public void beUnderAttack(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {        // hitNumber가 3이라면
			hp = hp - attackPower;      // hp가 attackPower에 깍이면서
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다."); // 이 메시지를 출력한다. 
		} else {
			System.out.println(this.name + "이(가) 회피했습니다."); // 회피한다면 이 메시지를 출력한다.
		}
	}
}
