

public class MultiReturns {
	
	int ints;
	double doubles;
	boolean booleans;
	String strings;
	
	MultiReturns fonk(int i, double d, boolean b, String s)
	{
		this.ints=i*3;
		this.doubles=d/7;
		this.booleans=b & false;
		this.strings=s + "selam";
		 return this;
	}

}
