
public class ForEach {

	public static void main(String[] args) {
		
		
		int[] dizi = {1,55,6,544,5,66,4,33,0};
		
		for (int i:dizi)
		{
			// for'un bu þekilde kullanýmý dizinin elemanlarýna sadece ulaþmaya yarar. Yani diziye deðer atayamaz.
			System.out.println(i*2);
			dizi[0]=44; // bu atama yapýldý. Nasýl ?????
		}
		System.out.println(dizi[0]);
	}

}



