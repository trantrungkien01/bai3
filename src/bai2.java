import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        do {
            System.out.printf("Nhập số nguyên:");
            number = Integer.parseInt(sc.nextLine());
            if (number%2 != 0) {
                sum += number;
            }
        }while (number!=0);
        System.out.printf("tổng các số lẻ "+ sum);
    }
}
