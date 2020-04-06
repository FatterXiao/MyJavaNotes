package java_Threads;

/* java创建线程的两种方法
 * java.lang.Thread; 继承Thread类，实现run方法
 * java.lang.Runnable; 实现Runnable接口，实现run方法
 * */
public class ThreadDemo1 {
	public static void main(String args[]) throws Exception {
		new TestThread1().start();
		while (true) {
			System.out.println("main thread is running");
			Thread.sleep(1000);
		}
	}
}

//java.lang.Thread; 继承Thread类，实现run方法
class TestThread1 extends Thread {
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

//java.lang.Runnable; 实现Runnable接口，实现run方法
//class Thread2 implements Runnable{
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.print("Hello");
//	}
//	
//}
