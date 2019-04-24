
public class Runclass3 {
	public static void main(String[] args) {
		Student3 s3 = new Student3("임꺽정", 30, 40, 20);
		
		System.out.println("학생 이름은:" + s3.name);
		System.out.println("국어 점수는:" + s3.korScore);
		System.out.println("영어 점수는:"+ s3.engScore);
		System.out.println("수학 점수는:" + s3.mathScore);
		
//		s3.name = "홍길동";
//		s3.korScore = 10;
//		s3.engScore = 20;
//		s3.mathScore = 10;
	}
}
