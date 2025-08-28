import java.util.PriorityQueue;

class offer2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(78);
        queue.offer(23);
        queue.offer(54);
        queue.offer(12);
        queue.offer(67);
        queue.offer(39);
        for(Integer next : queue) {
            System.out.println(next);
        }   
         System.out.println(queue);
    }
}
// 12
// 23
// 39
// 78
// 67
// 54
// [12, 23, 39, 78, 67, 54]