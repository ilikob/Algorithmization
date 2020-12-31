package by.arrayofarray.main;

import java.util.Scanner;

//—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):


public class Task5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("¬ведите чЄтное n= ");
		int n=sc.nextInt();
		int mas[][]=new int[n][n];
		int m=n;
		
		for(int i=0; i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=i+1;
				if(j>=m) {
					mas[i][j]=0;
				}
				System.out.print(mas[i][j]+ " ");
			}
			m--;
			System.out.println();
		}
	}

}
