package by.decomposition;

import java.util.Scanner;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.


public class Task12 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Первое число:");
		int k=in.nextInt();
		
		System.out.println("Второе число:");
		int n=in.nextInt();
		
		for(int x:masa(k,n)) {
			System.out.println(x);
		}
	}
	
	public static int sumnumeral(int af) {
		int amount=0;
		int a1=af;
		int sum=0;
		
		while(a1!=0) {
			a1/=10;
			amount++;
		}
		for(int i=0;i<amount;i++) {
			sum+=af%10;
			af=af/10;
		}
		
		return sum;
	}
	
	public static int[] masa(int k, int n) {
		int[] a =new int [10];

		
		for(int i=0; i<a.length; i++) {
			
			a[i]=(int)(10+Math.random()*1000000);
			int af=a[i];
			
			while(a[i]>n || sumnumeral(af)!=k) {
				a[i]=(int)(10+Math.random()*1000000);
				af=a[i];
			}
			
		}
		
		
		return a;
	}

}
