package oppg3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
public class ProducerConsumerTest {

	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<Integer>(5); 
		
		Thread k1 = new Thread(new Producer(sharedQueue));
		Thread k2 = new Thread(new Producer(sharedQueue));
		Thread k3 = new Thread(new Producer(sharedQueue));
		Thread s1 = new Thread(new Consumer(sharedQueue));
		Thread s2 = new Thread(new Consumer(sharedQueue));
		
		k1.start();
		k2.start();
		k3.start();
		s1.start();
		s2.start();
		
	}

}
