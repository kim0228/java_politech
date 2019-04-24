
public class Test2 extends Test{
	public void printResult() {
		super.printResult();  // --->super는 부모클래스가 가지고 있던 기능을 먼저 수행해라라는 의미이다.
		System.out.println("더하기 결과 : " + (this.number1 + this.number2));
		System.out.println("빼기 결과 : " + (this.number1 - this.number2));
		System.out.println("곱하기 결과 : " + (this.number1 * this.number2));
		System.out.println("나누기 결과 : " + ((double)this.number1 / this.number2));
	}
	public void newMethod() {
			
	}
}
