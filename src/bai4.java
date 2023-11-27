import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.printf("Nhập các số nguyên: ");
             number = Integer.parseInt(sc.nextLine());
            if (number%3 == 0){
                System.out.printf(number+"  chia hết cho 3\n");
            }else {
                System.out.printf("không chia hết cho 3\n");
            }
        }while (number!=0);
    }
}
