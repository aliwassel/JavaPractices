/*
import java.util.Scanner;







//nested class exercises 
class Main 
{
    public static void main(String []args)
    {
        //A faculty memeber can have multiole degrees. You should be able to print the faculy name 
        //along with the list of degrees that has been awarded to him
        //faculty f1 = new faculty("satish", "222");
        // create object of degree class (inner class)
        /*faculty.degree degreeobj = f1.new degree("Btech", "2020","VIT");
        degreeobj.display_degreedetails();*/
        //create array of degree objects 
        /*faculty f1 = new faculty("satish","222");
        faculty.degree degobj[] = new faculty.degree[2];
        Scanner input = new Scanner(System.in);
        String dname;
        String year;
        String givenby;
        for(int i=0;i<degobj.length;i++)
        {
            System.out.println("Enter the degree name, awarded year and given by: ");
            dname=input.nextLine();
            year=input.nextLine();
            givenby = input.nextLine();
            degobj[i] = f1.new degree(dname,year,givenby);
            
        }
        f1.display_facultydetails(degobj);
    }
}
*/
/*class faculty
{
    private String name;
    private String empid;
    
    public faculty(String iname,String iemp)
    {
        this.name  = iname;
        this.empid = iemp;
    }
    
    public class degree
    {
        //datamemeber for degree class 
        public String degree_name;
        public String awarded_year;
        public String awarded_by;
        
        public degree(String idname, String iyear, String iawardedby)
        {
            degree_name = idname;
            awarded_year= iyear;
            awarded_by  = iawardedby;
            
        }
        
        public void display_degreedetails()
        {
            System.out.println("The faculty name is " + name);
            System.out.println("The employee id is " + empid);
            System.out.println(degree_name + " " + awarded_year + " " + awarded_by);
        }
        
    
    }
    public void display_facultydetails(degree d[])
    {
        System.out.println("The name of the faculty is " + name);
        System.out.println("The employee id is " + empid);
         
    for( degree k:d)
    {
        System.out.println(k.degree_name +" "+ k.awarded_year +" " + k.awarded_by);
    }



        
    }
    
    
    
   
}
*/