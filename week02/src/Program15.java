class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write Something");
    }

    public void printObj() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class Program15 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "green";
        pen2.type = "Ball";

        pen1.printObj();
        pen2.printObj();
    }
}
