
public class MidExam3Student1 implements Comparable<MidExam3Student1>{
	String name;
	int finalKor;
	int finalEng;
	int finalMath;
	int finalTotal;
		
	public String print() {
		return this.name + "기말고사 총점 : " + this.finalTotal + "(국어 " + this.finalKor + ", 영어 " + this.finalEng + ", 수학 " + this.finalMath + ")";
		
	}
	@Override
	public String toString() {
		String tmp1 = String.format("%03d", this.finalTotal); 
		
		return tmp1;
}
	
		
	@Override
	public int compareTo(MidExam3Student1 o) {  // 총점을 비교해서 음수와 양수, 0을 추가한다.
		if (this.finalTotal > o.finalTotal) {  //좌측값이 클 때 1값을 반환(내가 클때는 앞으로 보내라.)
			return -1;
		} else if (this.finalTotal < o.finalTotal) { 	// 우측값이 클 때 0값을 반환(내가 작을 때는 뒤로 보내라)
			return 1;
		}
		return 0;
	}
	
}