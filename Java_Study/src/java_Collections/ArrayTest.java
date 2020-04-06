package java_Collections;


public class ArrayTest {

	public static void main(String[] args) {
		
		int a[]; //a ��û��new����  ʵ������null��Ҳ��֪���ڴ�λ��
		int[] b; //b ��û��new����  ʵ������null��Ҳ��֪���ڴ�λ��
		int[] c = new int[2]; //c��2��Ԫ�أ�����0
		c[0] = 10; c[1] = 20; //�����ʼ��
		
		int d[] = new int[]{0,2,4};//d��3��Ԫ��, 0,2,4��ͬʱ����ͳ�ʼ��
		int d1[] = {1,3,5};        //d1��3��Ԫ��, 1,3,5 ͬʱ����ͳ�ʼ��
		
		//ע����������ʱ��û�з����ڴ棬����Ҫָ����С�������Ǵ���ʾ��
		//int e[5];
		//int[5] f;
		//int[5] g = new int[5];
		//int h[5] = new int[5];
		
		//��Ҫ�Լ���������λ��
		for(int i=0;i<d.length;i++)	{
			System.out.println(d[i]);
		}
		
		//�����������λ��
		for(int e : d) {
			System.out.println(e);
		}
	}
}
