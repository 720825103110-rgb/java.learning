import java.util.*;
class Student {
    String name;
    int age;
    int mark;

    Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Prarthana", 19, 90);

        s1.displayInfo();
    }
}
