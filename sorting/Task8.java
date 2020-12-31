package by.sorting;


//p1/q1  pn/qn (p и q натуральные) Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания


public abstract class Task8 {

	public static void main(String[] args) {
		int p[]=new int[] {1, 3, 5, 7, 8};
		int q[]=new int[] {2, 4, 6, 9, 12};
		int n=1;
		int max=0;
		boolean check = false;
		
		for(int x:q){
			n*=x;
		}

		for(int i=0; i<q.length; i++){
			p[i]=p[i]*n/q[i];
			q[i]=n;
		}
		
		while(!check) {
			check=true;
			
			for(int i=0; i<p.length-1;i++) {
				if(p[i]>p[i+1]) {
					
					check=false;
					
					
					max=p[i+1];
					p[i+1]=p[i];
					p[i]=max;
				}
			}
		}
		
		for(int i=0; i<p.length;i++) {
			System.out.println(p[i]+"/"+q[i]);
		}
		
		
	}
}
