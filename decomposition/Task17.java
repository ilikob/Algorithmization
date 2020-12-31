package by.decomposition;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {

	public static void main(String[] args) {
	int n =21;

	System.out.println("Сумма= " + sumNumber(n)+" Количество вычитаний= "+amountSubtractions(n));
	}
	
	public static int sumNumber(int n) {
		int sum=0;
		int amount=0;
		
		int mas1=n;
		while(mas1!=0) {
			mas1/=10;
			amount++;
		}
		
		 mas1=n;
		 
		for(int j=0;j<amount;j++) {
			 sum+=mas1%10;
			 mas1= mas1/10;

		}
		return sum;
	}
	
	public static int amountSubtractions(int n) {
		int amount=0;
		int n1=n;
		
		while(n1!=0) {
			n1-=sumNumber(n);
			amount ++;
		}
		
		return amount;
	}

}
