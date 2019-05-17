
public class RunClass {
	public static void main(String[] args) {
		final int GAME_START_NUMBER = 1;
		final int GAME_END_NUMBER = 50;
		//player 생성
		String[] names = {"짱구", "영희", "철수"};
		Person[] players = new Person[names.length]; //여기서 각각의 객체를 생성(new라는 키워드를 만났을때), Person클래스에서 만든 players의 주소를 여기에 넘겨주는것
		for (int i = 0; i < names.length; i++) {
			players[i] = new Person(names[i]); //여기서도 new Person을 함으로써 Person클래스에 있는 곳에 찾아가서 값을 가져옴
		}
		for (int i = 0; i < players.length; i++) { //이전사람이 말하는것에 +1씩 한다는 개념만 있는 식임.
			players[i].readyGame(players, i, GAME_START_NUMBER, GAME_END_NUMBER); //readyGame에서 필요로 하는것은 참여자, 내 순서
			//각각의 player는 본인 position변수에 번호를 저장해야함
	}
		players[1].gameStart();
}
}