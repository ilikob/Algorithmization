package by.arrayofarray.main;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.



import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		int n=4;
		int mas[][]=new int[n][n];
		Random rand =new Random();
		int sum=0;
		int maxsum=0;
		int maxsumi=0;
		int jcount=0;
		
		
		
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(10);
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<mas.length;i++) {
			
			
			for(int j=jcount;j<mas[i].length;j=mas[i].length) {
				sum+=mas[i][j];
			}
			
			if(i==mas.length-1 && jcount<mas[i].length){
				
				if(sum>maxsum) {
					maxsum=sum;
					maxsumi=jcount ;
				}
				
				System.out.println("Сумма столбца номер "+jcount+" = "+sum);
				sum=0;
				
				
				jcount++;
				i=-1;
				
			}
		}
		
		System.out.println("Макс сумма= "+maxsum+" Столбец номер= "+maxsumi);
	}

}
