package by.onemas.main;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Task2 {

	public static void main(String[] args) {
		double a[] = new double[20];
		int z = 5;
		int ch = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i]=Math.random()*10;
			if(a[i]>z) {
				a[i]=z;
				ch++;
			}
			
			System.out.print(a[i] + ", ");
		}

		
		System.out.print("Количество замен = " + ch);
	}

}
