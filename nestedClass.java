/*import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        //we need to create object for the outer class
        outer outobj = new outer();
        //creating an object for the nested class using outer class object
        outer.nested nestedobj = outobj.new nested();
        nestedobj.display();
        String hello = "Print String revsersed";
        String reversedstring="";
        
        for(int i = hello.length()-1 ;i>=0;i--)
        {
            reversedstring += String.valueOf(hello.charAt(i));
            
        }
        System.out.println(reversedstring);
        
    }
}



class outer
{
    public String var1;
    private String var2;
    public String var3;
    public static int count=1;
    
    public outer()
    {
        var1 = "test1";
        var2 = "test2";
        var3 = "test3";
    }
    
    public void display_nestedclassvariable()
    {
        //System.out.println(nestedvar);
    }
    //this is a nested class
    //declare a datamember for my nested class
    //can not have static data memeber and methods in our nested class becuase we nedd object from outer class
    // since static does not use objects
    public class nested// inner class: a class that is not static and is nested or is defiend inside another class  
    {
        public String nestedvar;
        public nested()
        {
            nestedvar = "nestedvalue";
        }
        public void display()
        {
            System.out.println(var1+var2+var3 + count);
        }
        
        
    }
    
}*/