import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy1 {
	public static void main(String[] args) throws Exception{
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Users\\SMART-11\\Desktop\\bird.jpg");
			out = new FileOutputStream("copy.jpg");
			while(true) {
				int data = in.read();
				if(data == -1) {
					break;
				}
				out.write(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (in != null) {
				try { in.close();}catch(Exception e) {}
			}
			if(out != null) {
				try {out.close();}catch(Exception e) {}
			}
		}
	}
}
