import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [][] arr = new int[4][4];	//		int[i][j] = s.nextInt();  이중배열을 선언하였다.
		System.out.println("배열에 숫자를 입력하십시오.");
		for (int i = 0;i<arr[i].length-1; i++) {
			for(int j = 0;j<arr[j].length-1;j++) {
				arr[i][j] = s.nextInt();
				arr[i][3] += arr[i][j]; 
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
		}
		 for(int i=0;i<4;i++) {
			  for(int j=0;j<4;j++) {
			    System.out.print(arr[i][j] + "   ");
			   }
			   System.out.println("");
		}
	}			
}
	

