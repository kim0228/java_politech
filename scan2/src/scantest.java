import java.util.Scanner;

public class scantest {
	public static void main(String[] args) {
		System.out.println("ȭ�鿡 ���ڸ� �Է�");
		Scanner d = new Scanner(System.in);
		int number1 = d.nextInt();
		System.out.print("�Է��� ���ڴ� ");
		System.out.print(number1);
		System.out.println();
		
		System.out.print("�ٸ� ���ڸ� �Է��� �ּ���");
		int number2 = d.nextInt();
		System.out.print("�Է��� ���ڴ� ");
		System.out.print(number2);
		System.out.println();
		
		System.out.println("���ڸ� �����ֽʽÿ�");
		System.out.println(number1+number2);

	}

}
