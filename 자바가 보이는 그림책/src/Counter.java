
class Updater {
	public void update(Counter counter) {  // int count;
		counter.count++;
		//count++;
	}
}



public class Counter {
	int count = 0; 	// 객체변수
	public static void main(String[] args) {
		Counter myCounter = new Counter();		//객체 생성
		System.out.println("before update: "+ myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);	// myUpdater.update(myCounter.count);
		System.out.println("after update: "+ myCounter.count);
		
	}
}
