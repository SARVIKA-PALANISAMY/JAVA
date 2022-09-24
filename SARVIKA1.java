import java.util.*;
public class Main
{
	public static void main(String[] args) {
       int x, y, temp; 
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X");  
       x = sc.nextInt();
       System.out.println("Enter the value of Y");  
       y = sc.nextInt();  
       System.out.println("Before Swapping the Numbers: "+x +"  "+ y);  
       x=x+y;  
       y=x-y;
       x=x-y;
       System.out.println("After swapping: "+x +"   " + y);  
	}
}
