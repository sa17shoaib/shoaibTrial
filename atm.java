import java.util.*;
class atm
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t,n,k,i;
        String s;
        t=sc.nextInt();
        while(t!=0)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            int a[]=new int[n];
            s="";
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(i=0;i<n;i++)
            {
                if(k>=a[i])
                {
                    s+="1";
                    k=k-a[i];
                }
                else
                    s+="0";
            }
            System.out.println(s);
            t--;
        }
    }
}