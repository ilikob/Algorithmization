package by.sorting;
/*ѕусть даны две неубывающие последовательности действительных чисел  a <= a2 и b <= b2 .
“ребуетс€ указать те места, на которые нужно вставл€ть элементы последовательности  b < b2  в первую
последовательность так, чтобы нова€ последовательность оставалась возрастающей.
8.*/
public class Task7 {

	public static void main(String[] args) {
		int mas1[]=new int[] {2, 3, 5, 7, 8};
		int mas2[]=new int[] {1, 4, 6, 9};
		int countmas1=0;
		int countmas2=0;
		int countchange=0;
		int n=0;
		
		if(mas1.length>mas2.length) {
			n=mas1.length;
		}
		else {
			n=mas2.length;
		}

		System.out.println("Ѕез сдвига");
		
		for(int i=0;i<n;i++) {

			if(mas1[countmas1]>mas2[countmas2]) {
				System.out.print(countmas1+" ");
				countmas1++;
				countmas2++;
			}
			else {
				countmas1++;
				if(i==mas1.length-1) {
					System.out.print(countmas1+" ");
				}
			}
			
		}
		
		
		System.out.println();
		System.out.println("—о сдвигом");
		countmas1=0;
		countmas2=0;
		
		for(int i=0;i<n;i++) {

			if(mas1[countmas1]>mas2[countmas2]) {
				System.out.print((countmas1+countchange)+" ");
				countmas1++;
				countmas2++;
				countchange++;
			}
			else {
				countmas1++;
				if(i==mas1.length-1) {
					System.out.print((countmas1+countchange)+" ");
				}
			}
			
		}
	}

}
