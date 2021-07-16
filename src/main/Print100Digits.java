package main;

class MyThread extends Thread {

	int j = 1;

	public void run() {

		synchronized (MyThread.class) {

			System.out.println(" " + j++);

		}
	}
}

public class Print100Digits {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		for (int i = 1; i <= 100; i++) {
			Thread t = new Thread(my);
			t.start();

		}
	}
}
