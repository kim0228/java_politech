import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [][] arr = new int[4][4];	//		int[i][j] = s.nextInt();  이중배열을 선언하였다.
		int sum = 0;
		System.out.println("배열에 숫자를 입력하십시오.");
		for (int i = 0;i<arr[i].length; i++) {
			for(int j = 0;j<arr[j].length;j++) {
				arr[i][j] = s.nextInt();
				
				
			}
		}
	}
}
