package odev2;

public class recapDemoSesliHarfler {

	public static void main(String[] args) {
		// Kalın ve İnce Sesli Harfler Demo
		char harf='i';
		switch (harf) {
		// " | " işareti veya anlamında kullanılır.
		case'A'|'a':
		case'I'|'ı':
		case'O'|'o':
		case'U'|'u':
			System.out.println("Kalın sesli harfler");
			break;
			default:
				System.out.println("İnce sesli harfler");
		}
		
		

	}

}
