import java.util.ArrayList;
import java.util.Collections;

public class PlayerSortTest {
	public static void main(String[] args) {
		ArrayList<PlayerV0> list = new ArrayList<PlayerV0>();
		
		list.add(new PlayerV0("홍길동","투수", 1999));
		list.add(new PlayerV0("임꺽정","포수", 2005));
		list.add(new PlayerV0("강감찬","1루수", 2003));
		list.add(new PlayerV0("을지문덕","2루수", 2010));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
