package by.arrayofarray.main;

import java.util.Scanner;

//—формировать квадратную матрицу пор€дка N по правилу: a[i][j]=sin((i^2-j^2)/N) и подсчитать количество положительных элементов в ней.


public class Task7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("¬ведите пор€док матрицы N= ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("¬ведите пор€док матрицы N= ");
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
