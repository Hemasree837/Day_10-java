public class Normalfib {
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        System.out.println("0 ->"+a);
        System.out.println("0 ->"+a);
        for(int i=2;i<=10;i++)
        {
            int c=a+b;
            System.out.println(i+" ->"+c);
            a=b;
            b=c;
        }
    }
}
