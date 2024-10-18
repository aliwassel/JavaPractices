/*
package JavaPactices;




public class Main
{
	public static void main(String[] args) {
	    test1 t = new test1();
	    t.onClick();
	
	}
}



interface button
{
    void setButtonColor();
    void setButtonText();
    void onClick();
    default void testmethod() //Deafult methods specific to this interface 
    {
        System.out.println("This is test method");
        
    }
}


interface threedimension extends button
{
    void location(int x, int y, int z);
    
   
}


interface twodimension extends button
{
    void location(int x, int y);
}

class test1 implements button
{
    
    @Override
    public void setButtonColor(){}
    @Override
     public void setButtonText(){}
    @Override
    public void onClick()
    {
        button.super.testmethod();// call this method from parent interface 
    }
    
}


class form implements threedimension,twodimension //multiple inheritance 
{
    @Override
    public void location(int x, int y, int z)
    {
        
    }
    
    @Override
    public void location(int x, int y)
    {
        
    }
    @Override
    public void setButtonColor()
    {
        
    }
    
    @Override
    public void setButtonText()
    {
        
    }
    
    @Override
    public void onClick()
    {
        
    }
    public void testmethod()
    {
        System.out.println("This is tes method overriden");
    }

}

class reservation implements button
{
    String color;
    String text;
    
    @Override
     public void setButtonColor()
    {
        color = "blue";
        
    }
    
    
    @Override
     public void setButtonText()
    {
        text = "Reserve Ticket ";
    }
    
    @Override
     public void onClick(){
        System.out.println(" Ticket is reserved ");
    }
}

class cancellation implements button
{
    String buttoncolor;
    String text;
    
    public void setButtonColor()
    {
        buttoncolor = "red";
    }
    public void setButtonText()
    {
        text = "Cancel ticket";
    }
    @Override
    public void onClick()
    {
        System.out.println("cancellation Successful");
    }
}








*/