package by.sorting;

/*���������� �������. ���� ������������������ ����� n a <a1<a2.��������� ����������� �������� ���,
����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, ���������� ����������
������� � �������� �� ������ �����, � ������ - �� ����� �����������. �����, ������� �� �������, ��� ���������
�����������. �������� �������� ���������� �������.*/


public class Task3 {

	public static void main(String[] args) {
		int mas[]=new int [] {3, 5, 6, 7, 9, 10}; 
		int max=Integer.MIN_VALUE;
		int maxi=0;
		
		for(int i=0;i<mas.length;i++) {
			for(int j=i;j<mas.length;j++) {
				if(max<mas[j]) {
					max=mas[j];
					maxi=j;
				}
				
			}
			mas[maxi]=mas[i];
			mas[i]=max;
			max=Integer.MIN_VALUE;
		}
		for(int x:mas) {
			System.out.print(x+" ");
		}
	}

}
