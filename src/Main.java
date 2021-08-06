import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        x = scanner.nextInt();
        int index = check(number, x);
        if (index == -1) {
            System.out.println("Không có phần tử trong mảng");
        } else {
            remove(number, index);
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    public static int check(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] remove(int[] arr, int index) {
        for (int i = index; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
}