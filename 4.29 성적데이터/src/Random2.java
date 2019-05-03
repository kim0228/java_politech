import java.util.Random;

public class Random2 extends Random{
	public void randomStudent(Student target) {  
		target.midTotal = this.nextInt(1000);							
		target.finalTotal = this.nextInt(1000);	
	}
}
