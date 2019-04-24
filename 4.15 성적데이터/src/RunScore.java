import java.util.Random;
import java.util.Arrays;

public class RunScore {
	public static void main(String[] args) {
		
		Student[] student = new Student[10];
		String[] names = {"김동준", "고지인", "이형섭", "박성민", "김경현", "송진우", "정형석", "김예근", "공현", "최성욱"};
		for (int  i = 0; i < student.length; i++) {
			student[i] = new Student();
			student[i].name = names[i];
		}
		Random2 rand = new Random2();
		for (int i = 0; i < student.length; i++) {
			rand.randomStudent(student[i]);
		}
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
//		for (int i = 0; i < student.length; i++) {
//			for (int j = i; j < student.length; j++) {
//				if (student[i].total < student[j].total) {
//					Student tmp = student[i];
//					student[i] = student[j];
//					student[j] = tmp;
//				}
//			}
//		}
		
		Arrays.sort(student);  // 위의 for문을 한 줄로 요약된 것. sort는 외부에 있는 메소드이다. 
		// student[0].compareTo(student[3]);
		Student a = new Student();		// 생성된 객체는 다르지만 객체의 주소값은 같다.
		Student b = a;
		int a1 = 10;		// 두 변수의 값은 같다.
		int b1 = a1;
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
//		System.out.println(Arrays.toString(student));
	}
}

