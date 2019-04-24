import java.util.Scanner;

public class 데이터입력받기 {
	public double weight;
	public int height;
	
	public void process() {
		this.inputData();
		this.result();
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("체중 입력 (단위 kg) : ");
		double weight = scanner.nextDouble();
	
//		System.out.println("체중 입력 (단위 g) : ");
//		int weight = scanner.nextInt();
//		double weightKg = (double)weight / 1000;
	
		System.out.println("신장 입력 (단위 m) : ");
		this.height = scanner.nextInt();
	}
	
	public void result() {
		double calcResult  = (double)this.weight / this.height * this.height;
		//System.out.println("계산 결과 :" + calcResult);
		if (calcResult >= 30) {
			System.out.println("비만입니다.");
		} else if (calcResult >= 24) {
			System.out.println("과체중입니다.");
		} else if (calcResult >= 20) {
			System.out.println("정상입니다.");
		} else if (calcResult >= 15) {
			System.out.println("저체중입니다.");
		} else if (calcResult >= 13) {
			System.out.println("여윔");
		} else if (calcResult >= 10) {
			System.out.println("영양실조");
		} else  {
			System.out.println("소모증");
			
		}
	}
}	
