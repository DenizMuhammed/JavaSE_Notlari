
public class Promotion {

	// ARÝTMATÝK YÜKSELTME ÝÞLEMLERÝ

	
	
	public static void main(String[] args) {
		
		double d=123.123;
		float f=12.2f;
		long l=42234543;
		int i=2016;
		short s=356;
		byte b=33;
		char c='a';
		boolean bo=false;
		
		
		Tiptest tip = new Tiptest();
		
		tip.tipBul(d+f);
		tip.tipBul(f+l);
		tip.tipBul(l+i);
		tip.tipBul(d+c);
		tip.tipBul(b+c);
		tip.tipBul(s+c);
		tip.tipBul(bo & !bo);
		
	 // instanceof keyword u araþtýr.
		
	
   
	}
	

}
