package by.decomposition;
//Ќа плоскости заданы своими координатами n точек. Ќаписать метод(методы), определ€ющие, между какими
//из пар точек самое большое рассто€ние. ”казание.  оординаты точек занести в массив.


public class Task4 {

	public static void main(String[] args) {
		int x[]=new int [] {3, 4, 7, 8};
		int y[]=new int [] {2, 4, 6, 9};
		int i=0;
		int j=0;
		System.out.print(maxdistance(x,y,i,j)[0]+" "+ maxdistance(x,y,i,j)[1]);

	}
	
	public static int[] maxdistance(int x[], int y[], int i, int j) {
		double maxdis=Double.MIN_VALUE;
		
		int numberpoint[] =new int [2];
		for(i=0;i<x.length;i++) {
			for(j=0;j<y.length;j++) {
				if(maxdis<distance(x,y,i,j) && i!=j) {
					maxdis=distance(x,y,i,j);
					numberpoint[0]=i;
					numberpoint[1]=j;
				}
			}
		}

		return numberpoint;
	}
	
	public static double distance(int x[], int y[], int i, int j) {
			double dis=0;
			dis=Math.sqrt((Math.pow(x[i]-x[j], 2))+(Math.pow(y[i]-x[j], 2)));
			return dis;

	}

	

	
	
}
