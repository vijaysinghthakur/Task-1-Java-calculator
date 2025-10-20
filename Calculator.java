import java.util.*;
import java.util.Scanner;
public class Calculator{
    public static double add(double a,double b){
        return a+b;
    }

    public static double sub(double a,double b){
        return a-b;
    }

     public static double  multiply(double a,double b){
        return a*b;
    }

     public static double divide(double a,double b){
        if(b==0){
            System.out.println("caution: you cannot divide by Zero");
            return 0;
        }
        return a/b;
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        while(true){
            System.out.println("\n=== Java Calculator ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Substraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Divison (/)");
            System.out.println("5. Exit (=>)");

            System.out.println("select any option from 1-5 to perform your operation");

            int choice=sc.nextInt();

            if(choice==5){
                System.out.println("Thanks for Using our java calculator");
                break;
            }

            System.out.println("Enter first number");
            double num1=sc.nextDouble();

             System.out.println("Enter Second  number");
            double num2=sc.nextDouble();


            double result =0;

            switch (choice) {
                case 1:
                    result=add(num1,num2);
                    break;
                case 2:
                    result=sub(num1,num2);
                    break;

                case 3:
                    result=multiply(num1,num2);
                    break;


                case 4:
                    result=divide(num1,num2);
                    break;
            
                default:
                     System.out.println("Invalid Choice Try Once Again!...");
                    break;
            }
            System.out.println("Result = " + result);
        }
        sc.close();

    }
    
}
   