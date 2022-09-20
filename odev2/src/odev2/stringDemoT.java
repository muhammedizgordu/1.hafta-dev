package odev2;

public class stringDemoT {

	public static void main(String[] args) {
		// String ile çalışmak 2. Demo

		String mesaj = " !  Bugün Hava Çok Güzel! ";
		System.out.println(mesaj);
		String newMesaj = mesaj.replace(' ', '-');
		System.out.println(newMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
	}

}
