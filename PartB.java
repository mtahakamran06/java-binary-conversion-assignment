import java.util.Scanner;

public class PartB {

    // Function to convert integer to binary array
    public static int[] toBinaryArray(int num) {
        if (num == 0) return new int[]{0}; // special case for 0

        int temp = num;
        int count = 0;

        // Count number of bits
        while (temp > 0) {
            temp = temp / 2;
            count++;
        }

        int[] binary = new int[count];
        int i = count - 1;

        // Fill array from end to start
        while (num > 0) {
            binary[i] = num % 2;
            num = num / 2;
            i--;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] result = toBinaryArray(num);

        System.out.print("Binary: ");
        for (int bit : result) {
            System.out.print(bit);
        }
    }
}
