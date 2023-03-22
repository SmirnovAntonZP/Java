//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

package Java_Seminars.sem1;

public class task_2 {
    public static void main(String[] args) {
        // int[] myArr;
        // myArr = new int[10];
        // int[] myArr = new int[10];

        // int[] myArr = new int[] {1,1,0,1,1,1};
        int[] myArr = {1,1,0,1,1,1,1,1,1,1,1};
        int count = 0;
        int max = 0;
        for(int i = 0; i < myArr.length;i++) {
            if(myArr[i] == 1){
                count ++;
                if(count > max) max = count;
            }else{
                count = 0;
            }
        }
        System.out.println("максимальное количество подряд идущих 1 = " + max);
    } 
}
