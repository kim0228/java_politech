
public class Enemy {
	String name = "";
	int hp = 0;
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public int getAttackPower() {
		return 0;
	}
	public void beUnderAttak(int attackPower) {
		
	}
}
