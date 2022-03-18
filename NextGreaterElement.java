import java.util.*;
public class NextGreaterElement 
{
	public static void main (String args[])
	{
		Scanner in=new Scanner (System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int l=a.length-1;
		int i,c=0;
		for (i=0;i<5;i++)
		{
			a[i]=in.nextInt();
		}
		Stack <Integer> s=new Stack<>();
		for (i=4;i>=0;i--)
		{
			while(!s.isEmpty() && s.peek()<=a[i])
				s.pop();
			if (s.isEmpty())
			{
			//	System.out.println("-1");
				b[l]=-1;
				l--;
			}
			else
			{
				//System.out.println(s.peek());
				b[l]=s.peek();
				l--;
			}
			
			s.push(a[i]);
			
		}
		for (i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
	}
}
