package by.sorting;

public class Task1 {

	public static void main(String[] args) {
		int mas1[]=new int[] {1, 2, 3, 4};
		int mas2[]=new int[] {5, 6};
		int k=2;
		int count=0;
		int newmas[]=new int[mas1.length+mas2.length];
		for(int i=0;i<newmas.length;i++) {
			if(i<k) {
				newmas[i]=mas1[i];
			}
			else if(i<k+mas2.length){
				newmas[i]=mas2[i-k];
				count++;
			}
			else if(i>=k+count) {
				newmas[i]=mas1[i-count];
			}
			
		}
		
		for(int a:newmas) {
			System.out.print(a+" ");
		}
		
	}

}
