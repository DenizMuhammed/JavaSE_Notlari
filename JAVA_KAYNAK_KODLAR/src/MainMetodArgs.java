
public class MainMetodArgs {

	// Main e arg�man girme: eclipse, run, run configurations, Arguments
	//
	public static void main(String[] args) {
		
		int sayac=1;
		System.out.println("Main'e ge�ilen arg�manlar: ");
		for(String i:args)
		{
			System.out.println("arg�man "+(sayac++)+" : "+ i);
		}

	}

}
