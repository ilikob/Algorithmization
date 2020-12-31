package by.decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.*/


public class Task14 {

	public static void main(String[] args) {
		int k=1000;
		int i=0;
		
		for(i=0;i<array(k).length;i++) {
			if(armstrongNumber(k,i)==true){
				System.out.println(array(k)[i]);
			}
		}

	}

	
	public static int[] array(int k) {
		int mas []=new int [k];
;
		for(int i=0;i<mas.length;i++) {
			mas[i]=i+1;
		}
		
		return mas;
	}
	
	public static boolean armstrongNumber(int k, int i) {
		boolean check=false;
		int amount=0;
		int sum=0;
		int num=0;
		
		int mas1=array(k)[i];
		while(mas1!=0) {
			mas1/=10;
			amount++;
		}
		
		 mas1=array(k)[i];
		 
		for(int j=0;j<amount;j++) {
			num= mas1%10;
			 mas1= mas1/10;
			sum+=num;
		}
		sum=(int) Math.pow(sum, amount);
		

		
		if(sum==array(k)[i]) {
			check=true;
		}
		else {
			check=false;
		}
		

		return check;
	}
}
