package main;

public class John {
	void show() {
		double pi =1;
		for(int i =1;i<5000;i+=2) 
			pi*=i/(i+1.0)*(i+2.0)/(i+1);
		System.out.println("John : "+1/(pi/2));
	}
}
