package by.decomposition;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.


public class Task15 {

	public static void main(String[] args) {
		int n=4;
		
		for(int x:sequence(n)) {
			System.out.println(x);
		}
		
	}
	
	public static int[] sequence(int n) {
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
	

}
