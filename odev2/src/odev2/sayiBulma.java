package odev2;

public class sayiBulma {

	public static void main(String[] args) {
		// Sayı bulma
		int[] sayiar=new int[] {1,2,4,7,8,0};
		int aranacak=0;
		boolean varMi=false;
		
		for(int sayi:sayiar) {
			if(sayi==aranacak) {
				
				varMi=true;
				break;
				
			}
		}
		if(varMi) {
			System.out.println("Sayı mevcut");
		}
		else {
			System.out.println("Sayı mevcut değil");
		}

	}

}
