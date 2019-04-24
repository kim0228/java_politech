
public class Student implements Comparable<Student>{ // implements를 써줘서 인터페이스를 추가시켜준다. Comparable는 비교를 하기 위한 규칙이다.
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	
	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total);  // 문자는 첫글자부터 비교를 하기 때문에 0을 표시해줘야 크기 비교가 가능하다.

		return tmp;
	}
	@Override
	public int compareTo(Student o) {  // 총점을 비교해서 음수와 양수, 0을 추가한다.
		if (this.total > o.total) {  //좌측값이 클 때 1값을 반환(내가 클때는 앞으로 보내라.)
			return -1;
		} else if (this.total < o.total) { 	// 우측값이 클 때 0값을 반환(내가 작을 때는 뒤로 보내라)
			return 1;
		}
		return 0;
	}
}
