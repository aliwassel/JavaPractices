/*
Composition is Strong Association between two classes.
it is denoted by has a relationship between classes
the life time of the contain child object depends on parent object
Scenaario - every employee has a dependent.
*/



class Main
{
    public static void main(String []args)
    {
    
    }
}


class dependent
{
    String dependant_name;
    String dependant_gender;
    public dependent(String dname, String dgender )
    {
        this.dependent_name = dname;
        this.dependent_gender=dgender;
        
    }
    
    public void display_dependent()
    {
        System.out.print(dependent_name + " " +dependent_gender);
    }


}

class employee
{
    String name;
    String empid;
    dependent father;
    
    public employee(String name, String empid, String dname,String dgender)
    {
        this.name = name;
        this.empid=empid;
        father = new dependent(dname,dgender);
        //First employee object is created  
        
    }
    
    
    
    
}