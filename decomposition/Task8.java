package by.decomposition;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].


public class Task8 {

	public static void main(String[] args) {
		int d[]= {1, 5, 4, 6, 7, 7, 9, 10, 11};
		int i=0;
		for(i=0; i<d.length; i++) {
			if((i+1)%3==0) {
				System.out.println(sum(d, i));
			}
		}
	}

	
	public static int sum(int d[], int i) {
		int sum=0;
		for(int j=i;j>i-3;j--) {
			sum+=d[j];
		}
		
		return sum;
	}
}
