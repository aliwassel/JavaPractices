/*

two classes are in association relationship
when their objects are independent of each other and one Object uses the functionaly of the another Object
there is no ownership among the objects 
Life cycle of both the objects are independent of each other.
Professor views a student's profile

*/
/*import java.util.Scanner;


class Main
{
    public static void main(String[] args)
    {
       student s1 = new student("ram","12bc","986557");
       student s2 = new student("Ananad", "13bc","9865777");
       professor Satish = new professor();
       Satish.view_profile(s1);
       Satish.view_profile(s2);
    }
}


class student{
    
    String name;
    String regno;
    String phone;
    
    public student(String name, String regno, String phonenumber)
    {
        this.name  = name;
        this.regno = regno;
        this.phone = phone;
    }
    
    
    
    public String getInfo()
    {
        return(name+regno+phone);
    }
    
    

    
}
    
class professor
{
    public void view_profile(student s)
    {
       
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the id of the student");
        String input_regno = input.nextLine();
        if(input_regno.equals(s.regno))
        {
            System.out.println(s.getInfo());
        }
    }
}
*/