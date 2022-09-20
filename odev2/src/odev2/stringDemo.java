package odev2;

public class stringDemo {

	public static void main(String[] args) {
		// Strinler ile çalışmak
		String mesaj = "Bugün Hava Çok Güzel!";

		System.out.println(mesaj);
		System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("A"));
		char[]karakterler=new char[5];
		mesaj.getChars( 0,5,karakterler ,0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('Ç'));
		System.out.println(mesaj.lastIndexOf('ü'));
		
		
		
		
	}

}
