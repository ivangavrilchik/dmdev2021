package gavrilchik.level1.cycles.homework2;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class OddEven {
    public static void main(String[] args) {
        int value = 123456789;
        int evenResult = countEven(value);
        int oddResult = countOdd(value);
        System.out.println("Количество четных цифр в числе " + value + " составляет " + evenResult);
        System.out.println("Количество нечетных цифр в числе " + value + " составляет " + oddResult);

    }

    public static int countEven(int value) {
        int even = 0;
        while (value >= 1) {
            int digit = value % 10;
            if (digit % 2 == 0) {
                even++;
            }
            value/=10;
        }

        return even;
    }

    public static int countOdd(int value) {
        int odd = 0;
        while (value >= 1) {
            int digit = value % 10;

            if (digit % 2 != 0) {
                odd++;
            }
            value/=10;
        }
        return odd;
    }
}






