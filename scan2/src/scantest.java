import java.util.Scanner;

public class scantest {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력");
		Scanner d = new Scanner(System.in);
		int number1 = d.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.print(number1);
		System.out.println();
		
		System.out.print("다른 숫자를 입력해 주세요");
		int number2 = d.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.print(number2);
		System.out.println();
		
		System.out.println("숫자를 더해주십시오");
		System.out.println(number1+number2);

	}

}
