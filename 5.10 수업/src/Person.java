
public class Person {  // 원래는 0으로 초기화를 한다고 명시를 해야하지만 자바는 알아서 0으로 초기화시켜준다.
	String name;
	Person[] players;		// 여기로 메인에서 생성한 배열의 주소값을 보내준다. 
	int position;
	int startNumber;
	int endNumber;
	int sayNumber; 		//내가 말할 숫자
	Person(String name){			// 생성자
		this.name = name;
	}
	public void readyGame(Person[] players, int position, int startNumber, int endNumber){
		this.players = players;
		this.position = position;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	public void sayNumber() {
		int prevPosition = this.position - 1;
		if (prevPosition < 0) {
			prevPosition = this.players.length - 1;		// 뒤의 수식이 복잡하면 이걸로 하자
		}
		if (this.sayNumber == 0) {
			this.sayNumber = this.startNumber;
		}else {
			this.sayNumber = this.players[prevPosition].sayNumber + 1;
		}
//		this.sayNumber = this.players[(this.position + (this.players.length - 1)) % this.players.length].sayNumber+1; 	// 나머지연산은 앞으로 fix를 시켜줘야 하기 때문에
//		System.out.println(this.name + " say "+ this.sayNumber);
		this.sayNumber  = this.players[prevPosition].sayNumber + 1;
		System.out.println(this.name + " say "+ this.sayNumber);
		int nextPosition = (this.position + 1) % this.players.length;
		if (this.sayNumber < this.endNumber) {
			this.players[nextPosition].sayNumber();
		}
	}
	public void gameStart() {
		this.sayNumber = -1;
		this.sayNumber();
	}
}
