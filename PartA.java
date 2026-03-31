import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int original = num;
        String binary = "";

        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                int remainder = num % 2;
                binary = remainder + binary;
                num = num / 2;
            }
        }

        System.out.println("Binary of " + original + " = " + binary);
    }
}
