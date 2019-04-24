import java.util.Scanner;

public class GuGuDan{
	private int dan;
	public void inputDan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.");
		try {
			String inputText = scan.nextLine();
			this.dan = Integer.parseInt(inputText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.printResult();
	}
	private void printResult() {
		for (int i = 0; i < 9; i++) {
			int number = i + 1;
			System.out.println(this.dan + " X " + number + " = " + (this.dan * number));
		}
	}
}
