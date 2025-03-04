import java.util.Scanner;

/**
 * - Считать потоком ввода три числа, введенных пользователем, и сохранить их в целочисленных переменных a, b и c
 * - Вывести на консоль переменные, значения которых делятся на 5 (вида: a=25, c=15), если нет ни одного значений, делящегося на 5, вывести строку: "нет значений, кратных 5"
 * - Вывести на консоль значение от целочисленного деления a на b (результат - целое число)
 * - Вывести на консоль значение от деления a на b (результат - число с плавающей запятой)
 * - Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону
 * - Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону
 * - Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением
 * - Вывести на консоль остаток от деления b на c
 * - Вывести на консоль наименьшее значение из a и b
 * - Вывести на консоль наибольшее значение из b и c
 */

public class mathematicalFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        System.out.print("Значения, кратные 5: ");
        if (a % 5 == 0) {
            System.out.print("a=" + a +" ");
        }
        if (b % 5 == 0) {
            System.out.print("b=" + b +" ");

        }
        if (c % 5 == 0) {
            System.out.print("c=" + c +" ");

        }
        else {System.out.print("нет значений, кратных 5");

        }

        System.out.println();

        System.out.println("Целочисленное деление a на b: " + (a / b));

        System.out.println("Деление a на b (с плавающей запятой): " + ((double) a / b));

        System.out.println("Деление a на b, округленное вверх: " + Math.ceil((double) a / b));

        System.out.println("Деление a на b, округленное вниз: " + Math.floor((double) a / b));

        System.out.println("Деление a на b, математическое округление: " + Math.round((double) a / b));

        System.out.println("Остаток от деления b на c: " + (b % c));

        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));

        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));

        scanner.close();
    }
}
