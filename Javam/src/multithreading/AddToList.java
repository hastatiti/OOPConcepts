package multithreading;

import java.util.*;

public class AddToList implements Runnable {
	final List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
	String name;

	public AddToList(String name) {
		this.name = name;
	}
	synchronized void addToList() {
		synchronized(list){
			for(int i = 0; i < 30; i++) {
				list.add(i);
				System.out.println("Thread" + name + " is running and adding " + i );
			}
		}
	}
	@Override
	public void run() {
		addToList() ;
	}
public static void main(String[] args) {
	Thread t1 = new Thread(new AddToList("1"));
	Thread t2 = new Thread(new AddToList("2"));
	Thread t3 = new Thread(new AddToList("3"));
	
	t1.start();
	t2.start();
	t3.start();
}
}
