import java.util.Scanner;

public class test40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int totalScore = 0;
		int jakScore = 0;
		int holScore = 0;
		
		for (int i = 0; i <= 100; i++) {
			totalScore += i;
		if (i%2 == 0){
			jakScore += i; 				//  totalScore = totalScore + i랑 똑같은 의미이다.
	 	 } else {
	 		 holScore += i;
	 	 }
	}
		System.out.println("1부터 100까지의 합은: " + totalScore + "입니다.");
		System.out.println("짝수의 총합은: " + jakScore + "입니다.");
		System.out.println("홀수의 총합은: " + holScore + "입니다.");
		}
	}