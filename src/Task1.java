import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите свое число.. ");
    Integer number = scanner.nextInt();
    if (number %2 == 0) {
        System.out.print ( " число четное ");
    } else {
        System.out.print( " число нечетное ");
    }
}
}