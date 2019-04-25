class Car{
	private String color;
	private int speed;
	
	Car(){
	}
	
	Car(String color){
		this.color = color;
	}
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor(){
		return color;
	}
	public int getSpeed() {
		return speed;
	}
}
public class 오버로딩 {
	public static void main(String[] args) {
		Car mycar1 = new Car();
		Car mycar2 = new Car("빨강");
		Car mycar3 = new Car("파랑",30);
		
		System.out.println("자동차1의 색상은 " + mycar1.getColor() + "이며, 현재속도는" + mycar1.getSpeed() + "km입니다.");
		System.out.println("자동차2의 색상은 " + mycar2.getColor() + "이며, 현재속도는" + mycar2.getSpeed() + "km입니다.");
		System.out.println("자동차3의 색상은 " + mycar3.getColor() + "이며, 현재속도는" + mycar3.getSpeed() + "km입니다.");
	}
}
