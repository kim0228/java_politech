import java.util.Scanner;

public class RunClass2 { // RunClass라는 클래스를 생성한다.
	public static void main(String[] args) {
		Student2[] sArray = new Student2[10]; // 10명 학생의 배열 객체를 생성한다.
		
		Scanner scan = new Scanner(System.in); // 값을 입력받기 위한 scan 객체를 생성한다.
		
		for (int i = 0; i < sArray.length; i++) { // 국어, 영어, 수학 점수를 10번 반복하여 출력하게 한다.
			
			sArray[i] = new Student2(); // 클래스 역할을 하는 객체를 sArray[i]로 선언한다.
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력"); // 
			System.out.print("이름 : ");
			
			sArray[i].name = scan.nextLine(); // scan객체에 문자열 name 변수를 입력받는다.
			
			System.out.println("국어점수 : "); // "100" => 100
			
			String korString = scan.nextLine(); //  scan객체에 입력받은 값을 korString이라는 문자열 변수에 대입한다.
			
			sArray[i].korScore = Integer.parseInt(korString); // korString변수에 적힌 점수를 int형으로 변환한다.
			
			System.out.println("영어점수 : ");
			String engString = scan.nextLine(); // scan객체에 입력받은 값을 engString이라는 문자열 변수에 대입한다.
			
			sArray[i].engScore = Integer.parseInt(engString); // engString변수에 적힌 영어점수를 int형으로 변환한다.
			
			System.out.println("수학점수 : ");
			String mathString = scan.nextLine();// scan객체에 입력받은 값을 mathString이라는 문자열 변수에 대입한다.
			
			sArray[i].mathScore = Integer.parseInt(mathString); // mathString변수에 적힌 수학점수를 int형으로 변환한다.
			
		
//		Student s1;
//		Student[] sArray = new Student[10];
//		
//		s1 = new Student();
//		sArray[0] = new Student();
//		
//		s1.korScore = 10;
//		sArray[0].korScore = 10;
		}
	}
}
