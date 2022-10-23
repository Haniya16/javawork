import java.util.Scanner;

class evenodd {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int number;
        System.out.println("Enter any number to know either it is EVEN OR ODD.");
        number = ob.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }
    }

}