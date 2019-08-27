package multithreading;

import java.util.Random;

//UnSynchronized 
public class PrintTask implements Runnable{
	String name;
	
	PrintTask(String name){
		this.name = name;
	}
	void print() {
		int sleeping = new Random().nextInt(5000);
		System.out.println("Thread" + name + " is running and sleep for " + sleeping );
		try {
			Thread.sleep(sleeping);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
			print();
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintTask("t1"));
		Thread t2 = new Thread(new PrintTask("t2"));
		Thread t3 = new Thread(new PrintTask("t3"));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
