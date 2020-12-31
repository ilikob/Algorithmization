package by.decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел: (НОК(А,В=(А*В)/(НОД(А,В))))
	
	
public class Task1 {
	public static void main(String args[]) {
		int a=18;
		int b=9;
		System.out.println(lcm(a,b));
	}
	
	
	 public static int gcd(int a, int b) {
	        int d = 0;
	        while (b != 0 && a != 0) {
	            if (a > b) {
	                a %= b;
	            } else {
	                b %= a;
	            }
	            d = a + b;
	        }
	        return d;
	    }
	 
	 
	 public static int lcm(int a, int b){
		 int n=0;
		 n=(a*b)/gcd(a,b);
		 
		 return n;
	 }
}
