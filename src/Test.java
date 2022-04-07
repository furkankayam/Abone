
public class Test {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Abone abone = new Abone();
		abone.isim = "furkan";
		abone.bakiye = 200;
		abone.sehir = "Sivas";
		
		abone.dogalgaz_kullan(200);
		// direk bakiye erisimi
		// deger vermeyi unutma
		// tek tek isim degistirme
		 */
		
		GelismisAbone abone = new GelismisAbone("furkan", 200, "Istanbul");
		abone.bakiye_ogren();
	}

}
