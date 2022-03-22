import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num;
        System.out.println("Enter your num ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextFloat();
        System.out.printf("%.5f", Math.sqrt(num));



    }
}
