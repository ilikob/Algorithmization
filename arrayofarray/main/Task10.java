package by.arrayofarray.main;

import java.util.Random;

//Найти положительные элементы главной диагонали квадратной матрицы.


public class Task10 {

	public static void main(String[] args) {
		int n=4;
		int mas[][]=new int[n][n];
		Random rand =new Random();
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt()%10;
				System.out.print(mas[i][j]+"  ");
			}
			System.out.println();
		}
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				if(i==j && mas[i][j]>0) {
					System.out.println("Положительный элемент главной диагонали= "+ mas[i][j]);
				}
			}
		}

	}
	

}
