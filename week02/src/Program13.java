import java.util.Scanner;

public class Program13 {
    public static void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        printName(name);

        input.close();
    }
}
