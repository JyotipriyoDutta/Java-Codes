import java.util.*;
public class Best_Time_To_Buy_And_Sell_Stocks 
{
	public static void main(String args[])
    {
		Scanner in=new Scanner(System.in);
       // int n=prices.length;
		int n;
		System.out.println("Enter the value of n");
		n=in.nextInt();
		int prices[]=new int[n];
		for (int k=0;k<n;k++)
		{
			prices[k]=in.nextInt();
		}
        int p=0;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
        {
            if (prices[i]<min)
                min=prices[i];
            else if (prices[i]-min>p)
                p=prices[i]-min;
            
        }
        System.out.println(p);
    }
}
