import java.util.*;
class Merge_Overlapping_Intervals 
{
	public static int[][] merge(int[][] intervals)
    {
        int i=0,s=-1,e=-1;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list=new ArrayList();
        int n=intervals.length;
        while (i<n)
        {
            if (s==-1)
            {
                s=intervals[i][0];
                e=intervals[i][1];
                i++;
            }
            else
            {
                if (intervals[i][0]<=e)
                {
                    e=Math.max(intervals[i][1],e);
                        i++;
                }
                else
                {
                    list.add(new int[]{s,e});
                    s=intervals[i][0];
                    e=intervals[i][1];
                    i++;
                }
                    
            }
        }
         if (s!=-1)
            {
                list.add(new int[]{s,e});
            }
          int[][] arr = new int[list.size()][2];
    return list.toArray(arr);
            
    }
    
    public static void main(String args[])
    {
    	Scanner in=new Scanner (System.in);
    	int i,n;
    	
    	System.out.println("Enter the size of the array");
    	n=in.nextInt();
    	int [][]a=new int[n][2];
    	for (i=0;i<n;i++)
    	{
    		a[i][0]=in.nextInt();
    		a[i][1]=in.nextInt();
    	}
        int[][] ans = merge(a);
        for(i=0;i<ans.length;i++)
            System.out.println(ans[i][0]+" "+ans[i][1]);
    }
}