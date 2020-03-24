package VJIT.TDD_JUnitTask;

public class DelCharA {
	DelCharA c1;
 public	String delete(String str)
	{
		if(str.charAt(0)=='A'&&str.charAt(1)=='A')
		{
			return str.substring(2); 
		} 
		else if(str.charAt(0)=='A')
		{
			return str.substring(1);
		}
		else if(str.charAt(1)=='A')
		{
			return str.substring(0,1)+str.substring(2);
		}
		return str;
	}

}
