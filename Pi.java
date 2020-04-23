package main;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 0;
		for(int n=1;n<5000;n++) 
			pi += Math.pow(-1, (n+1))/(2*n-1);	
		System.out.println(pi*4);
	}

}
