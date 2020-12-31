package by.decomposition;


//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
// являются цифры числа N.


public class Task10 {

	public static void main(String[] args) {
		
		int n=12345;
		
		for(int x:numeral(n)) {
			System.out.print(x+" ");
		}
		
	}
	
	
	public static int[] numeral(int n) {
		int amount=0;
		int n1=n;
		while(n1!=0) {
			n1/=10;
			amount++;
		}
		int num[]=new int [amount];
		int am=amount;
		int nend;
		
		for(int i=0;i<amount;i++) {
			nend=(int) (n%(Math.pow(10, am-1)));
			num[i]=(int) (n/(Math.pow(10, am-1)));
			n=n-(n-nend);
			am--;

		}
		return num;

	}

}
