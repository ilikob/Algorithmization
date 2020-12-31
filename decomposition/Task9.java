package by.decomposition;


//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.


public class Task9 {

	public static void main(String[] args) {
		int x=5;
		int y=4;
		int z=6;
		int t=3;		
		double s;
		
		s=s1(x, y)+s2(z, t, x, y);
		System.out.printf("%f2", s);

	}
	

	public static double s1(int x, int y) {
		double s1;
		s1=x*y*0.5;
		return s1;
	}
	
	public static double diagonal(int x, int y) {
		double d;
		
		d=Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
		
		return d;
	}
	
	
	public static double s2(int z, int t,int x,int y) {
		double s2;
		double p;
		p=0.5*(z+t+diagonal(x,y));
		s2=Math.sqrt(p*((p-z)*(p-t)*(p-diagonal(x,y))));
		
		return s2;
	}
}
 