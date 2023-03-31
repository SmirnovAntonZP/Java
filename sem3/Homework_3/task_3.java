// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
package Java_Seminars.sem3.Homework_3;


public class task_3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,15,23,4,8,97};
        for (int i = 0; i < array.length; i++) {
            // array[i] = Math.random();
        }

        int max = array[0];
        int min = array[0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }
        System.out.println(array);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}