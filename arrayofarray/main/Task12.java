package by.arrayofarray.main;

import java.util.Random;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.


public class Task12 {

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
		
		
		System.out.println();
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				for(int q=j+1;q<mas[i].length;q++) {
					
					if(mas[i][j]<mas[i][q]) {
						change=mas[i][j];
						mas[i][j]=mas[i][q];
						mas[i][q]=change;
						
						
					}
				}
					
			}
		}
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
	}
}


