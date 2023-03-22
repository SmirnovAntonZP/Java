//Вывести все простые числа от 1 до 1000
package Java_Seminars.sem1.Homework;

public class task_2 {
    public static void main(String[] args) {
        int n = 1000;
        for(int i = 2; i <= n; i++){
            boolean simple = false;
            for(int j = 2; j <= Math.sqrt(i); j++){
                simple = i%j==0;
                if(simple){
                    break;
                }
            }
            if(!simple) System.out.print(i + " ");
        }
        System.out.println();
    }
}
