
public class MidExam1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i<=1000;i++) {
			if(i%5 == 0) {
				sum += i;		//sum = sum + i;
			}
		}
		System.out.println("1부터 1000까지의 숫자 중에서 5의 배수의 합은: " + sum);
	}
}
