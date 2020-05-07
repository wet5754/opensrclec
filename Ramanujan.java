package main;

public class Ramanujan {
	void show() {
		double pi = 0;
		for(int i=0;i<20;i++) 
			pi+=fact(4*i)*(1103+26390*i)/(Math.pow(fact(i), 4)*Math.pow(396, 4*i));
		System.out.println("Ramanujan : "+1/(pi*Math.sqrt(8)/9801));
	}
	double fact(int n) {
		if(n==0) return 1.0;
		else return fact(n-1)*n;
	}
}
