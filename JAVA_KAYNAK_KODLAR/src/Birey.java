
public class Birey {
	
	String isim;
	String soyAd;
	int yas;
	int kp;
	int puan;
	String sehir;
	Otomobil arac;
	
	public int cezaPuan(int p)
	{
		
		puan+=p;
		if(puan<0)
		{
			puan=0;
			return puan;
		}
			
		else if(puan>100)
		{
			System.out.println("ARA« TRAF›KTEN MEN ED›LD›.");
			this.arac= null;
		    return puan;
		}
		else
			return puan;
	}
	

}
// bu yorum nano edit√∂r√º ile eklendi. 12.08.2021
