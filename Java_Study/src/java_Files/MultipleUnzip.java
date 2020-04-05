package java_Files;
import java.io.File ;  
import java.io.OutputStream ;  
import java.io.InputStream ;  
import java.util.zip.ZipEntry ;  
import java.util.zip.ZipFile ;  
import java.util.zip.ZipInputStream ;  
import java.io.FileInputStream ;  
import java.io.FileOutputStream ;  
public class MultipleUnzip {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//����ѹ��zip�ļ�����Ҫ��zip�ļ��Ϲ�������������ȡ���ݵ�Java��
        File file = new File("c:/temp/multiple.zip") ;   // ����ѹ���ļ�����  
        File outFile = null ;   // ����ļ���ʱ��Ҫ���ļ��еĲ���  
        ZipFile zipFile = new ZipFile(file) ;   // ʵ����ZipFile����  
        ZipInputStream zipInput = null ;    // ����ѹ��������  
        
        //定义压缩的文件名
        OutputStream out = null ;   // 定义输出流，用于输出每一个实体内容
        InputStream input = null ;  // 定义输入流，读取每一个ZipEntry  
        ZipEntry entry = null ; // 每一个压缩实体 
        zipInput = new ZipInputStream(new FileInputStream(file)) ;  // 实例化ZIpInputStream 
        
        //遍历压缩包中的文件
        while((entry = zipInput.getNextEntry())!=null){ // �õ�һ��ѹ��ʵ��  
        	System.out.println("解压缩" + entry.getName() + "文件") ;  
            outFile = new File("c:/temp/" + entry.getName()) ;   // ����������ļ�·��  
            if(!outFile.getParentFile().exists()){  // �������ļ��в����� 
                outFile.getParentFile().mkdirs() ;   
                // 创建文件夹 ,�如果这里有多级文件夹不存在,请使用mkdirs()
                // 如果只是单纯的一级文件夹,使用mkdir()
            }  
            if(!outFile.exists()){  // 判断文件是否存在
            	if(entry.isDirectory())
            	{
            		outFile.mkdirs();
            		System.out.println("create directory...");
            	}
            	else
            	{
            		outFile.createNewFile() ;   // 创建文件
            		System.out.println("create file...");
            	}                  
            }  
            if(!entry.isDirectory())
            {
            	input = zipFile.getInputStream(entry) ; // 得到每一个实体的输入流
                out = new FileOutputStream(outFile) ;   // 实例化文件输出流
                int temp = 0 ;  
                while((temp=input.read())!=-1){  
                    out.write(temp) ;  
                }  
                input.close() ;     // 关闭输入流
                out.close() ;   // 关闭输出流
            }
            
        }  
        zipFile.close();
        input.close() ;  
        zipInput.close();
	}

}
