import java.util.*;
class PrintingArrayList
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Accepting array list elements
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
         //Printing the elements in an ArrayList
         for(int i=0;i<a.size();i++)
        System.out.print(a.get(i)+" ");
    }
}
/*5
1 23 4 5 7
1 23 4 5 7 */