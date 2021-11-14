package gavrilchik.level1.cycles.homework2;
/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int value = 12345;
        int reverseValue = getReverseValue(value);
        System.out.println(reverseValue);

    }

    public static int getReverseValue(int value) {

        int reverseInt = 0;
        int multiplier = 1;

        while (value != 0) {

            //получаем последнею текущую цифру
            int digit = value % 10;

            //умножаем  reverseInt на 10 и добавляем последнюю цифру
            reverseInt = (reverseInt * multiplier) + digit;

            multiplier = 10;
            value /= 10;
        }

        return reverseInt;
    }


}


