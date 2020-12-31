package by.arrayofarray.main;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.


public abstract class Task2 {

	public static void main(String[] args) {
		int n=4;
		int m=4;
		int mas[][]=new int[n][m];
		Random rand= new Random();
		
		for(int i=0;i<mas.length;i++){
			
			for(int j=0; j<mas[i].length;j++) {
				mas[i][j]= rand.nextInt(10);
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Диагональ");
		
		for(int i=0;i<mas.length;i++){
			
			System.out.println(mas[i][i]);
		}

	}

}
