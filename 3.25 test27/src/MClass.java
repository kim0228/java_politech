public class MClass {
	public static void main(String [] args) {
		Check1 c1 = new Check1();
		System.out.println("7의 배수는");
		for (int i = 0; i < 100; i++) {
			int checkNumber = i + 1;
			boolean result = c1.doCheck(checkNumber);
		if (result) {
			System.out.println("" + (i + 1));
			}
		}
	}
}
