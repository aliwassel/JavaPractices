/*
//Enter multi line comment here



import java.util.Scanner;



class Main
{
    public static void main(String [] args)
    {
        // how to maintain at least 3 degree details for every faculty in the System
        //every faculy Object is associated with minimum of three degree objects
       faculty f[] = new faculty[2];
       
       
       for(int i=0; i<f.length;i++)
       {
           f[i] = new faculty();
           f[i].set_facultyDetails();
           
       }
       
       
       
       for(int i=0; i<f.length; i++)
       {
           f[i].print_facultyDetails();
       }
       
    }
    
}

class faculty
{
    private String empid;
    private String name;
    private degree deg[] = new degree[3];
    
    public class degree
    {
        private String degree_name;
        private String degree_awardedYear;
        
        public void set_degreeDetails()
        {
            Scanner inputdeg = new Scanner(System.in);
            System.out.println("Enter your Degree name ");
            degree_name =inputdeg.nextLine();
            System.out.println("Enter the degree awarded year");
            degree_awardedYear= inputdeg.nextLine();
            
        }
        public void printdegreeDetails()
        {
            System.out.println("The degree name is " + degree_name);
            System.out.println("The degree awarded year is "+ degree_awardedYear);
            
        }
    }
    
    public void set_facultyDetails()
    
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee id");
        empid = input.nextLine();
        System.out.println("Enter the employee name ");
        name = input.nextLine();
        // we need to get the three degree details for each faculty 
        for(int i=0; i<deg.length;i++)
        {
            deg[i] = new degree();
            deg[i].set_degreeDetails();
            
        }
    }
    
    
    
    
    
    public void print_facultyDetails(){
        System.out.println("Your empid is "+ empid);
        System.out.println("Your name  is "+ name);
        for(int i=0;i<deg.length;i++)
        {
            deg[i].printdegreeDetails();
        }
        
    }
}

*/