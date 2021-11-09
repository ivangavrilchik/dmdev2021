/**Даны 3 переменные:
        - operand1 (double)
        - operand2 (double)
        - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
        Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
        Протестировать функцию в main.
        Например:
        Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
        Результат: 34.5 (24.4 + 10.1)
*/
package com.dmdev.homeworks.homework1;

public class Operand {
    public static void main(String[] args) {
        double operand1 = 100;
        double operand2 = 50;
        char operation = '%';
        double result = getResult(operand1, operand2, operation);
        System.out.println("Результат: "+result);

    }
    public static double getResult (double operand1, double operand2, char operation){
        double sum = operand1+operand2;
        double subtraction = operand1-operand2;
        double multiplication = operand1*operand2;
        double dividing = operand1/operand2;
        double percentage = (operand1/operand2)*100;

        if (operation == '+')
            return sum;

        if (operation == '-')
            return subtraction;

        if (operation == '*')
            return multiplication;

        if (operation == '/')
            return dividing;

        if (operation == '%')
            return percentage;

        return 0; // тут не правильно (нужно чтобы возвращало "не верная операция")
    }
}
