package by.decomposition;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("������ �����:");
		int a=in.nextInt();
		
		System.out.println("������ �����:");
		int b=in.nextInt();
		
		if(amountofnumeral(a)>amountofnumeral(b)) {
			System.out.println("� ������ ����� ���� ������");
		}
		else {
			System.out.println("�� ������ ����� ���� ������");
		}
		
	}
	
	
	public static int amountofnumeral(int x) {
		int amount=0;
		
		while(x!=0) {
			x/=10;
			amount++;
		}
		return amount;
	}

	
	
}
