package by.arrayofarray.main;

import java.util.Random;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.


public abstract class Task13 {

	public static void main(String[] args) {
		int n=4;
		int mas[][]=new int[n][n];
		Random rand =new Random();
		int change=0;
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt()%10;
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<mas.length;i++) {
			for(int q=i+1;q<mas.length;q++) {
				for(int j=0;j<mas[i].length;j++) {
					if(mas[i][j]<mas[q][j]) {
						change=mas[i][j];
						mas[i][j]=mas[q][j];
						mas[q][j]=change;
						
						
					}
				}
				
			}
		}
		
		
		System.out.println();
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
