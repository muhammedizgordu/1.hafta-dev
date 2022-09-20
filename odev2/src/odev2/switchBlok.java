package odev2;

public class switchBlok {

	public static void main(String[] args) {
		// Switch Blokları ile çalışma
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'C':
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");

		}

	}

}
