package by.sorting;

/*Сортировка обменами. Дана последовательность чисел n a< a1< a2  Требуется переставить числа в
порядке возрастания.*/


public class Task4 {

	public static void main(String[] args) {
		int mas[]=new int [] {1, 2, 3, 6, 7, 8};
		int min=0;
		int count=0;
		boolean check=false;
		
		while(!check) {
			check=true;
			
			
			for(int i=0;i<mas.length-1;i++) {
				
				if(mas[i]<mas[i+1]) {
					check =false;
					
					min=mas[i];
					mas[i]=mas[i+1];
					mas[i+1]=min;
					count++;
				}
			}
		}
		
		
		for(int x:mas) {
			System.out.print(x+" ");
		}
		
		System.out.print("Количество замен= "+ count);
	}

}
