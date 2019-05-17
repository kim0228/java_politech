import java.util.Random;

public class Horse {
	String name = "";
	int distance = 0;
	Horse(String name) {
		this.name = name;
		this.distance = distance;
	}
	boolean isEnd = false;
	int myRank;
	static int rankCount = 0;
	public boolean status() {
		if (distance > 10) {
			if (isEnd == false) {
				rankCount++;
				this.myRank = rankCount;
				System.out.println(this.name + "완주" + rankCount);
				isEnd = true;
			}
			return false;
		}
		return true;
	}
	
	public void run() {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 1) {
			distance = distance + 1;
			System.out.println(this.name + "이(가) 1만큼 갔습니다. 현재 : " + distance);
		}else if(hitNumber == 2){
			distance = distance + 2;
			System.out.println(this.name + "이(가) 2만큼 갔습니다. 현재 : " + distance);
		}else if(hitNumber == 3){
			distance = distance + 3;
			System.out.println(this.name + "이(가) 3만큼 갔습니다. 현재 : " + distance);
		}else if(hitNumber == 4){
			distance = distance + 4;
			System.out.println(this.name + "이(가) 4만큼 갔습니다. 현재 : " + distance);
		}else {
			distance = distance + 5;
			System.out.println(this.name + "이(가) 5만큼 갔습니다. 현재 : " + distance);
		}
		
	}
	public String toString() {
		
		return this.name;
	}
}
