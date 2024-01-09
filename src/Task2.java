import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Human. What is the temperature outside? ");
        Integer t = scanner.nextInt();
        if (t > -5) {
            System.out.print("Oh, it's warm ");
        } else if (t <= -20) {
            System.out.print("Cold....  ");
        } else {
            System.out.print(" Normal ");
        }
    }
}
