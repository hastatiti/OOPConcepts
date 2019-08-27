// A simple program to Test Interface default 
// methods in java 
interface MyInterface 
{ 
    public void square(int a); 
  
    default void show() 
    { System.out.println("Default Method Executed"); } 
} 
  
interface MyInterface2 
{ 
    public void square(int a); 
  
//    default void show() 
//    { System.out.println("Default Method Executed"); } 
} 

public class TestInterface implements MyInterface ,MyInterface2
{ 
    public void square(int a) 
    { System.out.println(a*a); } 
    
//    public void show() {
//    	System.out.println("Child default implementation");
//    }
  
    public static void main(String args[]) 
    { 
    	TestInterface d = new TestInterface(); 
        d.square(4); 
  
        // default method executed 
        d.show(); 
    } 
} 