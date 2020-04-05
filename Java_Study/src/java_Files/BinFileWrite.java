package java_Files;

import java.io.*;

public class BinFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeFile();
		System.out.println("done.");
	}

	public static void writeFile() {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;// 节点类，负责写字节
		BufferedOutputStream bos = null;// 装饰类，负责写字节数据到缓冲区
		DataOutputStream dos = null;// 转化类，负责数据类型到字节转化
		// 三者之间的关系：DataOutputStream（BufferedOutputStream（FileOutputStream））
		try {
			fos = new FileOutputStream("c:/temp/def.dat");
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);

			dos.writeUTF("a");
			dos.writeInt(20);
			dos.writeInt(180);
			dos.writeUTF("b");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				dos.close(); // 关闭最后一个类，底层所有流自动关闭
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
