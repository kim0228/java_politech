import java.util.Scanner;

public class Runclass {
	public static void main(String [] args) {
		MoneyBox moneyBox = new MoneyBox();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 99999; i++) {
			System.out.print("메뉴 선택 1.입금, 2.입금+메세지, 3.종료 : ");
			int selectMenu = scanner.nextInt();
			if (selectMenu == 1) {
				System.out.print("입금할 금액 : ");
				int coin = scanner.nextInt();
				moneyBox.deposit(coin, "");
			} else if (selectMenu == 2) {
				System.out.print("입금할 금액 : ");
				int coin = scanner.nextInt();
				scanner.nextLine();
				String message = scanner.nextLine();
				moneyBox.deposit(coin, message);
			} else if (selectMenu == 3) {
				moneyBox.crash();
				break;
			}
		}
	}
}
