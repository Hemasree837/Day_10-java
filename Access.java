// used to access member
public class Access {
    void display()
    {
        System.out.println("hello Jithu");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[])
    {
        Access o=new Access();
        o.dis1();
    }
    
    
}