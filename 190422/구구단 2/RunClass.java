
public class RunClass {
	public static void main(String[] args) {
		GuGuDan gugudan = new GuGuDan();
		try {
			gugudan.inputDan();
		} catch (Exception e) {
			System.out.println("inputDan에서 오류 발생");
		}
	}
}
