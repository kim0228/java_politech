import java.util.Scanner;

public class MidExam2 {
	public void inputNumber() {
		int num1 = 1;
		int hap = 0;
		int gop = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String numberString = s.nextLine();	
		num1 = Integer.parseInt(numberString);
		for(int i = 1;i<=num1;i++) {
			hap += i;
		}
		for(int i = 1;i<=num1;i++) {
			gop = gop * i ;		// gop = gop*num1*(num1-1);
		}
		System.out.println("입력받은 숫자까지의 합은" + hap);		
		System.out.println("입력받은 숫자까지의 곱은" + gop);
					
				}
		
	public static void main(String[] args) {
		MidExam2 mid = new MidExam2();
		mid.inputNumber();
		
		
	
	}
	
}

	

