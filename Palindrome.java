import java.util.*;
public class Palindrome
{
	public static void main (String args[])
	{
		Scanner in=new Scanner(System.in);
		int c=0;
		Node dummy=new Node(-1);
        //Node head2=head;
		
        Node head1=dummy;
        Node head2=dummy;
        Node head4=dummy;
        
        while (c!=4)
        {
        	int num=in.nextInt();
        	Node head=new Node(num);
            dummy.next=head;
            dummy=dummy.next;
            c++;
            //dummy=dummy.next;
        }
        int a[]=new int[5];
        int i=0,f=0;
       while (head1!=null)
       {
    	   a[i]=head1.val;
    	   head1=head1.next;
    	   i++;
       }
       for (int j=1;j<i;j++)
       {
    	   if (a[j]!=a[i-j])
    	   {
    		   f=1;
    		   break;
    	   }
       }
       if (f==1)
    	   System.out.print(false);
       else
    	   System.out.print(true);
	}
}
