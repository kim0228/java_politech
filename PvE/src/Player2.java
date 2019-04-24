import java.util.Random;

public class Player2 extends Player {
	int defense = 30;  //방어력을 추가하여 준다.
	Player2() {
		this.hp = 100;
		this.name = "아구몬";
		System.out.println(this.name + " : 태일아~~! 피카추 잡으러가자~~");
	}
	public int getAttackPower() {
		Random r = new Random(1000); 
		int attackPower = r.nextInt(); 
		return attackPower;
		
	}
	public void beUnderAttak(int attackPower, int healingPotion) {
		
		Random random = new Random();
		int hitNumber = random.nextInt(10);

				
		if (hitNumber == 1) {
				if (attackPower - defense < 0) { //방어력을 셈하여 공격값을 계산한다.
					attackPower = 0 - healingPotion;
				}else {
					attackPower = attackPower - defense - healingPotion; // 방어력과 힐링값을 셈하여 공격값을 계산한다.
				}
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower*10000 + "의 데미지를 입었습니다.");
			// 겉보기에는 값을 크게 준다.
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
		
		
		
	}
}
