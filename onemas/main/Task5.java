package by.onemas.main;



//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.


public class Task5 {
	public static void main(String args[]) {
		int n=10;
		int mas[]=new int [n];
		
		
		for(int i=0;i<mas.length; i++) {
			mas[i]=(int)(Math.random()*10);
			if(mas[i]>i) {
				System.out.print(mas[i]+", ");
			}
		}
	}
}
