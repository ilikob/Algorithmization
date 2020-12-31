package by.arrayofarray.main;

import java.util.Random;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.


public class Task1 {
	public static void main(String args[]) {
		int n=4;
		int m=5;
		int mas[][]=new int [n][m];
		Random rand=new Random();
		
		for(int i=0;i<mas.length;i++){
			
			for(int j=0; j<mas[i].length;j++) {
				mas[i][j]= rand.nextInt(10);
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("нечетная матрица");
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0; j<mas[i].length;j+=2) {
				if(mas[0][j]>mas[mas.length-1][j]) {
					System.out.print(mas[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}
}
