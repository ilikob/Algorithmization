package by.decomposition;


//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.


public class Task13 {

	public static void main(String[] args) {
		int n=15;
		int i=0;
		
		for(i=0;i<array(n).length-2;i++) {
			if(number(n, i)==true) {
				System.out.println(array(n)[i]+" и "+array(n)[i+2]);
			}
		}
	}
	
	
	
	
	public static int[] array(int n) {
		int m;
		m=2*n-n+1;
		int mas []=new int [m];
;
		for(int i=0;i<mas.length;i++) {
			mas[i]=n;
			n++;
		}
		
		return mas;
	}
	
	public static boolean number(int n, int i) {
		int amount=0;
		boolean check=false;
		for(int j=2;j<array(n)[i];j++) {
			if(array(n)[i]%j==0 || array(n)[i+2]%j==0 ) {
				amount++;
			}
		}

		if(amount==0) {
			check=true;
		}
		else {
			check=false;
		}
		
		
		return check;
	}
	


}
