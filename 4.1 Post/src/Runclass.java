import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Runclass {
	public static void main(String[] args) {
		Post post = new Post();
		post.insertPost();
		
		System.out.println("" + post.title + ", " + post.description + ", " + post.createDate);
	}
}
