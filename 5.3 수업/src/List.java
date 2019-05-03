import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();// <>는 generic. <>안에 데이터타입을 지정한다. <>안에는 객체데이터만 사용한다.
		list.add(2);
		list.add(5);
		list.add(10);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}















//		ArrayList<String>list = new ArrayList<String>();	
//		list.add("AAAA");
//		list.add("BBBB");
//		list.add("CCCC");
//		list.add("DDDD");
//		System.out.println(list);
//		list.set(1,"EEEE");
//		System.out.println(list);
//		String tmp = list.get(2);