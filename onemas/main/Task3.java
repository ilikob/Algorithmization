package by.onemas.main;

//��� ������ �������������� �����, ����������� �������� N. ����������, ������� � ��� �������������,
//������������� � ������� ���������.


public class Task3 {
	public static void main(String args[]) {
		int n=10;
		double mas[]= new double [n];
		int cplus=0;
		int cminus=0;
		int c0=0;
		
		for(int i=0; i<mas.length; i++) {
			mas[i]=Math.random()*20-10;
			
			if(mas[i]>0) {
				cplus++;
			}
			
			
			else if(mas[i]<0) {
				cminus++;
			}
			
			
			else {
				c0++;
			}
			
			System.out.println(mas[i]);
		}
		
		System.out.print("�������������- " + cplus + " �������������- " + cminus + " �������- "+ c0);
	}
}
