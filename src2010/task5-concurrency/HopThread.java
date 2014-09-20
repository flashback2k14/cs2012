package concurrency;

public class HopThread extends Thread {

	String word;
	int delay;
	
	public HopThread(String word, int delay) {
		this.word = word;
		this.delay = delay;
	}

	@Override
	public void run() {
		super.run();
		//
		while (!isInterrupted()) {
			System.out.println(word);
			//
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}