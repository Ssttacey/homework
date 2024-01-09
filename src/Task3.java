import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите ваше число..");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 10 & a <= 20){
            System.out.println(a *= a);
        } else {
            System.out.println( "Число выходит за рамки допустимых вариантов");
        }
    }
}
