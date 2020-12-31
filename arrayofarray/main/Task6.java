package by.arrayofarray.main;

import java.util.Scanner;

//—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):


public class Task6 {

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("¬ведите чЄтное n= ");
		int n=sc.nextInt();
		int mas[][]=new int[n][n];
		
		int num;
		int num2;
		int check =0;
		
		num=0;
		num2=mas.length-1;
		
		for (int i=0; i<mas.length; i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=0;
				
				if(num<=j && j<=num2 && check==0) {
					mas[i][j]=1;
				}
				else if(num2<=j && j<=num && check==1) {
					mas[i][j]=1;
				}	
				System.out.print(mas[i][j]+" ");
			}
			if(num+1==num2) {
				check=1;
			}
			
			num++;
			num2--;
			
			
			System.out.println();
		}
	}
}
