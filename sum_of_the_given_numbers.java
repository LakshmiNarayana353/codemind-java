import java.util.*;
class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int k=sc.nextInt();
        for(int j=0;j<=k;j++){
        int arr[]=new int[2];
        int c=0;
        for(int i=0;i<2;i++){
            arr[i]=sc.nextInt();
            c=c+arr[i];
            
        }
        System.out.println(c);
    }
    }
}