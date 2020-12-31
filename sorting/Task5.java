package by.sorting;

/*Сортировка вставками. Дана последовательность чисел a ,a1 , ,an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть  a ,a1 , ,ai  - упорядоченная последовательность, т. е.
n a<  a1< an . Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/


public class Task5 {

	public static void main(String[] args) {
		int mas[]= new int[] {1, 3, 5, 8, 9, 4, 6, 7 };
		int n=0;
		int min=0;
		int max=0;
		int count=0;

		
		
		for(int i=0;i<mas.length-1;i++) {
			if(mas[i]<mas[i+1] ) {
				n++;
			}
			else {
				break;
			}
		}
		while(n!=mas.length-1) {
			min=mas[n+1];
			mas[n+1]=mas[n];
			
			
			for(int i=Search(mas, n, count);i<n+2;i++) {
					max=mas[i];
					mas[i]=min;
					min=max;
			}
			
			for(int x:mas) {
				System.out.print(x+" ");
			}
			System.out.println();
			count=0;
			n++;
			
		}
		
		

	}
	
	
	
	public static int Search(int[] mas, int n, int count) {
		boolean check=false;
		int first=0;
		int last=n;
		if(count>1){
			first++;
			last--;
		}
		int position =(first+last)/2;
		System.out.println(position);
		System.out.println(n);
		
		while(check==false && position!=n+1 && first!=last) {
			while(position!=n+1 && first!=last && check==false ) {
				if(mas[position]<mas[n+1]) {
					first=position+1;
				}
				else if(mas[position]>mas[n+1]) {
					last=position-1;
				}
				else if(mas[n+1]<mas[position] ) {
					check=true;
				}
				else if(check==false) {
					position =(first+last)/2;
				}

			}
			count++;
			
			System.out.println(position);
			
		}

		

		return position;
	}
}