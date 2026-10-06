import java.util.Arrays;

public class Program08 {
    public static void main(String[] args) {
        int[] marks = new int[4];

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
        marks[3] = 65;

        System.out.println(marks[0]);

        Arrays.sort(marks);

        System.out.println(marks[0]);
    }
}
