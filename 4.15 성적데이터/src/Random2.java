import java.util.Random;

public class Random2 extends Random{
	public void randomStudent(Student target) { // random클래스에서 상속을 받고있기때문에 nextInt를 쓸 수 있다. target은 변수명이다. 
		target.kor = this.nextInt(101);							// 이거는 메소드를 새로 만든것이다.(부모클래스에서 상속받은 메소드가 아님.)
		target.eng = this.nextInt(101);
		target.math = this.nextInt(101);
		target.total = target.kor + target.eng + target.math;
	}
		
	}


