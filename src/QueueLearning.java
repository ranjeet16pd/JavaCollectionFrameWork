import java.util.LinkedList;
import java.util.Queue;

public class QueueLearning {
    public static void main(String[] args){
        System.out.println("Queue Learning");

        Queue<Integer> q= new LinkedList<>();

        q.offer(19);
        q.offer(20);
        q.offer(21);
        q.offer(22);

        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.printf(String.valueOf(q.peek()));


        /*
          We can exchangly use

          offer -------> add (it throw exception)
          peek ------> element(it throw exception)
          poll ------> remove(it throw exception)
         */


    }
}
