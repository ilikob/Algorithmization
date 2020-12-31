package by.arrayofarray.main;

import java.util.Random;
import java.util.Scanner;

/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/

public class Task8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Введите порядок матрицы n= ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите порядок матрицы n= ");
		}
		int n=sc.nextInt();
		
		System.out.println("Введите столбец a1= ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите столбец a1= ");
		}
		int a1=sc.nextInt();
		
		System.out.println("Введите столбец a2= ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите столбец a2= ");
		}
		int a2=sc.nextInt();
		
		int mas[][]=new int[n][n];
		int masa1[][]=new int[n][n];
		int masa2[][]=new int[n][n];
		Random rand= new Random();
		
		
		
		for(int i=0;i<mas.length;i++){
			
			for(int j=0; j<mas[i].length;j++) {
				mas[i][j]= rand.nextInt(10);
				
				
				if (j==a1) {
					masa1[i][a1]=mas[i][j];
				}
				
				
				if (j==a2) {
					masa2[i][a2]=mas[i][j];
				}
				
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<mas.length;i++){
			for(int j=0; j<mas[i].length;j++) {
				
				
				if(j==a1) {
					mas[i][j]=masa2[i][a2];
				}
				
				
				if(j==a2) {
					mas[i][j]=masa1[i][a1];
				}
				
				
				System.out.print(mas[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
