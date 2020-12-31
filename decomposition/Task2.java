package by.decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел


public class Task2 {

	public static void main(String[] args) 
	{

	  int [] mas = {48,8,16,4};

	  int gcd = mas[0];
	  for (int i=1 ; i<mas.length; i++)
	    {
	        gcd = Getgcd(gcd,mas[i]);
	    }

	System.out.println(gcd);    
	}


	public static int Getgcd(int a, int b) {
		int n=0;
	    if (b == 0)
	    { 
	       return a;
	    }
	  	
	    n=a%b;
	     return Getgcd(b, n); 
	 }

}
