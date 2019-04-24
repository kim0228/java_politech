import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Student4[]arr = new Student4[3];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = new Student4();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.println("이름: ");
			
			arr[i].name = s.nextLine();
			
			System.out.println("국어 점수는: ");
			int kor = s.nextInt();
			arr[i].korScore = kor;
			
			System.out.println("수학 점수는: ");
			int math = s.nextInt();													// 교수님은 문자열에서 정수형으로 변환했지만 난 그냥 바로 정수형으로 점수를 입력받게 하였다.
			arr[i].mathScore = math;
			
			System.out.println("영어 점수는: ");
			int eng = s.nextInt();
			arr[i].engScore = eng;
			
		}
		int midtotal =  0;				// 5명의 중간고사 총점변수를 만들었다.
		for (int i = 0; i<arr.length; i++) {
			midtotal = midtotal  + arr[i].korScore + arr[i].mathScore + arr[i].engScore;
			
		}
		System.out.println("중간고사 총점은:" + midtotal);
	}
}













//  문자열을 정수형으로 변환하여 출력하는 방법
//for (int i = 0; i < sArray.length; i++) { 											국어, 영어, 수학 점수를 10번 반복하여 출력하게 한다.
//			
//			sArray[i] = new Student2(); 													클래스 역할을 하는 객체를 sArray[i]로 선언한다.
//			System.out.println("" + (i + 1) + "번째 학생 데이터 입력"); // 
//			System.out.print("이름 : ");
//			
//			sArray[i].name = scan.nextLine(); 				 scan객체에 문자열 name 변수를 입력받는다.
//			
//			System.out.println("국어점수 : "); 				"100" => 100
//			
//			String korString = scan.nextLine(); 				scan객체에 입력받은 값을 korString이라는 문자열 변수에 대입한다.
//			
//			sArray[i].korScore = Integer.parseInt(korString); 				 korString변수에 적힌 점수를 int형으로 변환한다.
//			
//			System.out.println("영어점수 : ");
//			String engString = scan.nextLine(); 					 scan객체에 입력받은 값을 engString이라는 문자열 변수에 대입한다.
//			
//			sArray[i].engScore = Integer.parseInt(engString); 			engString변수에 적힌 영어점수를 int형으로 변환한다.
//			
//			System.out.println("수학점수 : ");
//			String mathString = scan.nextLine(); 				scan객체에 입력받은 값을 mathString이라는 문자열 변수에 대입한다.
//			
//			sArray[i].mathScore = Integer.parseInt(mathString); 				mathString변수에 적힌 수학점수를 int형으로 변환한다.









