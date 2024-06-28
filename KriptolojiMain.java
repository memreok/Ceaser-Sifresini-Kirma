import java.util.Scanner;

public class KriptolojiMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ceaser Tekniği ile şifrelenen metni giriniz: ");
		String metinString = scanner.nextLine();
		System.out.print("Kaydırma anahtar sayısını giriniz: ");
		int key = scanner.nextInt();
		
		CeaserTeknigi soru1 = new CeaserTeknigi(metinString, key);
		String cevapString = soru1.answerString(metinString, key);
		System.out.println(cevapString);
		
		
	}

}
