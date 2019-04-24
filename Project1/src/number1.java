import java.util.Scanner;
public class number1 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요");
		
		Scanner d = new Scanner(System.in);
		int 처음숫자 = d.nextInt();
		
		int sumNumber = 처음숫자+10;
		
//		System.out.print("입력받은 숫자 +10은 ");
//		System.out.print(sumNumber);
//		System.out.print("입니다.");
		System.out.printf("입력하신 숫자 +10은 %d입니다", sumNumber);
		
	}
}
