/*import java.util.*;


 

class Main
{
    public static void main(String args[])
    {
      //  System.out.println("Hello World");
      student s = new student("Satish","12bc");
    //s.display_details();
    s= null;
    //System.gc();
    Runtime.getRuntime().gc();
    
    //Runtime.get
    
    }
}


class student
{
    public String name;
    public String regno;
    public student(String name, String regno)
    {
        this.name=name;
        this.regno=regno;
    }
    public void display_details()
    {
        System.out.println(this.name + " " + this.regno);
    }
    
    @Override
    protected void finalize()
    {
        System.out.println("This is the finalize method ");
    }
}*/