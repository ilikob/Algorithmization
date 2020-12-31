package by.arrayofarray.main;

/*ћагическим квадратом пор€дка n называетс€ квадратна€ матрица размера nxn, составленна€ из чисел 1, 2, 3,
..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. ѕостроить такой квадрат.*/


import java.util.Random;

public class Task16 {

	public static void main(String[] args) {
		int n=3;
		int[][] mas = new int[n][n];
	    int count = 1;
	    int x = n/2;
	    int y = mas.length-1;
	    int countodd = 1;

	    while (true){
	    	mas[(mas.length-1)-y][x] = countodd;
	        int countodd1=0;
	        countodd++;

	        if(x==mas.length-1) {
	        	x=-1;
	        }
	        
	        
	        if(y>=mas.length-1) {
	        	y=-1;
	        }
	        
	        
	        y++;
	        x++;
	        
	        
	        if (mas[mas.length-1-y][x] != 0) {
	        	y--;
	        }

	        for (int[] array:mas) {
	        	for (int z :array) {
	        		
	        		if(z == 0) {
	        			countodd1++;
	        		}
	        	}
	         }
	        
	        
	         if (countodd1==0) break;
	         }

	      
	    
	    
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}

	}

}
