package by.arrayofarray.main;

import java.util.Scanner;

//—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)


public class Task4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("¬ведите чЄтное n= ");
		int n=sc.nextInt();
		int mas[][]=new int[6][n];
		int m=0;
		
		
		for(int i=0;i<mas.length;i++) {
			if(i%2!=0) {
				m=1;
			}
			
			if(i%2==0) {
				
				m=n;
			}
			for(int j=0;j<mas[i].length;j++) {
				
				
				if(i%2!=0) {
					mas[i][j]=m++;
				}
				
				if(i%2==0) {
					
					mas[i][j]=m--;
				}
				
				
				System.out.print(mas[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
