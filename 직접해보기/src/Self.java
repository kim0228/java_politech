import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Self {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random d = new Random();
		}
}		
		








//	배열을 생성해서 임의의 수 뽑아내기(다른 사람꺼 보고 참조함)
//int setValue = 30;
//int [] randomNum = new int[setValue];
//// 정렬 전
//for (int i = 0;i<setValue; i++) {
//	randomNum[i] = d.nextInt(100);
//	System.out.println(randomNum[i] + "");
//}
//System.out.println();
//// 정렬 후
//Arrays.sort(randomNum);
//for (int i = 0;i<setValue;i++) {
//	System.out.println(randomNum[i] + "");
//}















//		컴퓨터랑 주사위 대결하기
//		int userdice = 0;
//		int comdice = 0;
//		for (int i = 0; i < 10; i++) {
//			System.out.println("컴퓨터의 주사위를 굴릴까요? (종료하실려면 q를 입력하세요)");
//			String inputString = s.nextLine();
//			if (inputString.equalsIgnoreCase("q")) {
//				System.out.println("게임이 종료되었습니다.");
//				break;
//			}
//			comdice = d.nextInt(6)+1;
//			System.out.println("컴퓨터의 주사위는" + comdice  + "입니다.");
//		
//			System.out.println("사용자의 주사위를 굴릴까요?");
//			s.nextLine();
//			
//			userdice = d.nextInt(6)+1;
//			System.out.println("유저의 주사위는" + userdice + "입니다.");
//			
//			if (userdice > comdice) {
//				System.out.println("유저가 이겼습니다.");
//			}else if(userdice == comdice){
//				System.out.println("비겼습니다.");
//			} else if (userdice < comdice){
//				System.out.println("컴퓨터가 이겼습니다.");
//		}
//	}
















// 1부터 100까지 중에 홀수, 짝수의 합 구하기
//int num = 0;
//int total= 0;
//int oddScore = 0;
//int evenScore = 0;
//for(int i = 1; i<=100; i++) {
//	num = i ;
//	total += i;
//	if (i % 2 == 0) {
//		oddScore = total - evenScore;
//	}else {
//		evenScore = total - oddScore;
//	}
//}
//System.out.println("1부터 100까지의 합은: " + total);
//System.out.println("짝수의 합은: " + oddScore);
//System.out.println("홀수의 합은: " + evenScore);











//		주사위 굴려서 원하는 문자 나오게하기		
//Random r = new Random();
//int numdice = r.nextInt(6) +1;
//System.out.println("지금부터 주사위 굴리기를 시작하겠습니다.");
//		if (numdice == 1) {
//			System.out.println("멍멍");
//		}else if (numdice == 2){
//			System.out.println("야옹");
//		}else if (numdice == 3){
//			System.out.println("3");
//		}else if (numdice == 4){
//			System.out.println("4");
//		}else if (numdice == 5){
//			System.out.println("5");
//		}else if (numdice == 6){
//			System.out.println("6");
//		}






//		switch형으로 하기
//		switch (numdice) {
//		case 1:
//			System.out.println("멍멍");
//			break;
//		case 2:
//			System.out.println("야옹");
//			break;
//		case 3:
//			System.out.println("3");
//			break;
//		case 4:
//			System.out.println("4");
//			break;
//		case 5:
//			System.out.println("5");
//			break;
//		default:
//			System.out.println("6");
			
	






// 임의의 값을 홀수,짝수로 판단하기
//	Random r = new Random();
//	int randomValue = r.nextInt(100);
//	System.out.println("임의의 값은:" + randomValue);
//	System.out.println("나머지 값은" + randomValue % 2);
//	if (randomValue % 2 == 0) {
//	System.out.println("짝수입니다.");
//	}else {
//	System.out.println("홀수입니다.");
//	}






// 		화면에 숫자 입력받기
//		int a = 0;
//		Scanner s = new Scanner(System.in);
//		System.out.println("화면에 숫자를 입력해주세요.");
//		a = s.nextInt();
//		System.out.println("당신이 입력한 숫자는:" + a);








//		1부터 100까지의 합
//		int num = 0;
//		int sum = 0;
//		for(int i = 0; i <=100; i++) {
//			num = i + 1;
//			sum += i;
//		}
//		System.out.println("1부터 100까지의 합은:" + sum);
//	}