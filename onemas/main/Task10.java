package by.onemas.main;

import java.util.Random;
import java.util.Scanner;

//��� ������������� ������ � ����������� ��������� �. ����� ������, �������� �� ���� ������ ������
//������� (�������������� �������� ��������� ������). ����������. �������������� ������ �� ������������.


public class Task10 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������� ������ �������");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("������� ������ �������");
		}
		int n;
		n=sc.nextInt();
		
		
		int mas[]=new int[n];
		Random rand =new Random();
		
		
		for(int i=0;i<mas.length; i++) {
			mas[i]=rand.nextInt(10)+1;
			System.out.print(mas[i]+", ");
			
			if(i%2!=0) {
				mas[i]=0;
				}
			
		
		}
		
		System.out.println("");
		
		for(int i=0;i<n;i+=2) {
			System.out.print(mas[i]+", ");
		}
	}
}
