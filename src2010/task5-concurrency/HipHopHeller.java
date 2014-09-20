package concurrency;

public class HipHopHeller extends Thread {

	private String word;
    private int delay;
    
    public HipHopHeller (String word, int delay) {
    
        this.word = word;
        this.delay = delay;
    }
    
    @Override
    public void run() {
    	super.run();
    	//
        while (!Thread.interrupted()) {
            System.out.print(this.word + "\n");          
            //
            try {
                Thread.sleep(this.delay);                
            } catch (InterruptedException e) {
            	System.out.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
   
		new HipHopHeller("Hip", 100).start();
        new HipHopHeller("HOP", 500).start();    	
    }
}