package by.decomposition;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

public class Task3 {

	public static void main(String[] args) {
		int a=6;
		double square6;
		square6=triangle(a)*6;
		System.out.print(square6);

	}

	
	
	public static double triangle(int a) {
		double square;
		square=Math.pow(a, 2)*((Math.sqrt(3))/4);
		return square;
	}
}
