
public class VarArgsMethods {
	
	
	String isim="girilen degerlerin ortalamasýný alan fonksiyon ornegi";
	
	public double aritmatikOrtalama(double ... varArgs)
	{
		double deger=0.0d;
		for(int j=0;j<varArgs.length;j++)
		{
			deger+= varArgs[j]/varArgs.length;
			
			System.out.println(deger);
			
		}
		System.out.println("ortalama: "+deger);
		return deger;
	}

}
