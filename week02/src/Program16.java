class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String a, int b) {
        this.name = a;
        this.age = b;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

public class Program16 {
    public static void main(String[] args) {
        Student s1 = new Student("Siam", 21);
        Student s2 = new Student(s1);

        s1.printInfo();
        s2.printInfo();
    }
}
