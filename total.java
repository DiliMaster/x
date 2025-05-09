import java.util.*;

public class total {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Science marks  : ");
        int num1 = input.nextInt();

        System.out.print("Input English marks  : ");
        int num2 = input.nextInt();

        System.out.print("Input Maths marks    : ");
        int num3 = input.nextInt();

        int total = num1 + num2 + num3;
        double average = total / 3.0;

        System.out.println("Total Marks   : " + total);
        System.out.println("Average Marks : " + average);

        if (average >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
