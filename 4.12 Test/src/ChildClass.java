import java.util.Scanner;

public class ChildClass extends Figure {
	
	String name ="삼각형의 넓이";
	int height;
	int bottom; 
	@Override
	public void inputValue() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("높이를 입력하세요.");
		this.height = scan.nextInt();
		System.out.println("밑변의 길이를 입력하세요.");
		this.bottom = scan.nextInt();
		
	}
	
	public void result () {
		double width=(double)(((this.bottom * this.height)/2));
		System.out.println(this.name + width);
	}

}
