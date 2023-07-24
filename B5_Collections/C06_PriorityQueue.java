import java.util.PriorityQueue;


public class C06_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(224);
        pq.offer(566);
        pq.offer(443);
        pq.offer(102);
        pq.offer(678);
        System.out.println(pq);

        for(Integer i : pq){
            System.out.println(i);
        }

        System.out.println(pq.poll());
        System.out.println(pq.contains(102));        
        System.out.println(pq.contains(402));
        System.out.println(pq.isEmpty());
        System.out.println(pq.remove(224));
        System.out.println(pq);



        System.out.println("======================== String ========================");

        PriorityQueue<String> pqr = new PriorityQueue<>();
        pqr.offer("Apple");
        pqr.offer("Watermelon");
        pqr.offer("Banana");
        pqr.offer("Graphs");
        pqr.offer("Guava");
        pqr.offer("Banana");

        System.out.println(pqr);

        for(String i : pqr){
            System.out.println(i);
        }
    }
}
