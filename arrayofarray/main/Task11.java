package by.arrayofarray.main;

import java.util.Random;

//������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������ �����, �
//������� ����� 5 ����������� ��� � ����� ���.


public class Task11 {

	public static void main(String[] args) {
		int mas[][]=new int[10][20];
		Random rand =new Random();
		int count5=0;
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(15);
			
				 System.out.print(mas[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {

				if(mas[i][j]==5) {
					count5++;
				}
				
			}
			if(count5>=3) {
				System.out.print(i+" ");
			}
			count5=0;
		}

	}

}
