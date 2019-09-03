import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static boolean isPrime(int num){
        boolean check = true;
        if (num < 2){
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0){
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int a;
        int num = 1;
        boolean check;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần hiển thị: ");
        a = scanner.nextInt();
        for (int i = 1; i <= a;) {
            check = isPrime(num);
            if (check){
                System.out.println(i + " : " + num);
                i++;
            }
            num++;
        }
    }
}
