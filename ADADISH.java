/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sn=new Scanner(System.in);
		int t=sn.nextInt();
		for(int j=0;j<t;++j)
		{
		    int n=sn.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;++i)
		    {
		        arr[i]=sn.nextInt();
		    }
		    int sum1=0,sum2=0;
		    Arrays.sort(arr);
		    for(int i=n-1;i>=0;--i)
		    {
		        if(sum1<sum2)
		        sum1+=arr[i];
		        else
		        sum2+=arr[i];
		    }
		    if(sum2>sum1)
		    System.out.println(sum2);
		    else 
		    System.out.println(sum1);
		}
	}
}
