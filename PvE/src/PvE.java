import java.util.Scanner;

public class PvE {
	public static void main(String[] args) {
		Player[] player = new Player[6];
		player[0] = new Player1();
		player[1] = new Player2();
		player[2] = new Player3();
		player[3] = new Player4();
		player[4] = new Player5();
		player[5] = new Player6();

		Enemy[] enemy = new Enemy[6];
		enemy[0] = new Enemy1();
		enemy[1] = new Enemy2();
		enemy[2] = new Enemy3();
		enemy[3] = new Enemy4();
		enemy[4] = new Enemy5();
		enemy[5] = new Enemy6();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n게임 시작\n\n턴 진행 시 엔터 입력");
		for(int turn = 0; turn < 10; turn++) {
			System.out.println("\n\n엔터를 입력해주세요.");
			scanner.nextLine();
			System.out.println("\n\n플레이어 턴");
			for(int i = 0; i < player.length; i++) {
				if (player[i].status()) {
					int attackPower = player[i].getAttackPower();
					for(int j = 0; j < enemy.length; j++) {
						if (enemy[j].status()) {
							enemy[j].beUnderAttak(attackPower);
							try {
								Thread.sleep(300);
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
					}
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
			System.out.println("\n\n에너미 턴");
			for(int i = 0; i < enemy.length; i++) {
				if (enemy[i].status()) {
					int attackPower = enemy[i].getAttackPower();
					for(int j = 0; j < player.length; j++) {
						if (player[j].status()) {
							player[j].beUnderAttak(attackPower);
							try {
								Thread.sleep(300);
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
					}
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}
		System.out.println("\n\n결과 출력");
		int playerCount = 0;
		for(int i = 0; i < player.length; i++) {
			if(player[i].status()) {
				playerCount++;
				System.out.println(player[i].name + "은(는) 살아있습니다. hp " + player[i].hp);
			} else {
				System.out.println(player[i].name + "은(는) 죽었습니다.");
			}
		}
		System.out.println("플레이어 생존 수 : " + playerCount + "\n");
		int enemyCount = 0;
		for(int i = 0; i < enemy.length; i++) {
			if(enemy[i].status()) {
				enemyCount++;
				System.out.println(enemy[i].name + "은(는) 살아있습니다. hp " + enemy[i].hp);
			} else {
				System.out.println(enemy[i].name + "은(는) 죽었습니다.");
			}
		}
		System.out.println("에너미 생존 수 : " + enemyCount + "\n");
	}
}
