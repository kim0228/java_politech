import java.util.Arrays;
import java.util.Random;

public class MidExam3MainClass {
	public static void main(String[] args) {
		MidExam3Student[] student = new MidExam3Student[100];
		
		for(int i = 0;i<student.length;i++) {
			student[i] = new MidExam3Student();
		}
		MidExam3Random r = new MidExam3Random();
		for(int i = 0;i<student.length;i++) {
			r.randomStudent(student[i]);
		}
		for (int i = 0; i < student.length; i++) {
			student[i].midTotal = student[i].midKor + student[i].midEng + student[i].midMath;
			student[i].finalTotal = student[i].finalKor + student[i].finalEng + student[i].finalMath;
		
		}
		Arrays.sort(student);
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());			
		}
	}
}
