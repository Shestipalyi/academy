package by.academy.classwork.lesson20;

public class MyRunnable implements Runnable {
	
	public void run() {
		System.out.println("Runnable");
	}
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
}
