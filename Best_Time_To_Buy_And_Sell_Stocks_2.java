import java.util.Scanner;

public class Best_Time_To_Buy_And_Sell_Stocks_2 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=in.nextInt();
		int prices[]=new int[n];
		for (int k=0;k<n;k++)
		{
			prices[k]=in.nextInt();
		}
		int i,j,profit=0;
		
		for (i=0;i<n-1;i++)
		{
     
				if (prices[i+1]>prices[i])
				{
					profit=profit+(prices[i+1]-prices[i]);
                 
                 
				}
			
		}
		System.out.println(profit);
	}
}
