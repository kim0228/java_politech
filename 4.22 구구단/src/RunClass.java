import java.io.IOException;

public class RunClass {
	public static void main(String[] args) {
		GuGuDan gugudan = new GuGuDan();
		// gugudan.inputDan();
		try {
			gugudan.inputDan();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 파일 불러올 때
		java.io.File file= new java.io.File("c:\\file.txt");
		try {
			file.getCanonicalFile();
		} catch ( IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}






//try {
//	gugudan.inputDan();
//} catch (Exception e) {
//	System.out.println("inputDan에서 오류 발생");
//}







