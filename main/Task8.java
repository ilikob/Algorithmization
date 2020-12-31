package by.onemas.main;

import java.util.Scanner;

//Дана последовательность целых чисел  . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( , , , )  .



public class Task8 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Введите размер массива");
		int n=sc.nextInt();
		int mas[]=new int [n];
		int min=Integer.MAX_VALUE;
		int count=0;
		int newi=0;
		
		
		System.out.println("Заполните массив целыми числами");
		for(int i=0;i<mas.length; i++) {
			mas[i]=sc.nextInt();
			}
		
		
		for(int minimal : mas) {
			min=Math.min(min,minimal );
			if(minimal==min) {
				count++;
			}
		}
		
		
		
		System.out.println("Минимальное значение= "+min+" Количество минимальных значений= "+count);
		
		
		
		int newmas[]= new int [n-count];
		for(int minimal : mas) {
			if(minimal!=min) {
				newmas[newi]=minimal;
				newi++;
				System.out.println(minimal);
			}
		}
	}
	
}
