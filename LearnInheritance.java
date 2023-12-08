/*  This is the base class, which will perform only basic arithmetic functionalities
 *   Like addition and Substraction
*/

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}

/*
 * AdvancedCalculator is the derived class of Calculator
 * This class adds two new features Multiplication and division
 * This is an example of single inheritance
 */
class AdvancedCalculator extends Calculator {
    public int multly(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException exception) {
            System.out.println("Divivion by zero is not possible");
        }
        return -999;
    }
}

/*
 * This is an example of multilevel Inheritance
 * 
 */
class ScientificCalculator extends AdvancedCalculator {
    public double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    public double squareRoot(int num1) {
        return Math.sqrt(num1);
    }
}

public class LearnInheritance {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        System.out.println("Sum = " + calc.add(10, 15));
        System.out.println("Diff = " + calc.sub(10, 5));
        System.out.println("Product = " + calc.multly(10, 15));
        System.out.println("Quotient = " + calc.div(10, 0));
        System.out.println("Power = " + calc.power(4, 2));
        System.out.println("squareRoot = " + calc.squareRoot(100));
    }
}
