import java.util.*;
class demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=Math.sqrt(n);
        if(a-(int)a==0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}