import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age < 18) {
            System.out.println("Immature");
        } else if (age > 18 && age <= 100) {
            System.out.println("Adult");
        } else {
            System.out.println("DEAD");
        }

        input.close();
    }
}
