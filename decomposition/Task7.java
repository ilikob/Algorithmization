package by.decomposition;

//Ќаписать метод(методы) дл€ вычислени€ суммы факториалов всех нечетных чисел от 1 до 9


public class Task7 {

	public static void main(String[] args) {
		int mas[]= {1,2,3,4,5,6,7,8,9};
		int n=1;
		System.out.print(sum(mas,n));
		
	}
	
	
	
	public static int sum(int mas[], int n) {
		int sum=0;
		for(int i=0;i<mas.length;i++) {
			if(n%2!=0) {
				sum+=factorial(mas, n);
			}
			n++;
		}
		
		return sum;
	}
	
	
	public static int factorial(int mas[],int n) {
		int fact=1;
		for(int i=0;i<n;i++) {
			fact*=mas[i];
		}
		
		return fact;
	}

}
