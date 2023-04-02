package Java_Seminars.sem4.Homework_4;
import java.util.LinkedList;

public class myQueue {
    private LinkedList<Integer> queue = new LinkedList<>();
    void enqueue(int item){
        // помещает элемент в конец очереди
        queue.addLast(item);
    }

    int dequeue(){
        // возвращает первый элемент из очереди и удаляет его
        if (queue.size() > 0){
            return queue.pollFirst();
        }else {
            throw new RuntimeException("Возможно, очередь пуста.");
        }
    }

    int first(){
        // возвращает первый элемент из очереди, не удаляя
        if (queue.size()>0){
            return queue.peekFirst();
        }else {
            throw new RuntimeException("Возможно, очередь пуста.");
        }
    }
}

