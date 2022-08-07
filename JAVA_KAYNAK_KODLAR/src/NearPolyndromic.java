
public class NearPolyndromic {

	
	long number;
	
	void showNearPolyndromic(long s)
	{
		long pol =findNearPolyndromic(s);
		
		if(pol!=-1)
		{
			System.out.println(this.number + " say�s�n en yak�n olan polindromik kom�u= "+ pol);
		}
	}
	
	long findNearPolyndromic(long s)
	{
		this.number=s;
		
		if(isPolyndromic(s))
		{
			System.out.println(this.number + " say�s�n en yak�n olan polindromik kom�u kendisidir!");
			return -1;
		}
		long up = upPolyndromic(s);
		long down = downPolyndromic(s);
		
		System.out.println(this.number +" say�s�n�n sa��ndaki polindromik say� = " +(this.number+up));
		
		System.out.println(this.number +" say�s�n�n solundaki polindromik say� = " +(this.number-down));
		
		
		if(up<down)
		{
			return number+up;
		}
		
		else if(up==down)
			
		{
			System.out.println(this.number + " bu iki polindromik kom�uya e�it uzakl�kta!");
			return -1;
		}

		
		else
		{
			return number-down;
		}
		
		
	}

	
	boolean isPolyndromic(long s)
	
	{
		String S="";
		String ST="";
		S=s+"";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			ST+=S.charAt(i);
		}
		
		//System.out.println("ST: "+ST);
		
		//System.out.println("S: "+S);
		
		if(Long.parseLong(ST)==Long.parseLong(S))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	long upPolyndromic(long s)
	{
		int j=0;
		
		while(++s<=Long.MAX_VALUE)
		{
			j++;
			
			if(isPolyndromic(s))
				break;
		}
		return j;
	}
	
	
	long downPolyndromic(long s)
	{
		int j=0;
		
		while(--s>=0)
		{
			j++;
			if(isPolyndromic(s))
				break;
		}
		return j;
	}

}
