//Реализовать простой калькулятор
package Java_Seminars.sem1.Homework;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Выберите оператора(+,-,*,/): ");
        String operator = scanner.next();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int result = 0;
        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            
            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if(num2 == 0){
                    System.out.println("Ошибка, на 0 делить нельзя");
                    return;
                }
                result = num1 / num2;
                break;

        }
        System.out.println("Ответ = " + result);

    }
    
}
