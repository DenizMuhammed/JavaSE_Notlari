
import java.util.Arrays;
// not: static metodlar objesini olu�turmadan s�n�f �zerinden �a��r�labilir.
public class ArraysSinifi {

	public static void main(String[] args) {
	
	
		
 int [] d1 = {4,5,4,3,7,5,8,4,2,8,99};
	

 
 
 // dizinin ilk n eleman�n� kopyalama
 int[] d2=new int [10];
 System.out.println("ilk dizi boyutu: "+d2.length); 
 d2=Arrays.copyOf(d1, 3); // d2 referans� yeni objeye atand��� i�in yukar�daki 10 elemanl� dizi memory leak olu�turdu.
 
 for(int i: d2)
 {
	 System.out.print(i+" "); 
 }
 
 System.out.println("\n yeni dizi boyutu: "+d2.length);
 
 
 
 System.out.println("*****************************************************************************");
 
 // dizinin bir k�sm�n� kopyalama
 
 int[] d3 = Arrays.copyOfRange(d1, 4, 7);
 
 System.out.print("4,7 aras� d1: ");
 for(int i: d3)
 {
	 System.out.print(i+" ");
 }
 
 System.out.println("\n*****************************************************************************");
 // dizinin belirli elemanlar�n� bir de�er ile doldurma
 Arrays.fill(d1, 2, 6, 2023);
 
 for(int i: d1)
 {
	 System.out.print(i+" ");
 }
 
 System.out.println("\n****************************************************************************");
 // dizinin elemanlar�n� s�ralamaya yarar
 
 Arrays.sort(d1);
 for(int i: d1)
 {
	 System.out.print(i+" "); 
 }
 
 System.out.println("\n****************************************************************************");
 // dizi i�inde bir eleman�n olup olmad���n� ��renme:
 // Aranan eleman dizi i�inde var ise; dizinin i�indeki indisini verir.
 // D�Z�N�N SEARCH ED�LMEDEN �NCE SORT METODU �LE SIRALANMI� OLMASI GEREKL�D�R !!!!
 int index = Arrays.binarySearch(d1, 99);
 System.out.println("aranan eleman�n index : "+ index);
 
 // Soru: Girilen dizideki elemanlar� ayn� s�ra ile ama her eleman en fazla 1 kez kullan�larak ba�ka bir
 //diziye kaydedin
 
 System.out.println("\nSORU CEVABI: ");
 int[] dizi1= {93,3,13,6,6,7,8,9,10,11,11,12,12,13,14,14,15};

 
 int[] dizi2 = new int[dizi1.length];

 int indis=0;
 boolean Var=false; // eleman�n dizide olup olmad���n� kontrol etme
 for(int i=0; i<dizi1.length;i++,Var=false)
 {
   
	 for(int j=0; j<dizi2.length;j++)
	 {
		 if(dizi1[i]==dizi2[j])
		 {
			 Var=true;
			 break;
		 }
		
	 }
	 
	 if(Var==false)
	 {
		 dizi2[indis++]=dizi1[i];
		 
	 }

	 
 }
 
 
 for(int i: dizi2)
	 System.out.print(" "+i);

 }
 }