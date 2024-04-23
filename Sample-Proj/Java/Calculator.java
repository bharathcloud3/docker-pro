public class Calculator{
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args){
        double a = 10;
        double b = 5;

        System.out.println("Addition: " + add(a,b));
        System.out.println("Subtraction: " + subtract(a,b));
        System.out.println("Multiplication: " + multiply(a,b));
        System.out.println("Division: " + divide(a,b));
    }
}