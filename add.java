import java.util.Scanner;   
public class add {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int sum=a+b; 
        int sub=a-b;
        int mul=a*b;
        System.out.println("Sum of two numbers is: "+sum); 
        System.out.println("Subtraction of two numbers is: "+sub);
        System.out.println("Multiplication of two numbers is:"+mul);

    }
    
}
