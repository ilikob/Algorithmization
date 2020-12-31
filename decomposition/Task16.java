package by.decomposition;


//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {

	public static void main(String[] args) {
		int n=3;

		
		System.out.println("Сумма = " + summa(n));
		System.out.print("Число четных = "+ amountEven(n));
	}
	
	public static int[] array(int n) {
		int l;
		l=(int) (Math.pow(10, n)-Math.pow(10, n-1));
		int mas[]=new int[l];
		int num=0;
		
		int min;
		int max;
		
		min=(int) Math.pow(10, n-1);
		max=(int) Math.pow(10, n);
		
		for(int i=min;i<max;i++) {
			mas[num]=i;
			num++;
		}
		
		
		return mas;
	}
	
	public static int summa(int n) {
		int sum=0;
		int i=0;
		for(i=0;i<array(n).length;i++) {
			if(checkNumbers(n,i)==true) {
				sum+=array(n)[i];
			}
		}
		
		return sum;
	}
	
	
	public static boolean checkNumbers(int n, int i) {
		boolean check=false;
		int amount=0;
		int num=0;
		int score=0;
		
		int mas1=array(n)[i];
		while(mas1!=0) {
			mas1/=10;
			amount++;
		}
		
		 mas1=array(n)[i];
		 
		for(int j=0;j<amount;j++) {
			num= mas1%10;
			 mas1= mas1/10;
			 if(num%2==0) {
				 score++;
			 }
		}
		
		if(score==0) {
			check=true;
		}
		
		else {
			check=false;
		}
		
		
		return check;
		
		
	}
	
	public static int amountEven(int n) {
		int amounteven=0;
		int amount=0;
		int num=0;
		
		int mas1=summa(n);
		while(mas1!=0) {
			mas1/=10;
			amount++;
		}
		
		 mas1=summa(n);
		 
		for(int j=0;j<amount;j++) {
			num= mas1%10;
			 mas1= mas1/10;
			 if(num%2==0) {
				 amounteven++;
			 }
		}
		return amounteven;
	}

}
