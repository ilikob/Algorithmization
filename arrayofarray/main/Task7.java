package by.arrayofarray.main;

import java.util.Scanner;

//������������ ���������� ������� ������� N �� �������: a[i][j]=sin((i^2-j^2)/N) � ���������� ���������� ������������� ��������� � ���.


public class Task7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������� ������� ������� N= ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("������� ������� ������� N= ");
		}
		int N=sc.nextInt();
		double mas[][]=new double[N][N];
		
		
		for(int i=0; i<mas.length;i++) {
			for(int j=0; j<mas[i].length;j++) {
				mas[i][j]=Math.sin((Math.pow(i, 2)-(Math.pow(j, 2))/N));
				System.out.print(mas[i][j]+"   ");
			}
			
			System.out.println();
		}
		
		
		

	}

}
