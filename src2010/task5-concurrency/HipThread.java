package concurrency;

public class HipThread extends Thread {

	String word;
	int delay;
	
	public HipThread(String word, int delay) {
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