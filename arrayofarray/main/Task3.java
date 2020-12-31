package by.arrayofarray.main;

import java.util.Random;
import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.


public class Task3 {
	public static void main(String args[]) {
		int n=4;
		int m=4;
		int mas[][]=new int[n][m];
		Random rand = new Random();
		
		for(int i=0;i<mas.length;i++){
			
			for(int j=0; j<mas[i].length;j++) {
				mas[i][j]= rand.nextInt(10);
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Введите строку k= ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите строку k= ");
		}
		int k=sc.nextInt();
		
		System.out.println("Введите столбец p= ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите столбец p= ");
		}
		int p=sc.nextInt();
		
		
		System.out.println(mas[k][p]);
	}
}
