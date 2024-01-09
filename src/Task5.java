import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите свое число.. ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for ( int i = 1; i <= a; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
