package Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int num[];

        num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Array 1: ");
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i] + " ");
            if (i == num.length - 2) {
                System.out.print( -7);
            }
        }
        System.out.print("\n");

        System.out.print("Array 2: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
