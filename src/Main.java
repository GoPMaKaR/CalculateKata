import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение. Пример: 2 + 1 или I + V");
        calc(scanner.nextLine());
    }


    public static String calc(String input) {

        RomeNumber.valueOf("I").toInt();
        RomeNumber.valueOf("II").toInt();
        RomeNumber.valueOf("III").toInt();
        RomeNumber.valueOf("IV").toInt();
        RomeNumber.valueOf("V").toInt();
        RomeNumber.valueOf("VI").toInt();
        RomeNumber.valueOf("VII").toInt();
        RomeNumber.valueOf("VIII").toInt();
        RomeNumber.valueOf("IX").toInt();


        try {
            int firstArg = Integer.parseInt(input.split(" ")[0]);
            int secondArg = Integer.parseInt(input.split(" ")[2]);
            char element = input.charAt(2);

            if ((firstArg >= 10) || (secondArg >= 10)) {
                System.out.println("Вы ввели число больше 10");
                System.exit(0);
            }


            if (element == '+') {
                int result = firstArg + secondArg;
                System.out.println(result);
            } else if (element == '/') {
                int result = firstArg / secondArg;
                System.out.println(result);
            } else if (element == '*') {
                int result = firstArg * secondArg;
                System.out.println(result);
            } else if (element == '-') {
                int result = firstArg - secondArg;
                System.out.println(result);
            } else {
                System.out.println("Попробуйте еще раз");
            }
        } catch (NumberFormatException eNumber) {
            System.out.println("Калькулятор не работает с дробными числами");
        }
        return input;
    }
}