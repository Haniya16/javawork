import java.util.*;

class datatype {
    public static void main(String args[]) {
        System.out.println("Variable for Datatypes.");
        Scanner ob = new Scanner(System.in);
        int number;
        float decimalnumber;
        char alphabet;
        System.out.println("Enter the Integer type data:");
        number = ob.nextInt();
        System.out.println(number);
        System.out.println("Enter the Float type data:");
        decimalnumber = ob.nextFloat();
        System.out.println(decimalnumber);
        System.out.println("Enter the Character type data:");
        alphabet = ob.next().charAt(0);
        System.out.println(alphabet);
    }
}