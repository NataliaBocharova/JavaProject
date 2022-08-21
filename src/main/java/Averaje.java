import java.util.Scanner;

public class Averaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число диапазона:");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите последнее число диапазона:");
        int lastNumber = scanner.nextInt();

        double average = getAverage(firstNumber, lastNumber);

        System.out.println("Среднее арифметическое диапазона чисел = " + average);

        double averageEvenNumbers = getAverageEvenNumbers(firstNumber,lastNumber);

        System.out.println("Среднее арифметическое четных чисел диапазона = " + averageEvenNumbers);
    }

    public static double getAverage(int firstNumber, int lastNumber) {
        int sum = 0;
        int count = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }

    public static double getAverageEvenNumbers(int firstNumber, int lastNumber) {
        int sum = 0;
        int count = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        return (double) sum / count;
    }
}


