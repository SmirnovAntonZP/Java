// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

package Java_Seminars.sem1;

import java.util.Scanner;

public class task_1 {
   public static void main(String[] args) {
        System.out.print("Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.printf("Hello, " + text + "! \n");
        scanner.close();
   } 
}
