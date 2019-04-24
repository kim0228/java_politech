import java.util.Random;

public class Random3 extends Random{
	int[] resultArr = new int[10];
	public void nextInt2(int range) {
//		int[] arr = new int[10];
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = super.nextInt(range);
		}
	}
}
