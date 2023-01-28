import java.util.*;
class demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = n*n;
        int a = 0;
        while(n>0){
            if(n%10!=sqr%10){
                a++;
                break;
            }
            n/=10;
            sqr/=10;
        }
        if(a==1){
            System.out.println("Not an Automorphic Number");}
        else{
            System.out.println("Automorphic Number");
        }
    }
}