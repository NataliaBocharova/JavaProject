import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число:");
        int number = scanner.nextInt();

        System.out.println("Сумма цифр числа = " + getSumNumbers(number));

        System.out.println("Сумма нечетных цифр числа = " + getSumOddNumbers(number));

        System.out.println("Максимальная цифра числа = " + getMaxNumber(number));

    }
    public static int getSumNumbers(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int getSumOddNumbers(int number) {
        int sumOdd = 0;

        while (number > 0) {
            if (number % 2 == 1) {
                sumOdd += number % 10;
            }
            number /= 10;
        }
        return sumOdd;
    }

    public static int getMaxNumber(int number) {
        int max = 0;

        while (number >0) {
            if (number%10>max){
                max=number%10;
            }
            number /= 10;
        }
        return max;
    }
}
