/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список. 
 * Постараться не обращаться к листу по индексам.
 */

package Java_Seminars.sem4.Homework_4;
import java.util.LinkedList;
import java.util.Random;

public class Task_1 {





    public static void main(String[] args) {
        LinkedList<Object> linkedList = createLinkedList();
        
        System.out.println(linkedList);
        reversLinkedList(linkedList);
        System.out.println(linkedList);
    }
    public static LinkedList<Object> createLinkedList(){
        LinkedList<Object> linkedList = new LinkedList<>();
        Random random = new Random(10);
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0,10));
        }
        return linkedList;
    }
    public static void reversLinkedList(LinkedList<Object> linkedList){
        LinkedList<Object> array = new LinkedList<>();
        while (linkedList.size() > 0){
            array.add(linkedList.pollLast());
        }
        while (array.size() > 0){
            linkedList.add(array.pollFirst());
        }
    }
}

