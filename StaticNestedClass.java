/*
faculy is a class having two data memebers name and empid
Eliible leave is a nested static class inside faculty class 


class Main
{
    public static void main(String args[])
    {
        System.out.println("Hello World");
        
        //static nested class can not access non static memeber of the outer class
        // no need to create object for the nested class since it is static 
        faculty f1 = new faculty("Satish", "222");
        f1.l1.display_var();
    }
}

class faculty
{
    private String name;
    private String empid;
    private static int count=1;
    
    public faculty(String name,String empid)
    {
        this.name  = name;
        this.empid = empid;
    }
    // A static inner class method can not access non static data 
    //This is a static nested class 
    //The leaves are common for all faculty hence static
    // no need to create an Object of faculty to access static nested class
    
    // A static nested class cannot access the outer class non-static memebers.
    //A static nested class can access only static member of the outer class.
    //A static class can have a non- static variables and methods.
    // An object of the static nested class can be created and access using the object of the outer class
    public static class eligible_leave{
        
        public int var1;
        public static int el= 12; 
        public static int ml= 20;
        public static int cl= 10;
        
        
        public eligible_leave()
        {
            var1=12;
            
        }
        
        public void display_var()
        {
            System.out.println(var1);
        }
        public static void display_leavedetails()
        {
            System.out.println("The number of EL is "+ el);
            System.out.println("The number of ML is "+ ml );
            System.out.println("The number of CL is "+ cl);
            System.out.println(count);
        }
    }
    eligible_leave l1 = new eligible_leave();
    
}*/

