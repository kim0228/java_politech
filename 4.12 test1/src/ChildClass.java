import java.util.Scanner;

public class ChildClass extends Figure {
	
	String name ="사다리꼴의 넓이";
	int height;
	int bottom; 
	int top;
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("높이를 입력하세요.");
		this.height = scan.nextInt();
		System.out.println("아랫변의 길이를 입력하세요.");
		this.bottom = scan.nextInt();
		System.out.println("윗변의 길이를 입력하세요.");
		this.top = scan.nextInt();
		
	}
	
	public void result () {
		double width=(double)(((this.bottom+this.top)*this.height)/2);
		System.out.println(this.name + width);
	}

}
