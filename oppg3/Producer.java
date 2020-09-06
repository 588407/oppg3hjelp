package oppg3;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
public class Producer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;
	
	
	public Producer(BlockingQueue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		while(true) {
		int burger = sharedQueue.size();
		int burgere = burger;
		try {
			if(sharedQueue.size() < 5) {
			Thread.sleep((long) (Math.random()* 2000) + 4000);
			sharedQueue.put(burgere);
			burger++;
			System.out.printf("%s legger på burger [%s] => [%s]\n", toString(), burger, burgere);			
			}} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}

	@Override
	public String toString() {
		return "Kokk" + sharedQueue.size();
	}

}
