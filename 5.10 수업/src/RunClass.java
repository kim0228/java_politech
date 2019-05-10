
public class RunClass {
	public static void main(String[] args) {
		final int GAME_START_NUMBER = 10;		// 여기는 설정부분
		final int GAME_END_NUMBER = 50;
		String[] names = {"짱구","영희","철수","길동"};
		Person[] players = new Person[names.length]; 	// 배열 요소 객체 생성(생성은 메인에서 한 거임)
		for (int i = 0; i < names.length; i++) {
			players[i] = new Person(names[i]);
		}
		for (int i = 0; i < players.length; i++) {
			players[i].readyGame(players, i, GAME_START_NUMBER, GAME_END_NUMBER);	// 가로 안에 있는 인자들 순서대로 (참여자들, 순서, 게임시작숫자,  끝나는숫자) // players(배열)의 주소를 불러온다.(call by reference)
		}
		players[0].gameStart();
	}
}
