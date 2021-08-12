
public class MultiReturnsTest {

MultiReturns fonk = new MultiReturns();
	
	
	public MultiReturns multiReturns(int i,double d, boolean b, String s)
	{
		
		
		fonk.ints=i*i;
		fonk.doubles=d/7;
		fonk.booleans=b;
		fonk.strings=s;
		
		return fonk; 
		
	}  
	
	public static void main(String[] args) {
		
		 MultiReturns fon2;
	  
		
		//fon2=multiReturns(2,34.4,false,"çoklu returns örneði");
		
		//System.out.println(fon2.ints);
       
		

	
}


}
