
public class GelismisAbone {
	private String isim;
	private int bakiye = 120; // bakiye degeri vermezsek 120 den baslatilacak
	private String sehir;
	
	public GelismisAbone(String isim, int bakiye, String sehir) {
		this.isim = isim;
		
		if (bakiye>=0 && bakiye<=120) {
			this.bakiye = bakiye;
		}
		
		this.sehir = sehir;
	}
	public void bakiye_ogren() {
		System.out.println("Bakiye: " + bakiye);
	}
	
}
