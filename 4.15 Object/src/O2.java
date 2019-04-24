
public class O2 { // extends Object가 생략되어있다.
	int name = 1;
	O2(){				//생성자
		System.out.println("123123");
	}
	@Override
	public String toString() {		// 
		// TODO Auto-generated method stub
		return "" + this.name;
	}
	@Override
	public boolean equals(Object obj) {//a
		O2 obj2 = (O2)obj;		
		if (this.name == obj2.name) {
				return true;
		}
		return false;
 }	
//		public boolean equals(O2 obj) {// b			 // 이 메소드는 자식클래스에서 새로운 메소드가 정의된 것이다.
//		//	O2 obj2 = (O2)obj;		
//			if (this.name == obj.name) {
//					return true;
//			
//			}
//			return false;
//	}
	
}
