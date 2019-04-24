import java.util.Scanner;

public class SumNumber {
	public void doSum() {
		int number1 = 0;
		int number2 = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자: ");
		number1 = scan.nextInt();
		
		System.out.println("숫자: ");
		number2 = scan.nextInt();
		
		Sum2 sum2 = new Sum2();	// Sum2클래스에서 객체를 만든다.
		int result = sum2.sumNumbers(number1, number2);	// Sum2 클래스에 있는 메소드 sumNumbers를 불러서 값 number1,number2를 입력하여 결과값을 result변수에 대입한다.
		System.out.println("두개의 숫자의 합은 " + result + "입니다.");
	}

	public void hello() {
		System.out.println("Hello Java");
	}
}
