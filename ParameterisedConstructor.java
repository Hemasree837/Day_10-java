//parametersied constructor
import java.util.*;
 class parameter  {
    int c;
    String b;
    parameter (int c,String b)
    {
        this.c=c;
        this.b=b;
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class ParameterisedConstructor{
public static void main(String args[])
{
parameter  s=new parameter (654,"Jithu");
    s.display();
}

    }