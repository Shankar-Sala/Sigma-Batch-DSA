import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String input = sc.nextLine();
        // System.out.println(input);

        // int number =sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // double value = sc.nextDouble();
        // System.out.println(value);

        System.out.print("Are you above 18?- ");
        boolean bn = sc.nextBoolean();
        if (bn == true) {
            System.out.println("You are over 18");
        } else if (bn == false) {
            System.out.println("You are under 18");
        }
        sc.close();
// self study
    //  nextLong
    //  nextShort

    }

}
