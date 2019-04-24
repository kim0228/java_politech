import java.util.Arrays;

public class RunClass {
	public static void main(String[] args) {
		Random3 rand = new Random3();
		rand.nextInt2(100);
		System.out.println(Arrays.toString(rand.resultArr));
		double n2 = rand.nextDouble();
	}
}
