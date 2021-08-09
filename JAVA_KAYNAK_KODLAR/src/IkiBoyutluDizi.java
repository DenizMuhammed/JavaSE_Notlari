
public class IkiBoyutluDizi {

	public static void main(String[] args) {
	
		int[][] dizi = new int[4][];
		
		dizi[0]= new int[6];
		dizi[1]= new int [13];
		dizi[0][0]=41;
		dizi[0][1]=521;
		
		System.out.println(dizi[0][0]);
		System.out.println(dizi[0][1]);
		
		System.out.println(dizi.length);
		System.out.println(dizi[1].length);
		
		System.out.println(dizi);
		System.out.println(dizi[0]);
		
		// dizi elemanlarýnýn uzunluklarýný random belirleme:
		
		for (int j=0,indis=0; j<dizi.length;j++)
		{
	     indis = (int) (1+10*Math.random());
	      
	     dizi[j]= new int[indis];
	     
		}
		
		// boþ diziyi yazdýrma:
		
		for(int j=0; j<dizi.length;j++)
		{
		for(int i: dizi[j])
		{
		  	System.out.print(dizi[j][i]);
		}
		System.out.println(" ");
		}
		
		// boþ diziyi rast gele deðerlerle doldurma ve yazdýrma
		
		
		for(int j=0; j<dizi.length;j++)
		{
		for(int i: dizi[j])
		{
			dizi[j][i]= (int) (2021*Math.random());
		  	System.out.print(" "+ dizi[j][i] +" ");
		}
		System.out.println(" ");
		}

}
}
