package concurrency;

public class HipHopLauncher {

	public static void main (String[] args) {
		//
		HipThread hipThread = new HipThread("Hip", 200);
		HopThread hopThread = new HopThread("Hop", 500);
		//
		hipThread.start();
		hopThread.start();
		//
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//
		hipThread.interrupt();
		hopThread.interrupt();
	}
}