import java.util.Scanner;

public class _24_armstrong_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        boolean result = isArmstrong(num);

        if (result) {
            System.out.println("Your number is Armstrong.");
        } else {
            System.out.println("Your number is not Armstrong.");
        }

        input.close(); // ✅ Close scanner
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;  // store the original number
        int digits = noofDigits(num);
        int finalNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            finalNumber += pow(digit, digits);
        }

        return finalNumber == originalNum;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noofDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}

