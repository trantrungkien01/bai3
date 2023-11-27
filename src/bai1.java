public class bai1 {
    public static void main(String[] args) {
        int sum = 1;
        System.out.println(" các số chẵn trong khoảng 1-10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
            sum += i;

        }
        System.out.printf("\n tong các số chẵn là "+ sum);
    }
}