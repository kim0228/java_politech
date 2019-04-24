import java.util.Random;

public class Enemy2 extends Enemy{
	int healingPotion = 50;
	Enemy2() {
		this.name = "피카츄";
		this.hp = 100;
		System.out.println("내 친구"+ this.name +"이(가) 출현했습니다.");
	}
	public int getAttackPower() {
		return (10 & healingPotion); // 힐링을 해주기 위해 리턴값을 같이 준다.
	}	
	public void beUnderAttak() {
		
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			hp = hp/10;  //공격받을 때마다 hp 1/10 씩 감소 
			System.out.println(this.name + "이(가) " + 9*hp/10*100000 + "의 피해를 입었습니다.");
			// 겉보기에는 값을 크게 준다.
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
