package java_Threads;

public class Thread1 extends Thread {// 通过继承Thread类来创建线程
	public void run() {
		System.out.println("hello");
	}

	public static void main(String[] a) {
		new Thread1().start();// 调用start方法来启动线程的run方法,是并行运行（多线程运行）；
								// 直接调用run方法，会变成串行执行
	}
}
