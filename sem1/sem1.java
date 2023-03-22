package Java_Seminars.sem1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class sem1 {
    public static void main(String[] args) {
        System.out.println("Hello,world");
        System.out.println(LocalDateTime.now());
        System.out.printf("enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.printf("Inputed value: %d \n", value);
        scanner.close();
    }
    
}
