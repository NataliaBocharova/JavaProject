import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя:");
        String name = scanner.nextLine();

        System.out.print("Введите отчество:");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию:");
        String familyName = scanner.nextLine();

        Person person = new Person(name,middleName,familyName);

        System.out.print("Введите Ваш возраст:");
        int age = scanner.nextInt();

        person.printPerson();
        person.birthYear(age);
    }
}
