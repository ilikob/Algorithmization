package by.onemas.main;

import java.util.Scanner;

//� ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. ���� �����
//����� ���������, �� ���������� ���������� �� ���.


public class Task9 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������� ������ �������");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("������� ������ �������");
		}
			
		int n=sc.nextInt();
		
		
		int mas[] =new int[n];
		
		
		System.out.println("��������� ������ ������ �������");
		for(int i=0;i<mas.length; i++) {
			while(!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("��������� ������ ������ �������");
			}
			
			mas[i]=sc.nextInt();
			}
		
		
		System.out.println("");
		System.out.print(searchforrepeat(mas));
	}
		
		
	public static int searchforrepeat(int mas[]) {
		int repeat=0;
		int maxrepeat=1;
		int m;
		int max=0;
		
		
		for(int search:mas) {
			
			
			for(m=0; m<mas.length;m++) {
				if(mas[m]==search) {
					repeat++;
				}
			}
				
			
			if(repeat>maxrepeat) {
				maxrepeat=repeat;
				max=search;
			}
			else if(maxrepeat==repeat && search<max) {
				max=search;
			}
			
			
			m=0;
			repeat=0;
		}
		
		return max;
	}
}
