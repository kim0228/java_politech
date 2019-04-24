import java.util.Random;

public class quiz {
	public static void main(String[] args) {
		Random r = new Random();
		
		int number1 = r.nextInt(100);
		
		System.out.println("임의의 값은: "+ number1);
		// System.out.print("���� ���� : ");
		// System.out.print(number1);
		// System.out.println();
		System.out.println("나머지 값은: " + (number1 % 2));
		
		if (number1 % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}	
	}	
}