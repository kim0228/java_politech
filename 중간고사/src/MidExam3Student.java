

public class MidExam3Student implements Comparable<MidExam3Student>{
	String name;
	int midKor;
	int midEng;
	int midMath;
	int finalKor;
	int finalEng;
	int finalMath;
	int midTotal;
	int finalTotal;
		
	public String print() {
		return this.name + " 중간고사 총점 : " + this.midTotal + "(국어 " + this.midKor + ", 영어 " + this.midEng + ", 수학 " + this.midMath + ")" +"    "+  this.name + 
				"기말고사 총점 : " + this.finalTotal + "(국어 " + this.finalKor + ", 영어 " + this.finalEng + ", 수학 " + this.finalMath + ")";
		
	}
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.midTotal); 
		
		return tmp;
}
	
		
	@Override
	public int compareTo(MidExam3Student o) {  // 총점을 비교해서 음수와 양수, 0을 추가한다.
		if (this.midTotal > o.midTotal) {  //좌측값이 클 때 1값을 반환(내가 클때는 앞으로 보내라.)
			return -1;
		} else if (this.midTotal < o.midTotal) { 	// 우측값이 클 때 0값을 반환(내가 작을 때는 뒤로 보내라)
			return 1;
		}
		return 0;
	}
	
}
