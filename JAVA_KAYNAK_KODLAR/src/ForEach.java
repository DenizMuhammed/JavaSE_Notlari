
public class ForEach {

	public static void main(String[] args) {
		
		
		int[] dizi = {1,55,6,544,5,66,4,33,0};
		
		for (int i:dizi)
		{
			// for'un bu �ekilde kullan�m� dizinin elemanlar�na sadece ula�maya yarar. Yani diziye de�er atayamaz.
			System.out.println(i*2);
			dizi[0]=44; // bu atama yap�ld�. Nas�l ?????
		}
		System.out.println(dizi[0]);
	}

}



