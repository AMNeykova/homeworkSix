import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int myNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a myNum :" );
        myNum = scanner.nextInt();
        boolean even = myNum %2==0;
        String output = (myNum% 2 == 0) ? "even" : "odd";
        System.out.println(output);






    }
}
