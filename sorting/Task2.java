package by.sorting;

/* Даны две последовательности
a1 < a2 < an и b1< b2 < bm
. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/

public class Task2 {

	public static void main(String[] args) {
		int mas1[]=new int[] {1, 2, 5, 6};
		int mas2[]=new int[] {4, 7, 8};
		int newmas[]=new int[mas1.length+mas2.length];
		int count=0;
		int max=0;
		boolean check=true;
		boolean checkmin=false;
		
		
		for(int i=0;i<(mas1.length+mas2.length);i++) {
			
			if(count==mas1.length) {
				count=0;
				check=false;
			}
			
			
			if(check==true) {
				newmas[i]=mas1[i];	
			}
			else if(check==false) {
				newmas[i]=mas2[count];	
			}
			
			count++;
			
		}
		while(!checkmin) {
			checkmin=true;
			for(int i=0;i<newmas.length-1;i++) {
				if(newmas[i]>newmas[i+1]) {
					checkmin=false;
					
					
					max=newmas[i];
					newmas[i]=newmas[i+1];
					newmas[i+1]=max;
				}
			}
		}
		
		for(int x:newmas) {
			System.out.print(x+" ");
		}
	}

}
