package AileModeli;

public class Birey {

	String isim=" ";
	String soyAd=" ";
	String dogumTarihi="xx,xx,xxxx";
	
  Birey abi;
  Birey abla;
  Birey aðabey;
  Birey amcaKýzý;
  Birey amcaOðlu;
  Birey amca;
  Birey anne;
  Birey anneanne;
  Birey baba;
  Birey babaanne;
  Birey bacanak;
  Birey bacý;
  Birey baldýz;
  Birey çocuk;
  Birey damat;
  Birey kuzen;
  Birey karý;
  Birey koca;
  Birey[] dayý=new Birey[3];
  Birey dayýKýzý;
  Birey dayýOðlu;
  Birey dede;
  Birey dünür;
  Birey ebe;
  Birey elti;
  Birey eniþte;
  Birey gelin;
  Birey görümce;
  Birey halaKýzý;
  Birey halaOðlu;
  Birey hala;
  Birey teyze;
  Birey torun;
  Birey yeðen;
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
