import java.util.Scanner;

public class kim {
	public static void main(String[] args) {
		System.out.println("ȭ�鿡 ���ڸ� �Է��� �ּ���");
		Scanner s =new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("�Է��� ���ڴ� ");
		System.out.print(inputNumber);
		System.out.println();
		
		System.out.println("�� ���ڸ� �Է��� �ּ���");
		int number2 = s.nextInt();
		System.out.print("�Է��� ���ڴ� ");
		System.out.print(number2);
		System.out.println();
		
		System.out.println("���ڸ� �����ּ���");
		System.out.println(inputNumber+number2);
		
	}
}