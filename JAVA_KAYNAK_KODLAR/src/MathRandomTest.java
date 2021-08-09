
public class MathRandomTest {

	public static void main(String[] args) {
	
		
		double d=0.0;
		long s=0;
		for(; s<1E5; s++)
		{
			double w=Math.random();
			d += w*w*w;
		}
		
		d= d/s;
		
		System.out.println(d);

	}

}
