import java.util.*;
public class SortString
{
	public static void main(String args[])
	{
	char t;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the string"); //take input from user//
	String a = in.nextLine();
	int len = a.length();
	char arr[] = new char[len];
	for(int i = 0;i < len;i++)
	{
		arr[i] = a.charAt(i);

	}
	for(int k = 0;k < len-1;k++)
	{
		for(int j = 0;j < len-1-k;j++)
		{
			if(arr[j] > arr[j+1])
			{
				t = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = t;
			}

		}
	}
	for(int m = 0;m < len;m++)
	System.out.print(arr[m]);
System.out.println("\n");
	


	}	


}
