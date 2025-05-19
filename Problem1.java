import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); 
    }

  
    void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid operation type!");
        }
    }
}

public class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        sc.nextLine(); 
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine();


        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        sc.close();
    }
}
