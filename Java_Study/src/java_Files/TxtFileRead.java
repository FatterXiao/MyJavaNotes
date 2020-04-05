package java_Files;

import java.io.*;

public class TxtFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 尽量采用try-source 写法
		readFile1();
		System.out.println("===================");
		// readFile2(); //JDK 7以上可以使用
	}

	private static void readFile1() {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream("c:/temp/abc.txt"); // 节点类
			isr = new InputStreamReader(fis, "UTF-8"); // 转化类
			br = new BufferedReader(isr); // 装饰类
			String line;
			while ((line = br.readLine()) != null) // 每次读取一行
			{
				System.out.println(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close(); // 关闭最后一个类，将关闭所有底层流
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void readFile2() {
		String line;
		// try-resource 语句
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("c:/temp/abc.txt")))) {
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
