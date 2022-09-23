import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x[],a=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
            {
                a=a+x[i];
            }
        System.out.println(a);
    }
}