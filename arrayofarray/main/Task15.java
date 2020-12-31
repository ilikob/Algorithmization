package by.arrayofarray.main;

import java.util.Random;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.


public class Task15 {

	public static void main(String[] args) {
		int n=6;
		int m=6;
		int mas[][]=new int[m][n];
		Random rand =new Random();
		int max=Integer.MIN_VALUE;

	

		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(10);
				if(max<mas[i][j]) {
					max=mas[i][j];
				}
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(max);
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				if(j%2!=0&& i%2!=0) {
					mas[i][j]=max;
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
