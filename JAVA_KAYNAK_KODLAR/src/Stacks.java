
public class Stacks {
	
	public static final int MAX_SIZE=20;
	
	int SP=0; // stack pointer
	int [] ST = new int[MAX_SIZE]; // stack dizisi
	
	
	public void push(int yeniEleman) // eleman ekleme
	{
	
	 if(this.SP<MAX_SIZE)
		 this.ST[this.SP++]=yeniEleman;
	 else
		 System.out.println("STACK IS FULL ");
	}
	
	public void pop ()
	{
		if(this.SP>0)
			this.ST[--this.SP]=0;
		else
			System.out.println("STACK IS EMPTY");
			
		
	}
	
	public void stackShow() // yýðýnýn içini gösterme
	{
		for(int i=0;i<this.ST.length;i++)
		{
			System.out.println(this.ST[i]);
		}
	}
	
	public int stackPointerNow() // yýðýn iþaretçisinin o anki deðeri
	{
		System.out.println("SP -> "+ this.SP);
		return this.SP;
	}
	
	public boolean stackIsFull() // stack dolu ise true deðil ise false döndürür.
	{
		if(this.SP==MAX_SIZE)
			return true;
		else
			return false;
			
	}
	
	public boolean stackIsEmpty() // stack boþ ise true, deðil ise false döndürür.
	{
		if(this.SP==0)
			return true;
		else
			return false;	
	}
	
	
	
	

}
