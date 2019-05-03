import java.util.Random;

public class MidExam3Random extends Random{
	public void randomStudent(MidExam3Student score) { // random클래스에서 상속을 받고있기때문에 nextInt를 쓸 수 있다. target은 변수명이다. 
		score.midKor = this.nextInt(101);							// 이거는 메소드를 새로 만든것이다.(부모클래스에서 상속받은 메소드가 아님.)
		score.midEng = this.nextInt(101);
		score.midMath = this.nextInt(101);
		score.midTotal = score.midKor + score.midEng + score.midMath;
		score.finalKor = this.nextInt(101);							
		score.finalEng = this.nextInt(101);
		score.finalMath = this.nextInt(101);
		score.finalTotal = score.finalKor + score.finalEng + score.finalMath;
}
}
