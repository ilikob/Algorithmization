package by.onemas.main;

//� ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �

public class Task1 {
	public static void main(String args[]) {
		int a[] = new int[10];
		int k=3;
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			a[i]=(int)(Math.random()*10 +1 );
			System.out.print(a[i]+ ", ");
			
			if(a[i]%k==0) {
				sum+=a[i];
			}
			
		}
		
		System.out.print("�����= " + sum);
	}
}
