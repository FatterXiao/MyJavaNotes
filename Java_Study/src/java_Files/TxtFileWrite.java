package java_Files;

import java.io.*;

public class TxtFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 尽量采用try-source 写法
		writeFile1();
		System.out.println("===================");
		// writeFile2();JDk 7以上可以使用
	}

	public static void writeFile1() {
		FileOutputStream fos = null;// 节点类，负责写字节
		OutputStreamWriter osw = null;// 转化类，负责字符到字节的转化
		BufferedWriter bw = null;// 装饰类，负责写字符到缓存区
		// 三者的关系BufferedWriter（OutputStreamWriter（FileOutputStream））
		try {
			fos = new FileOutputStream("c:/temp/abc.txt"); // 节点类
			osw = new OutputStreamWriter(fos, "UTF-8"); // 转化类
			bw = new BufferedWriter(osw); // 装饰类
			bw.write("我们是");
			bw.newLine();
			bw.write("Ecnuers.^^");
			bw.newLine();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				bw.close(); // 关闭最后一个类，会将所有底层流都关闭
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void writeFile2() {
		// try-resource 自动关闭资源 java1.7以上可以使用
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/abc.txt")))) {
			bw.write("������");
			bw.newLine();
			bw.write("Ecnuers.^^");
			bw.newLine();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
