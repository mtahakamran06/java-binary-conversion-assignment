public class PartB {

    public static int[] toBinaryArray(int num) {

        int temp = num;
        int count = 0;

        while (temp > 0) {
            temp = temp / 2;
            count++;
        }

        int[] arr = new int[count];
        int i = 0;

        while (num > 0) {
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (int j = 0; j < count / 2; j++) {
            int tempVal = arr[j];
            arr[j] = arr[count - j - 1];
            arr[count - j - 1] = tempVal;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] result = toBinaryArray(27);

        System.out.print("Binary: ");
        for (int bit : result) {
            System.out.print(bit);
        }
    }
}
