
public class Array {
	public static void main(String[] args) {
		int[]sales = new int[5];
		
		sales[0] = 52;
		sales[1] = 50;
		sales[2] = 55;
		sales[3] = 42;
		sales[4] = 38;
		int sum = 0;
		
		for (int i = 0; i<sales.length; i++) {  // 0 1 2 3 4
			
//			sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];
			
			sum += sales[i];
			
		}
		
		System.out.println("총 판매량: "+ sum + "잔");
	}

	

}
