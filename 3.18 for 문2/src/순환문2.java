
public class 순환문2 {
	public static void main(String[] args) {
	for (int i = 0; i < 100; i++) {
		System.out.print("a");
		if (i == 98) {
				continue;
		}
		System.out.println(i);
	   }
	}
}