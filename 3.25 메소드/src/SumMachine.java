
public class SumMachine {
	public void makeSum(int startValue, int endValue) {	// 매개변수 startValue와 endValue를 만들었다.
		int start = startValue;
		int end = endValue;
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			sum = sum + i;		// sum += i;이랑 똑같은 의미이다.
		}//end for
		
		
		System.out.println("시작값: " + start);
		System.out.println("종료값: " + end);
		System.out.println("총 합: " + sum);
	}
	
	public static void main (String[] args) {
		SumMachine m = new SumMachine();		// 클래스 SumMachin의 객체를 생성함
		m.makeSum(1, 100);			// startValue:1   endValue:100의 값을 makesum 메소드에 대입하여 실행시킨다.
		m.makeSum(101,200);
		m.makeSum(201,300);
	}
}
