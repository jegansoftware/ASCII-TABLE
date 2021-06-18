//File name Should be named as Asciii.java
package ASCII;
import java.util.*;
public class Asciii {
	private String str="";
	
	Scanner s=new Scanner(System.in);
	
	public String get()
	{
		System.out.printf("\nEnter String :\n");
		str=s.nextLine();
		return str;
	}
	
	public void print()
	{
		int i;
		char c;
		
		for(i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			
			System.out.printf("\n%c   %d",c,(int)c);
		}
	}

}
