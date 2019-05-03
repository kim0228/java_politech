
public class Person {
	public static int currentNum = 0;
	// 클래스가 만들어질 때만 0 이 만들어지고 메소드에서 변경된 값들만 들어간다.

	private String name = "";
	private int startNum = 0;
	private int endNum = 0;
	private String castedNum = "";
	private String clap = "";
	private boolean endGame = false;

	public Person(String name, int startNum, int endNum) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.startNum = startNum;
		this.endNum = endNum;
		this.currentNum = this.startNum;
	}
	
	public void count() {
		this.castingTostr();
		this.setClap();
		this.shout();
		this.checkEnd();
		this.currentNum++;
	}

	//숫자를 문자열로 변환
	private void castingTostr() {
		this.castedNum = String.valueOf(currentNum);
	}
	
	
	//박수 세팅
	private void setClap() {
		int count = 0;
		this.clap = "";
		for (int i = 0; i < this.castedNum.length(); i++) {
			if (this.castedNum.charAt(i) == '3' | this.castedNum.charAt(i) == '6' | this.castedNum.charAt(i) == '9') {
				this.clap = this.clap + "짝";
				count++;
			}
		}
		
		if(count == 0)
			this.clap = String.valueOf(currentNum);
	}
	
	//프린트
		public void shout() {
			System.out.println(name + "이(가) 외칩니다!! " + this.clap);
		}
	
	//현재 숫자가 앤드숫자와 같거나 크면 endGame을 트루로 변경
		private void checkEnd() {
			if(this.currentNum >= this.endNum) {
				this.endGame = true;
			}
		}
		
	
	public boolean getEnd() {
		return this.endGame;
	}
}
