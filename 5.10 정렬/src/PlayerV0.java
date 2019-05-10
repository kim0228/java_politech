
public class PlayerV0 implements Comparable<PlayerV0> {
	 String name;
	 String position;
	 int regYear;
	
	PlayerV0(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	public String toString() {
		return name + ":" + position+ ":" + regYear;
	}
	@Override
	public int compareTo(PlayerV0 otherPlayer) {
		System.out.println("정렬시도");
//		return this.regYear - otherPlayer.regYear;  // 등록년도로 정렬
		return this.name.compareTo(otherPlayer.name);
//		return this.position.compareTo(otherPlayer.position);	// 이름순으로 정렬
	}
}
