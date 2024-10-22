import java.util.Scanner;

public class MaxSumDigits {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSum = 0;
        int maxNumber = 0;

        System.out.println("Введите целые числа (введите 0 для завершения):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            int sum = sumOfDigits(number);

            if (sum > maxSum) {
                maxSum = sum;
                maxNumber = number;
            }
        }

        System.out.println("Число с максимальной суммой цифр: " + maxNumber);
        scanner.close();
    }
}