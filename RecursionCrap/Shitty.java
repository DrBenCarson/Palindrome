
public class Shitty {
	
	
	public static String isItaPalindrome(String aa)
	{
		String zz[]=aa.split("\\s+");
		aa="";
		for (int n=0; n<zz.length;n++)
		{
			aa+=zz[n];
		}
		
		if (aa.substring(0, 1).equals(aa.substring(aa.length()-1,aa.length())))
		{
			if(aa.length()>1)
			{
				aa=""+aa.substring(1, aa.length()-1);
			}
			if (aa.length()>1)
			{
				isItaPalindrome(aa);
			}
			if(aa.length()<=1||(aa.length()%2==0)&&(aa.substring(0, 1).equals(aa.substring(aa.length()-1,aa.length()))))
			{
				return "Yes, this is a palindrome.";
			}
			if(!aa.substring(0,1).equals(aa.substring(aa.length()-1,aa.length())))
			{
				return "No, this isnot a palindrome, try again.";
			}
		
		}
	
	}
	
	
	
}	
