import java.util.Random;

public class Student {	
	String name;
	int midTotal;
	int finalTotal;
	
	Student(String name){
		this.name = name;
		Random rand = new Random();
		this.midTotal = rand.nextInt(1001);
		this.finalTotal = rand.nextInt(1001);
	}
	@Override
	public String toString() {
		return this.name + " (중간: " + this.midTotal + ", 기말: " + this.finalTotal + ")";
	}
}
