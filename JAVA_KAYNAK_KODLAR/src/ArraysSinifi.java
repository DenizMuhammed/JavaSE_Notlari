
import java.util.Arrays;
// not: static metodlar objesini oluþturmadan sýnýf üzerinden çaðýrýlabilir.
public class ArraysSinifi {

	public static void main(String[] args) {
	
	
		
 int [] d1 = {4,5,4,3,7,5,8,4,2,8,99};
	

 
 
 // dizinin ilk n elemanýný kopyalama
 int[] d2=new int [10];
 System.out.println("ilk dizi boyutu: "+d2.length); 
 d2=Arrays.copyOf(d1, 3); // d2 referansý yeni objeye atandýðý için yukarýdaki 10 elemanlý dizi memory leak oluþturdu.
 
 for(int i: d2)
 {
	 System.out.print(i+" "); 
 }
 
 System.out.println("\n yeni dizi boyutu: "+d2.length);
 
 
 
 System.out.println("*****************************************************************************");
 
 // dizinin bir kýsmýný kopyalama
 
 int[] d3 = Arrays.copyOfRange(d1, 4, 7);
 
 System.out.print("4,7 arasý d1: ");
 for(int i: d3)
 {
	 System.out.print(i+" ");
 }
 
 System.out.println("\n*****************************************************************************");
 // dizinin belirli elemanlarýný bir deðer ile doldurma
 Arrays.fill(d1, 2, 6, 2023);
 
 for(int i: d1)
 {
	 System.out.print(i+" ");
 }
 
 System.out.println("\n****************************************************************************");
 // dizinin elemanlarýný sýralamaya yarar
 
 Arrays.sort(d1);
 for(int i: d1)
 {
	 System.out.print(i+" "); 
 }
 
 System.out.println("\n****************************************************************************");
 // dizi içinde bir elemanýn olup olmadýðýný öðrenme:
 // Aranan eleman dizi içinde var ise; dizinin içindeki indisini verir.
 // DÝZÝNÝN SEARCH EDÝLMEDEN ÖNCE SORT METODU ÝLE SIRALANMIÞ OLMASI GEREKLÝDÝR !!!!
 int index = Arrays.binarySearch(d1, 99);
 System.out.println("aranan elemanýn index : "+ index);
 
 // Soru: Girilen dizideki elemanlarý ayný sýra ile ama her eleman en fazla 1 kez kullanýlarak baþka bir
 //diziye kaydedin
 
 System.out.println("\nSORU CEVABI: ");
 int[] dizi1= {93,3,13,6,6,7,8,9,10,11,11,12,12,13,14,14,15};

 
 int[] dizi2 = new int[dizi1.length];

 int indis=0;
 boolean Var=false; // elemanýn dizide olup olmadýðýný kontrol etme
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