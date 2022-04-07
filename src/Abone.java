// dogalgaz abonesi
public class Abone {
	public String isim;
	public int bakiye;
	public String sehir;
	
	public void dogalgaz_kullan(int miktar) {
		if ((this.bakiye - miktar) < 0) {
			System.out.println("Yeterli bakiye yok...");
		}
		else {
			this.bakiye -= miktar;
			
			if (this.bakiye <= 0) {
				System.out.println("bakiyeniz bitmistir. Lutfen en yakin abone merkezine giderek kredi yukleyin"
						+ " Kredi Limiti : 120 TL"
						);
			}
		}
	}public void bakiye_ogren() {
		System.out.println("Bakiye: " + bakiye);
	}
}
