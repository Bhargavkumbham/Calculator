import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n. Simple Calculator   ");
            System.out.println("1. Add");
            System.out.println("2. Subtract"); 
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you");
                break;
            }
            
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            double result = 0;
            
            if (choice == 1) {
                result = add(num1, num2);
            } else if (choice == 2) {
                result = subtract(num1, num2);
            } else if (choice == 3) {
                result = multiply(num1, num2);
            } else if (choice == 4) {
                result = divide(num1, num2);
            }
            
            System.out.println("Result: " + result);
        }
        
        sc.close();
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        return a / b;
    }
}
