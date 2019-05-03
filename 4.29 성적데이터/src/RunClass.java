import java.util.HashMap;
import java.util.Map;


public class RunClass {
	public static void main(String[] args) {
		String[] names = {"철수","영희","짱구","유리","길동","꺽정","둘리","뽀로로","보고","유신"};
		HashMap<String, Student>map = new HashMap<String, Student>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], new Student(names[i]));
		}
		for (Map.Entry<String, Student> item : map.entrySet()) {	// 여기 있는 item에서는 value값이 들어온다.
			Student one = item.getValue();
			if (one.midTotal < one.finalTotal) {
				System.out.println(one);
			}
		}
	}
		
}




//	 리스트형태를 이용
//		ArrayList<Student> student = new ArrayList<Student>();			// 자료구조의 형태로 봐야 한다.
//		
//		for (int i = 0; i<names.length; i++) {
//			student.add(new Student(names[i]));
//		}
//		Student[] arr = new Student[student.size()];
//		student.toArray(arr);
//		System.out.println(arr[1]);



//		배열활용
//		for (int i = 0; i < names.length; i++) {
//			student.add(new Student(names[i]));
//		}
//		Student[] arr = (Student[]) student.toArray();
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].midTotal < arr[i].finalTotal) {
//				System.out.println(arr[i]);




//	  	for-each문 활용
//		student.forEach(new Consumer<Student>() {
//			@Override
//			public void accept(Student t) {
//				if (t.midTotal < t.finalTotal) {
//					System.out.println(t);
//				}
//			}
//	});





//		List 프레임워크 활용
//		List<Student> list = Arrays.asList(student);
//		for (int i = 0; i < student.length; i++) {
//			if (student[i].midTotal < student[i].finalTotal) {
//			System.out.println(student[i]);
//			}
//		}









//Student[] student = new Student[10];
//
//for (int i = 0; i< student.length; i++) {
//	
//	student[i] = new Student();
//	System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
//}
//Random2 r  = new Random2();
//for (int i = 0; i < student.length; i++) {
//	r.randomStudent(student[i]);
//}
//for (int i = 0; i<student.length; i++) {
//	student[i].midTotal = 