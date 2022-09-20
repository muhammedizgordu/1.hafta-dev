package odev2;

public class recapMukemmelSayi {

	public static void main(String[] args) {
		// Mükemmel sayı 
		int number=6;
		int total=0;
		for(int i=1;i<number;i++) {
			
			if(number%i==0) {
				
				total=total+i;
			}
		}
		if(total==number) {
			
			System.out.println("Sayı mükemmel");
		}
		else {
			System.out.println("Sayı mükemmel değil !!!!!");
		}
	}

}
