

public class FinalKewordInVariables {
	
	final int x =43; // in pool memory
	//final int y;
	//y=55;        ----> bu kullaným hatalý
	
	final String myString ="merhaba"; // in pool memory

	public static void main(String[] args) {

  final int t;
  t=43;
  System.out.println(t);
  
  final float var2=(float) (Math.log10(Math.E*Math.PI)*(Math.E)*(Math.PI));
  System.out.println(var2);

	}

}
