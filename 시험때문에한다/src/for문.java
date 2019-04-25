
public class for문 {
	public static void main(String[] args) {
		
		System.out.println("1번째:");
		
		  for (int i = 0; i < 5; i++) { // 총 5줄
		   for (int j = 4; j >= i; j--) { // 별을 5개, 4개, 3개, 2개, 1개 찍음
		    System.out.print("*");
		   }
		   System.out.println(""); // 별 한줄 찍고  엔터
		  }

		  System.out.println("2번째:");
		  
		  for (int i = 0; i < 5; i++) { // 총 5줄
		   for (int j = 4; j > i; j--) { // 공백 4개, 3개, 2개, 1개, 0개 찍음
		    System.out.print(" ");
		   }
		   for (int k = 0; k <= i; k++) { // 별 1개, 2개, 3개, 4개, 5개 찍음
		    System.out.print("*");
		   }
		   System.out.println(""); // 공백+별 찍고 한줄 띄움
		  }
		  
		  System.out.println("3번째:");
		  
		  for (int i = 0; i < 5; i++) { // 총 5줄
		   for (int j = 0; j < i; j++) { // 공백 0개, 1개, 2개, 3개, 4개 찍음
		    System.out.print(" ");
		   }
		   for (int k = 5; k > i; k--) { // 별 5개, 4개, 3개, 2개, 1개 찍음
		    System.out.print("*");
		   }
		   System.out.println(""); // 공백+별 찍고 한줄 띄움
		  } 
	}
}

// 역삼각형 출력
//for(int i = 0;i<4;i++) {
//	for(int j = i;j<4;j++) {
//		System.out.print("*");
//	}
//	System.out.println("");
//}





// 구구단(거꾸로 출력)
//for(int i = 2;i<=9;i++) {
//	for(int j = 9;j>=1;j--) {
//		System.out.println(i + "X" + j  + "=" + i*j);
//	}
//	System.out.println("");
//}





