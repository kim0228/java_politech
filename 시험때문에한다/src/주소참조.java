class myInt{
	int a;
}

public class 주소참조 {
	
	static void func1(myInt m) {
		m.a = m.a + 1;
		System.out.println("전달받은 a: "+ m.a);
	}
	
	public static void main(String[] args) {
		myInt m = new myInt();	// 객체생성
		m.a = 10;
		
		func1(m);	//	
		System.out.println("func1()실행 후의 a: " + m.a);
	}
}
