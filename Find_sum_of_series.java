import java.util.Scanner;
class GFG
{
    static double sum(int n)
    {
        double i, s = 0.0;
        for (i = 1; i <= n; i++)
        s = s + 1/i; return s; } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.format("%.2f",sum(n)); }}