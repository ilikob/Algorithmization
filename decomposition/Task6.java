package by.decomposition;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public abstract class Task6 {

	public static void main(String[] args) {
		int[] mas ={13,15,17};


		 if(check(mas)==true) {
			 System.out.println("Эти числа являются взаимно простыми");
		 }
		 else {
			 System.out.println("Эти числа не являются взаимно простыми");
		 }
   
		}

	public static boolean check(int mas[]) {
		int n=0;
		boolean check=true;
		int gcd=0;
		for (int i=0 ; i<mas.length-1; i++){
			int a =mas[n];
			for(int j=n+1; j<mas.length;j++) {

				
			 	if(check==true) {
			 		gcd = Getgcd(a,mas[j]);
			 		if(Getgcd(gcd,mas[j])!=1) {
			 			check=false;
			 		}
		       }
			 	else {
			 		break;
			 	}
			 	
			}
			n++;
		 }
		
		return check;
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
