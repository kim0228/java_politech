import java.util.Scanner;

public class kim {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해 주세요");
		Scanner s =new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.print(inputNumber);
		System.out.println();
		
		System.out.println("또 숫자를 입력해 주세요");
		int number2 = s.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.print(number2);
		System.out.println();
		
		System.out.println("숫자를 더해주세요");
		System.out.println(inputNumber+number2);
		
	}
}