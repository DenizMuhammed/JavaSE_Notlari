
public class Otomobil {
	
	
	int uretimTarihi;
	String model;
	int mesafe;
	int kazaPuan;
	String uretici;
	Birey sahip;
	
	
	int hareket(int h) 
	{
		mesafe+=h;
		return mesafe;
	}
	
	int kaza(int k)
	{
		kazaPuan+=k;
	if(kazaPuan>100)
	{
		this.sahip=null;
		return 0;
	}
	
	else
	{
		return kazaPuan;
	}
	}
	
	
	
	
	

}
