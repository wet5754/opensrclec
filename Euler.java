package main;

public class Euler {
	void show() {
		double pi =0;
		for(int i=0;i<5000;i++) {
			pi+=1/Math.pow((i+1),2);
		}
		System.out.println("Euler : "+Math.sqrt(pi*6));
	}
}
