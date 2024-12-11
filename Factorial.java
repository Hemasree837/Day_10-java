import java.util.*;
public class Factorial {
    int sum(int n)
    {
        if(n==0) return 1;
    return n*sum(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial f=new Factorial();
        int res=f.sum(n);
        System.out.println(res);
    }
}
