import java.util.Random;

public class Enemy4 extends Enemy {
	int heal = 20;
	Enemy4() {
		this.name = "monster";
		this.hp = 100;
		System.out.println("야생의 " + this.name + "이 출현했다.");
	}
	public int getAttackPower() {
		return 10;
	}	
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다.");
		}else if(hitNumber <= 5){
			if(hp <= 20  && hp > 10) {
				this.hp = hp+heal; 				
				System.out.println(this.name + "이(가)" + heal+"을 회복합니다." );
			}else { 
				System.out.println(this.name + "이(가) 회피했습니다.");
			}
			
			
		}
		else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
