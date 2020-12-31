package by.decomposition;

import java.util.Random;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).


public class Task5 {

	public static void main(String[] args) {
		int n=6;
		int mas[]= new int[n];
		
		
		for(int x:randommas(mas)) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print(maxi(mas));

	}
	
	
	
	public static int [] randommas(int mas[]) {
		Random rand=new Random();
		for(int i=0;i<mas.length; i++) {
			mas[i]=rand.nextInt(10)+1;		
			}
		
		return mas;
	}
	
	public static int max(int mas[]) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<mas.length;i++) {
			if(mas[i]>max) {
				max=mas[i];
			}
		}
		return max;
	}

	
	public static int maxi(int mas[]) {
		int maxi=Integer.MIN_VALUE;
		
		for(int i=0; i<mas.length;i++) {
			if(mas[i]>maxi &&mas[i]!=max(mas)) {
				maxi=mas[i];
			}
		}
		
		return maxi;
	}
}
