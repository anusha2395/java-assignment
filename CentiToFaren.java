// WAP to convert from centigrade to farenheit. F=(9/5)*c+32

import java.util.Scanner;

public class CentiToFaren
{
	
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Celcius:");
		float d = input.nextFloat();
		System.out.println("entered:"+d);
		float f = (9/5)*d+32;
		System.out.println("Temperature in Farenheit is:"+f);
		
	}
	
}
