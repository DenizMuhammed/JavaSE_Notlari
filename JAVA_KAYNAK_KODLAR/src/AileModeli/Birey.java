package AileModeli;

public class Birey {

	String isim=" ";
	String soyAd=" ";
	String dogumTarihi="xx,xx,xxxx";
	
  Birey abi;
  Birey abla;
  Birey a�abey;
  Birey amcaK�z�;
  Birey amcaO�lu;
  Birey amca;
  Birey anne;
  Birey anneanne;
  Birey baba;
  Birey babaanne;
  Birey bacanak;
  Birey bac�;
  Birey bald�z;
  Birey �ocuk;
  Birey damat;
  Birey kuzen;
  Birey kar�;
  Birey koca;
  Birey[] day�=new Birey[3];
  Birey day�K�z�;
  Birey day�O�lu;
  Birey dede;
  Birey d�n�r;
  Birey ebe;
  Birey elti;
  Birey eni�te;
  Birey gelin;
  Birey g�r�mce;
  Birey halaK�z�;
  Birey halaO�lu;
  Birey hala;
  Birey teyze;
  Birey torun;
  Birey ye�en;
  Birey yenge;
  
  
  boolean isim()
  {
	  if(this.isim==null)
		  return false;
	  else
	  {
		  System.out.println("isim: "+ this.isim);
		  return true;  
	  }

  }
	
}
