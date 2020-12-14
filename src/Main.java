import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập value mảng: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("nhập giá trị bất kì");
        int b = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == b) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                break;
            }else {
                System.out.println("không có trong mảng");
                break;
            }
        }


        System.out.println("mảng mới");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }

    }
}
