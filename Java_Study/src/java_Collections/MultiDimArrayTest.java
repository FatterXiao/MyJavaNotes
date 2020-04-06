package java_Collections;
public class MultiDimArrayTest {

	public static void main(String[] args) {
		//Java��ά�����ǰ����д洢		
		
		//��������
		int a[][] = new int[2][3];
		//���������� 
		int b[][];
		b = new int[3][];
		b[0]=new int[3];
		b[1]=new int[4];
		b[2]=new int[5];
		
		int k = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = ++k; 
			}
		}
		
		for(int[] items : a)
		{
			for(int item : items)
			{
				System.out.print(item + ", ");
			}
			System.out.println();
		}
	}
}
