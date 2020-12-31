package by.onemas.main;

//���� �������������� �����   . ����� max(a1+a2n, a2+a2n-1, ...)


import java.util.Scanner;
 
public class Task7 {
	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������ �������: ");
        int n = in.nextInt();
        double[] mas = new double[n];
        if(mas.length % 2 != 0){
            throw new IllegalArgumentException("������ ������� ������ ���� ������!!!");
        }
        System.out.println("��������� ������: ");
        for(int i = 0; i < mas.length; i++){
            mas[i] = in.nextDouble();
        }
        System.out.println("������������ ����� = " + sum(mas));
    }
    public static double sum(double[] mas){
        double maxSum = mas[0] + mas[mas.length - 1];
        for(int i = 1; i < mas.length / 2; i++){
            if((mas[i] + mas[mas.length - i - 1]) > maxSum){
                maxSum = mas[i] + mas[mas.length - i - 1];
            }
        }
        return maxSum;
    }
}
