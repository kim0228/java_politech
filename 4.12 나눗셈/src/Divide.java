import java.util.Scanner;

public class Divide {
		int num1 = 0;
		int num2 = 0;

		public  void inputNumbers(){
			Scanner scan = new Scanner(System.in);
			String tmp;
			System.out.println("지금부터 두개의 숫자를 입력해주세요.");
			
			System.out.println("첫번째 숫자를 입력해주세요.");
			tmp = scan.nextLine();
			try {
			this.num1 = Integer.parseInt(tmp);
			} catch (Exception e) {
			this.num1 = 0;
			}
			
			System.out.println("두번째 숫자를 입력해주세요.");
			tmp = scan.nextLine();
			try {
				this.num2 = Integer.parseInt(tmp);
			} catch (Exception e) {
				this.num2 = 0;
			}
			
			
		}
		public void printResult(){
					double resultNumber = 0;
					resultNumber = (double)this.num1/this.num2;
					resultNumber = resultNumber * 100;
					resultNumber = Math.round(resultNumber * 100)/100;
					
			System.out.println("" + this.num1 + "나누기" + this.num2 + " = " + resultNumber + "입니다.");
			
// 			내가 입력한거			
//			System.out.println("입력된 숫자는:" + this.num1 + ", " + this.num2 + "입니다.");
//			System.out.println("나눗셈 결과는:" + (double)this.num1 / this.num2 + "입니다.");
		}
}
