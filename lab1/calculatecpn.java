import java.util.*;

class calculatecpn {
    public static void main(String args[]) {
        System.out.println("Enter the Marks to calculate the CPN:");
        Scanner mark = new Scanner(System.in);
        int testmarks;
        float matricpercentage, interpercentage;
        double cpn;
        System.out.println("Enter the Matric Percentage:");
        matricpercentage = mark.nextFloat();
        System.out.println(matricpercentage);
        System.out.println("Enter the Inter Percentage:");
        interpercentage = mark.nextFloat();
        System.out.println(interpercentage);
        System.out.println("Enter the Test Marks:");
        testmarks = mark.nextInt();
        System.out.println(testmarks);
        cpn = matricpercentage * 0.10 + interpercentage * 0.30 + testmarks * 0.60;
        System.out.println("The CPN is:");
        System.out.println(cpn + 2);
    }
}