package by.onemas.main;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.


public class Task4 {
	public static void main(String args[]) {
		int n=5;
		double mas[]= new double [n];
		double max=Integer.MIN_VALUE;
		double min=Integer.MAX_VALUE;
		int maxi=0;
		int mini=0;
		
		for(int i=0; i<mas.length; i++) {
			mas[i]=Math.random()*20-10;
			
			
			if(mas[maxi]<=mas[i]) {
				maxi=i;
				max=mas[maxi];
			}
			
			else if(mas[mini]>=mas[i]) {
				mini=i;
				min=mas[mini];
			}
			System.out.printf("%.2f",mas[i]);
			System.out.println("");
			
		}
		
		
		System.out.printf("Макс=" + "%.2f", max);
		System.out.printf(" Мин=" +" %.2f", min);
		System.out.println(" Изменённый массив: ");
		
		
		mas[mini]=max;
		mas[maxi]=min;
		
		
		for(double x : mas) {
			System.out.printf("%.2f",x);
			System.out.println("");
		}
		
		
		System.out.print("Номер наибольшего= "+maxi+" Номер наименьшего= "+mini);
		
	}
}
