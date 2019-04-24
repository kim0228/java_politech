import java.util.Scanner;

public class PrimeNumber {
	public void docheck() {
		for ( int i = 1; i<=100; i++) {
			if (i % 2 == 1) {
				System.out.println( i + "는 소수입니다.");
			}else if (i == 2) {
				System.out.println(i + "는 소수입니다.");
			}
		}
	}
}
