
public class Person {
	String name;
	Person[] players; //변수만드는게 본인이 알고 있는다는 뜻? 여기서는 각각의 객체를 생성하는것이 아님
	int position = 0; //player가 몇번째인지 포지션
	int startNumber = 0;
	int endNumber = 0;
	int sayNumber = 0;
	int count = 0;
	Person(String name) { //생성자 생성
		this.name = name;
	}
	public void readyGame(Person[] players, int position, int startNumber, int endNumber) {
		this.players = players;
		this.position = position;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	public void sayNumber() {
		//sayNumber를 할 때 본인 순서보다 앞에있는지 뒤에있는지 하여 앞에있는사람에서 +1해야 함
		//앞에있는 사람은 아까 잡아놨던 position으로 판단
//		this.sayNumber = this.players[this.position + (this.players.length - 1) % this.players.length].sayNumber + 1; 
		int prevPosition = this.position - 1;
		if(prevPosition < 0) {
			prevPosition = this.players.length - 1;
		}
		if(this.sayNumber == -1) { 
			this.sayNumber = this.startNumber;
		} else {
			this.sayNumber = this.players[prevPosition].sayNumber + 1;
		}
		String temp = String.valueOf(sayNumber);
		count = 0;
		String clap = "짝";
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == '3' || temp.charAt(i) == '6' || temp.charAt(i) == '9') {
				count ++;				
			}
	}
		if(count == 0) {
			System.out.println(this.name + " say " + temp);
		} else if(count == 1) {
			System.out.println(this.name + " say " + clap);
		} else {
			clap += clap;
			System.out.println(this.name + "say" +clap);
		}
		int nextPosition = (this.position + 1) % this.players.length;
		if(this.sayNumber < this.endNumber) {
			this.players[nextPosition].sayNumber(); //종료조건만들어줌
		}
	}

	
	public void gameStart() {
		this.sayNumber = -1; //sayNumber가 -1인 사람이 시작하는 사람(시작 player를 명시하기 위해서)
		this.sayNumber();

	}

}