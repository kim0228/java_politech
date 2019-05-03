import java.util.Scanner;

public class RunningArray {
	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("짱구", 1, 100);
		p[1] = new Person("철수", 1, 100);
		p[2] = new Person("유리", 1, 100);
		System.out.println("3,6,9 게임 시작~~~~~");

		boolean loopEnd = true;

		
		while (loopEnd) {
			for (int i = 0; i < p.length; i++) {
				p[i].count();
				
				//해당 객체의 endgame이 true라면 반복종료
				if (p[i].getEnd()) {
					loopEnd = false;
					break;
				}
			}
		}
		
		System.out.println("게임이 끝났습니다~~~");

	}
}
