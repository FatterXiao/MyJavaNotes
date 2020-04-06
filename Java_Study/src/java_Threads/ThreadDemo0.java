package java_Threads;

public class ThreadDemo0 {
	public static void main(String args[]) throws Exception {
		new TestThread0().run();// 调用start方法来启动线程的run方法,是并行运行（多线程运行）；
		// 直接调用run方法，会变成串行执行；该代码块执行不玩，下面的代码是不会执行的

		while (true) {
			System.out.println("main thread is running");
			Thread.sleep(10);
		}
	}
}

class TestThread0 {
	public void run() {
		while (true) {
			System.out.println(" TestThread1 is running");
			try {
				Thread.sleep(1000); // 1000毫秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
