package java_Threads;

public class ThreadDemo2 {
	public static void main(String args[]) throws InterruptedException {
		// main函数可能早于子线程结束；
		// main线程和子线程都结束了，整个程序才算终止；
		new TestThread2().start();
//		while(true)
//		{
//			System.out.println("main thread is running");
//			Thread.sleep(1000);
//		}
	}
}

class TestThread2 extends Thread {
	public void run() {
		while (true) {
			System.out.println("TestThread2" + "  is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
