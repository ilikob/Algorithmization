package by.sorting;

/*Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai ai+1  . Если   ai <ai+1 , то продвигаются
на один элемент вперед. Если   ai> ai+1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.*/


public class Task6 {

	public static void main(String[] args) {
		int mas[]= new int [] {1, 3, 2, 4, 7, 6};
		int min=0;
		
		
		
		for(int i=0; i<mas.length-1;i++) {
			if(mas[i]>mas[i+1]) {
				min=mas[i];
				mas[i]=mas[i+1];
				mas[i+1]=min;
			}
		}
		
		for(int x: mas) {
			System.out.print(x+" ");
		}
	}

}
