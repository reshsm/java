import java.util.*;

class RemoveSpace
{
	public static void main(String[] args) 
	{	
		int n,i,n1;
		String statement1="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String statement = sc.nextLine();
		n = statement.length();
		
		for(i=0;i<n;i++)
		{
			if(statement.charAt(i)!=' ')
			{
				statement1=statement1+statement.charAt(i);
				
			}	
		}
		n1 = statement1.length();
		System.out.println("Old statement : "+statement+"\nsize : "+n);
		System.out.print("New statement : "+statement1+"\nsize : "+n1);
	}
}