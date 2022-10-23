import java.util.*;

class operators {
    public static void main(String args[]) {
        System.out.println("Different Operaters:");
        Scanner op = new Scanner(System.in);
        int number1, number2;
        System.out.println("Enter the two numbers to perform different Arthemathics Operations:");
        number1 = op.nextInt();
        number2 = op.nextInt();
        System.out.println("The Addition of two numbers is:");
        System.out.print(number1 + number2);
        System.out.println("The Subtraction of two numbers is:");
        System.out.println(number1 - number2);
        System.out.println("The Multiplicationi of two numbers is:");
        System.out.println(number1 * number2);
        System.out.println("The Division of two numbers is:");
        System.out.println(number1 / number2);
        System.out.println("The Reminder of two numbers is:");
        System.out.println(number1 % number2);
    }
}