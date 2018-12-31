import java.util.*;

import java.lang.*;
public class Primecount

{

	public static void main(String args[])

	{

		int a,count,value=0,i,j,l,r,b;

		Scanner sc=new Scanner(System.in);

		l=sc.nextInt();

		r=sc.nextInt();
    		for(j=l;j<=r;j++)

    		{

			count=0;
		 	for(i=1;i<=j;i++)

		  	{

		    		if(j%i==0)

		    		{

		        		count++;

		    		}

      			}

		  	if(count==2)

		  	{

				value++;
					
		  	}

    		}

			     		System.out.println(value);


	}

}
