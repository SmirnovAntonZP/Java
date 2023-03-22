//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Java_Seminars.sem1.Homework;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int multiply = 1;
        for(int i = 1; i < number; i++) {
            while(i <= number){
                sum += i;
                multiply = multiply*i;
                i++;
            }
        }
        System.out.printf("Треугольное число = %d \n", sum);
        System.out.printf("Факториал числа %d = %d \n", number,multiply);
    }    
}


//Второй способ

// public class task_1 {

//     public static void main(String[] args) {
//         System.out.println("Введите число n для вычисления треугольного числа и факториала числа n: ");
//         Scanner iScanner = new Scanner(System.in); 
//         int n = iScanner.nextInt();
//         System.out.print(String.format(" треугольное число ", n));
//         System.out.println(triangle(n));
//         System.out.print(String.format("Факториал числа ", n));
//         System.out.println(factorial(n));
//         System.out.println(fact(n));
        
//         iScanner.close();
//     }

//     static int triangle (int n) {
//         int result = n*(n+1)/2;
//         return result;
//     } 

//     static int fact (int n) {
//         int i = 1;
//         int fact = 1;
//         while (i <= n){
//             fact *= i;
//             i += 1;
//         }
//         return fact;
//     }
    
//     static int factorial (int n) {
//         if(n==1)return 1;
//         return n * factorial(n-1);
//     }
// }
