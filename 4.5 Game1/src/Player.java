import java.util.Random;

public class Player {
	String name = "";      // 플레이어의 name을 입력받기위해 String변수 name을 선언한다. 
	int hp = 0;                   //플레이어의 체력을 int형 0으로 선언한다.

	Player(String name, int hp) {   //생성자
		this.hp = hp;    
		this.name = name;
	}

	public boolean status() {
		if (hp > 0) {
			return true;     // 플레이어의 hp가 0이상이면 true값을 반환하고, 아니면 false값을 반환한다.
		}
		return false;
	}

	public int getAttackPower() { // 적에게 공격을 하면 적에게 10의 값을 돌려준다.
		return 10;
	}

	public void beUnderAttack(int attackPower) {
		Random random = new Random();           //랜덤객체 생성
		int hitNumber = random.nextInt(10);     // hitNumber를 0부터 9까지 랜덤으로 나오게 한다.
		if (hitNumber == 1) {         // hitNumber가 1이라면
			hp = hp - attackPower;   //  hp가 attackPower에 깍이면서
			System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");   // 이 메시지를 출력하고, 
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");    	// 회피한다면 이 메시지를 출력한다.
		} 
	}
}
