package by.arrayofarray.main;

import java.util.Random;

//—формировать случайную матрицу m x n, состо€щую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.



public class Task14 {

	public static void main(String[] args) {
		int n=6;
		int m=6;
		int mas[][]=new int[m][n];
		Random rand =new Random();
		int sum=0;
		int jcount=0;
		int q=0;

		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=0;
			}
		}
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=jcount;j<mas[i].length;j=mas[i].length) {
				sum+=mas[i][j];
			}
			
			while(sum<=jcount) {
				q=rand.nextInt(m);
				if(mas[q][jcount]==0) {
					mas[q][jcount]=1;
					sum++;
				}
			}
			
			if(i==mas.length-1 && jcount<mas[i].length-1){
					
				
				jcount++;
				i=-1;
				sum=0;
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
