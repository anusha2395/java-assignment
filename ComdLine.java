
/*Write a program that prints 3 arguments taken from command line.*/

public class ComdLine
{
	
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Argument "+(i+1)+" is :"+args[i]);
		}
		
	}
	
	
}
