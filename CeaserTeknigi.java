public class CeaserTeknigi {
	
	// şifreli metni çözme
	// alfabeden anahtar sayı kadar geri gidicek.
	// a ya geldiğinde z ye geçmesi gerek.
	
	public CeaserTeknigi(String metinString, int key) {
		answerString(metinString, key);
	}
	
	public String answerString(String metinString, int key) {
		
		// tanımlamalar
		String alphabetString = "abcçdefgğhıijklmnoöprsştuüvyz";
		String answerString = "";
		
		
		// şifreli metinin içinde gezme
		for (int i = 0; i < metinString.length(); i++) {
			char gecici = metinString.charAt(i); // şifreli metinden harf alma
			// boşluk mu ? 
			if (gecici == ' ') {
				answerString+= " ";
				continue;
			}
			// alfabedeki yerini bulma
			for (int j = 0; j < alphabetString.length(); j++) {
				if (gecici == alphabetString.charAt(j)) { // bulundu mu diye bakıyoruz
					// bulunduysa alfabede anahtar sayı kadar geri gidicez
					if (j < key) { // alfabedeki j. indeks anahtar sayıdan küçük ise
						int sayac = -1; // a harfine gelene kadar kaç adım ilerlediğini bulmak için
						// sayac -1 den başlıyor çünkü geriye gitmeden önce olduğu harfi de alıyor
						for (int j2 = j; j >= 0 ; j--) {
							sayac++; // ilerleme var
							if (j == 0) { // a ya geldiyse
								j = alphabetString.length(); // sona yani z harfine gittik
								answerString += alphabetString.charAt( j - (key - sayac) ); 
								// z harfinden a ya gelene kadar geçen adımları anahtar
								// sayıdan çıkardık
								break;
							}
						}
					}else { // alfabedeki j. indeks anahtar sayıdan büyük veya eşit ise
						answerString += alphabetString.charAt(j - key); 
						break;
					}
				}
			}
		}
		
		
		
		
		return answerString;
	}
	
}
