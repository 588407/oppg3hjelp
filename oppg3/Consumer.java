package oppg3;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
public class Consumer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;
	
	
	public Consumer(BlockingQueue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		while(true) {
			int burger = sharedQueue.size();
			int burgere = burger;
		try {
			if(sharedQueue.size() >= 1) {
			Thread.sleep((long) (Math.random()* 2000) + 4000);
			burger--;
			sharedQueue.take();
			 System.out.printf("%s tar av burger [%s] <= [%s]\n", toString(), burger, burgere);			
			}} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
	 @Override
	    public String toString() {
	        return "Servitør" + sharedQueue.size();
	    }	

}
	

