import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("***********Breakfast Menu******");
            System.out.println("1. Phở tôm hùm");
            System.out.println("2. Phở bò Kobe");
            System.out.println("3. Phở gà Việt Nam");
            System.out.println("4. Xôi trứng thịt");
            System.out.println("5. Bánh mỳ trứng");
            System.out.println("6. Mỳ tôm không người lái");
            System.out.println("7. Thoát");
            System.out.println("lựa chọn: ");
            int luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    System.out.println("Bạn vừa chọn món Phở tôm hùm");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn món Phở bò Kobe");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn món Phở gà Việt Nam");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn món Xôi trứng thịt");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn món Bánh mỳ trứng");
                    break;
                case 6:
                    System.out.println("Bạn vừa chọn món Mỳ tôm không người lái");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui lòng nhập lại từ 1-7");
            }

        } while (true);
    }
}