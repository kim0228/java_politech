import java.util.Scanner;

public class 홀수짝수의합 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][]  = new int[4][4];	//		int[i][j] = s.nextInt();  이중배열을 선언하였다.
		System.out.println("배열에 숫자를 입력하십시오.");
		for (int i = 0;i<arr[i].length-1; i++) {
			for(int j = 0;j<arr[j].length-1;j++) {
				arr[i][j] = s.nextInt();	//scanner객체를 통해서 배열안에 있을 숫자를 입력받는다.
				arr[i][3] += arr[i][j]; 
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j]; //	arr[3][3] = arr[0][3] + arr[1][3] + arr[2][3];	 arr[3][3] += arr[i][3];
			}
		}

		 for(int i=0;i<4;i++) {
			  for(int j=0;j<4;j++) {
			    System.out.print(arr[i][j] + "   ");
			   }
			   System.out.println(" ");
		 }
	}
}














// 홀수짝수의합 if문
//int total = 0;
//int oddScore = 0;
//int evenScore = 0;
//
//for(int i = 1; i<=100;i++) {
//	total += i;
//	if (i % 2 == 0) {
//		oddScore = oddScore + i;   oddScore += i이랑 똑같은 의미이다.;
//	} else {
//		evenScore = evenScore + i;	evenScore += i이랑 똑같은 의미이다.;
//	}
//}
//System.out.println("1부터 100까지의 합은:" + total + "입니다.");
//System.out.println("홀수의 합은: " + evenScore + "입니다.");
//System.out.println("짝수의 합은: " + oddScore + "입니다.");

// evenScore = total - oddScore로 해서 else부분을 안 쓸 수도 있다.
