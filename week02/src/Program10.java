import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        float age2 = input.nextFloat();
        String b = input.next();

        System.out.println(age);
        System.out.println(age2);
        System.out.println(b);

        input.close();
    }
}
