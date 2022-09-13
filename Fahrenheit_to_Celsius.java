import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        int c;
        Scanner sc= new Scanner(System.in);
        float f;
        c = sc.nextInt();
        f = (float)((c-32)/1.8);
        System.out.format("%.2f",f);
    }
}