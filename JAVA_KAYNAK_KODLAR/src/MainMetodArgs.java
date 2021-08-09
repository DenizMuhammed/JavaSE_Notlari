
public class MainMetodArgs {

	// Main e argüman girme: eclipse, run, run configurations, Arguments
	//
	public static void main(String[] args) {
		
		int sayac=1;
		System.out.println("Main'e geçilen argümanlar: ");
		for(String i:args)
		{
			System.out.println("argüman "+(sayac++)+" : "+ i);
		}

	}

}
