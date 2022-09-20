package odev2;

import java.util.Iterator;

public class loopDemo {

	public static void main(String[] args) {
		// For Döngüsü
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println(i);
		}
		System.out.println("For Döngü Bitti!!");

		
		
		// While Döngüsü
		int i =1;
		while(i<10)
		{
			System.out.println(i);
			i+=2;
			
		}
		System.out.println("While Döngü Bitti!!");
		
		// Do-While Döngüsü
		int j=10;
		do 
		{
			System.out.println(j);
			j+=2;
			
			
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti!!");
		
	}

}
