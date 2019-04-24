import java.util.Scanner;

public class Student { // Student 클래스를 생성한다.
	String name;
	int midScore;    // name은 문자열로 midScore은 int형으로 finalScore는 int형으로 선언한다. 
	int finalScore;
	
	public void inputData() { // 반환되지 않는 inputData 메소드를 만든다. 
		Scanner scan = new Scanner(System.in);
		String tmp;
		System.out.println("중간고사 점수 입력"); 
		tmp = scan.nextLine();
		this.midScore = Integer.parseInt(tmp); // 중간고사 점수는 문자열로 정해져있는 tmp를 int형으로 바꿔준다.
		System.out.println("기말고사 점수 입력");
		tmp = scan.nextLine();
		this.finalScore = Integer.parseInt(tmp);// 기말고사 점수는 문자열로 정해져있는 tmp를 int형으로 바꿔준다.
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.midScore;

//	public void examScore() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름 입력 : ");
//		this.name = scanner.nextLine();
//		
//		System.out.print("중간고사점수 입력 : ");
//		String tmp = scanner.nextLine();
//		this.midScore = Integer.parseInt(tmp);
//		
//		System.out.print("기말고사점수 입력 : ");
//		tmp = scanner.nextLine();
//		this.finalScore = Integer.parseInt(tmp);
	}
	
}

