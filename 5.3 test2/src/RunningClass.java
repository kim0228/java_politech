import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RunningClass {
	public static void main(String[] args) {
		ArrayList<String>testList = new ArrayList<String>();
		
		testList.add("1");
		testList.add("2");
		testList.add("3");
		
		for (int i = 0; i < testList.size(); i++) {
			System.out.println("기본 for문:" + testList.get(i));
		}
		for (String a:testList) {
			System.out.println("향상된,개선된 for문:"+a);
		}
	}
}















//		HashMap<String, String> map= new HashMap<String, String>();
//		map.put("name", "hello");
//		map.put("name", "aaaa");
//		map.put("score", "100");
//		for (Map.Entry<String, String> item : map.entrySet()) {	// for문을 사용하여 key값과 value값을 출력한다.
//			System.out.println(item.getKey());
//			System.out.println(item.getValue());
//		}