import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("Иванов Иван Иванович", "89005556565", 20, 1, "КТ", 2022);
        students[1] = new Student("Петров Петр Петрович", "88005553535", 21, 2, "ИТ", 2023);
        students[2] = new Student("Сидоров Сидор Сидорович", "89906652545", 22, 3, "КТ", 2024);

        // ФИО и возраст всех студентов
        System.out.println("ФИО и возраст всех студентов:");
        for (Student student : students) {
            System.out.println(student.FIO + ", возраст: " + student.getAge());
        }

        // Список студентов заданного факультета
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите факультет: ");
        String facultet = sc.nextLine();
        System.out.println("Студенты факультета " + facultet + ":");
        for (Student student : students) {
            if (student.facultet.equals(facultet)) {
                System.out.println(student.FIO);
            }
        }

        // Список студентов, поступивших после заданного года
        System.out.print("Введите год поступления: ");
        int year = sc.nextInt();
        System.out.println("Студенты, поступившие после " + year + "года:");
        for (Student student : students) {
            if (student.getPostuplenie() > year) {
                System.out.println(student.FIO);
            }
        }
        sc.close();
    }
}
class Person {
    private int age;
    public String FIO;
    public String phone;

    public Person(String FIO, String phone, int age) {
        this.FIO = FIO;
        this.phone = phone;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class Student extends Person {
    public int curs;
    public String facultet;
    public int postuplenie;

    public Student(String FIO, String phone, int age, int curs, String facultet, int postuplenie) {
        super(FIO, phone, age);
        this.curs = curs;
        this.facultet = facultet;
        this.postuplenie = postuplenie;
    }
    public int getPostuplenie() {
        return postuplenie;
    }
}

