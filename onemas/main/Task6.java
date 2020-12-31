package by.onemas.main;

//«адана последовательность N вещественных чисел. ¬ычислить сумму чисел, пор€дковые номера которых
//€вл€ютс€ простыми числами.


public class Task6 {
	public static void main(String args[]) {
		int n=10;
		double sum=0;
		double mas[]= new double [n];
		
		
		for(int i=0; i<mas.length; i++) {
			mas[i]=Math.random()*20;
			for(int j=2;j<=i;j++) {
				
				if(i==j) {
					sum+=mas[i];
				}
				
				
				if(i%j==0) {
					break;
				}
			
			
			}
			System.out.printf(" "+"%.2f", mas[i]);
		}
		
		System.out.println("");
		System.out.printf("%.2f", sum);
	}
}
