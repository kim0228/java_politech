
public class Runclass {
	public static void main(String[] args) {
		Student[] Array1 = new Student[5];   // 학생 5명의 배열 객체를 생성한다. 
		
		for (int i = 0; i < Array1.length; i++) { // for문을 사용하여 5명 학생의 중간, 기말고사 점수 입력을 반복한다.
			Array1[i] = new Student(); // 클래스 역할을 하는 객체를 Array[i] 이름으로 선언한다.
			Array1[i].inputData();  // inputData메소드를 호출하여 5명의 학생의 중간, 기말고사 점수 입력받음 
		}
		
		int midTotal = 0;    // 중간고사 총점변수 midTotal에 0을 대입한다. 
		int finalTotal = 0;  // 기말고사 총점변수 finalTotal에 0을 대입한다.
		
		for (int i = 0; i < Array1.length; i++) {
			midTotal = midTotal + Array1[i].midScore; // 중간고사 총점은 중간고사 총점에 5명의 중간고사 점수를 계속 더해서 쌓아간다. 
			finalTotal = finalTotal + Array1[i].finalScore; // 기말고사 총점은 기말고사 총점에 5명의 기말고사 점수를 계속 더해서 쌓아간다.
			
		}
		System.out.println("중간고사 총점은 : " + midTotal); // 중간고사 총점 출력
		System.out.println("기말고사 총점은 : " + finalTotal); // 기말고사 총점 출력
		
		
		System.out.println("중간고사 평균은 : " + ((double)midTotal / Array1.length));
		// 중간고사 평균은 중간고사 총점 / Array1에 있는 배열의 길이는 5개이기 때문이다.
		System.out.println("기말고사 평균은 : " + ((double)finalTotal / Array1.length));
		// 기말고사 평균은 기말고사 총점 / Array1에 있는 배열의 길이는 5개이기 때문이다.
	}
}


			// 국어 ,영어, 수학 점수 출력 

//			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
//			System.out.print("이름: ");
//			Array1[i].name = scan.nextLine();
//			
//			System.out.print("국어점수 : "); // "100" => 100
//			String korString = scan.nextLine();
//			Array1[i].korScore = Integer.parseInt(korString);
//			
//			System.out.print("영어점수 : ");
//			String engString = scan.nextLine();
//			Array1[i].engScore = Integer.parseInt(engString);
//			
//			System.out.print("수학점수 : ");
//			String mathString = scan.nextLine();
//			Array1[i].mathScore = Integer.parseInt(mathString);
//			
//			String sumString = scan.nextLine();
//			Array1[i].sumScore = Integer.parseInt(sumString); 
//			System.out.print("총점은 : " + sumScore);