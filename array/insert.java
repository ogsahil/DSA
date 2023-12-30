import java.util.*;

public class insert {
    public static void main(String[] args) {
        System.out.println("HERE WE ARE GOING TO ADD ELEMENTS TO AN ARRAY: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        System.out.println("Elements are insert in the array!!!");
        scan.close();
    }
}