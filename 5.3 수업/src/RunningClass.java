import java.util.HashMap;
import java.util.Map;

public class RunningClass {
	public static void main(String[] args) {
		HashMap<String, String> map= new HashMap<String, String>();
		map.put("name", "hello");
		map.put("name", "aaaa");
		map.put("score", "100");
		for (Map.Entry<String, String> item : map.entrySet()) {	// for문을 사용하여 key값과 value값을 출력한다.
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}


	}
}
